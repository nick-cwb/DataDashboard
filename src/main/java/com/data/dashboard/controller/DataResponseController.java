/**
 * 
 */
package com.data.dashboard.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
//import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.data.dashboard.entity.Agent;
import com.data.dashboard.entity.OauthInfo;
import com.data.dashboard.entity.User;
import com.data.dashboard.entity.UserCode;
import com.data.dashboard.service.AgentService;
import com.data.dashboard.service.SalesTargetService;
import com.data.dashboard.service.UserCodeService;
import com.data.dashboard.service.UserService;
import com.data.dashboard.util.Constants;
import com.data.dashboard.util.ErrorConstant;
import com.data.dashboard.util.OperationCode;
import com.data.dashboard.util.ResultConstant;

import net.sf.json.JSONException;
import net.sf.json.JSONObject;

/**
 * @author Nick
 * 
 * @Description
 *
 * @version 2018年4月10日 下午1:24:45
 *
 */

@Controller
@RequestMapping(value="dataResponse")
public class DataResponseController {
	
	private static Logger logger = LoggerFactory.getLogger(DataResponseController.class);
	
	@Resource
	private SalesTargetService salesTargetService;	
	
	@Resource
	private UserService userService;
	
	@Resource
	private UserCodeService userCodeService;
	
	@Resource
	private AgentService agentService;
	
	/*
	 * 登录
	 */
	@RequestMapping(value="login",method = RequestMethod.POST)  
	@ResponseBody
	public Map<String,Object> login(@RequestBody String requetObj){ 
		
		JSONObject jsonObj = JSONObject.fromObject(requetObj);
		Map<String,Object> resmap = new HashMap<String,Object>();
		Map<String,Object> oauthInfoMap = new HashMap<String,Object>();
		List<Object> dataList = new ArrayList<Object>();
		Map<String,String> errorMap = new HashMap<String,String>();
		boolean flag = false;
		
		
		//获取前台传来的用户信息
		User user = new User();
		User userL = new User();
		user.setNickName(jsonObj.getString("nickName"));
		user.setJsCode(jsonObj.getString("jsCode"));
		user.setAvatarUrl(jsonObj.getString("avatarUrl"));
		user.setCity(jsonObj.getString("city"));
		user.setCountry(jsonObj.getString("country"));
		user.setProvince(jsonObj.getString("province"));
		user.setGender(jsonObj.getString("gender"));
		user.setLanguage(jsonObj.getString("language"));
		
		//调用api获取openid
		try {
			oauthInfoMap = getOauthInfo(jsonObj.getString("jsCode"));
		} catch (Exception e) {
			logger.error("[DataResponseController.login] exception",e);
			
			//put result 
			resmap.put("result", ResultConstant.Fail);
			errorMap.put(ErrorConstant.Exception, ErrorConstant.DESCException);
			resmap.put("errorCode", errorMap);
			
			return resmap;
		}
		
		OauthInfo oauthInfo = (OauthInfo) oauthInfoMap.get("oauthInfo");
		
		if(null == oauthInfo){
			
			resmap.put("result", ResultConstant.Fail);
			errorMap.put(ErrorConstant.Exception, ErrorConstant.DESCException);
			resmap.put("errorCode", errorMap);
			
			return resmap;
		}
		

		//从数据库中查取用户信息
		userL = userService.fetchUser(oauthInfo.getOpenId());
		user.setOpenId(oauthInfo.getOpenId());
		//数据库中并无该用户信息，注册新用户
		if(userL == null){
			//put result 
			
			flag = userService.addUser(user);
			
			if(flag){
				resmap.put("result", ResultConstant.Success);
			}else{
				resmap.put("result", ResultConstant.Fail);
				errorMap.put(ErrorConstant.Exception, ErrorConstant.DESCException);
				resmap.put("errorCode", errorMap);
			}
			dataList.add(user);
			resmap.put("dataList", dataList);
			
			return resmap;
		}else{
			//数据库有该用户，更新登录时间，登录次数
			
			flag = userService.updUser(userL);
			
			if(flag){
				resmap.put("result", ResultConstant.Success);
			}else{
				resmap.put("result", ResultConstant.Fail);
				errorMap.put(ErrorConstant.Exception, ErrorConstant.DESCException);
				resmap.put("errorCode", errorMap);
			}
			dataList.add(userL);
			resmap.put("dataList", dataList);
			
			return resmap;
		}
		
	}
	
	/*
	 * 获取区域范围
	 */
	@RequestMapping(value="region",method = RequestMethod.POST)  
	@ResponseBody
	public Map<String,Object> gerRegion(@RequestBody String requetObj){
		
		JSONObject jsonObj = JSONObject.fromObject(requetObj);
		
		Map<String,Object> resmap = new HashMap<String,Object>();
		Map<String,Object> resultData = new HashMap<String,Object>();
		Map<String,String> errorMap = new HashMap<String,String>();
		Map<String,String> resultMap = new HashMap<String,String>();
		
		String operationCode = jsonObj.getString("operationCode");
		
		if(operationCode != null && operationCode.equals(OperationCode.QDA)){
			List<Agent> list = agentService.queryAgentList();
			resultData.put("region", list);
			resultMap.put("resultCode", ResultConstant.Success);
			resultMap.put("resultMsg", ResultConstant.DESCSuccess);
			
			resmap.put("result", resultMap);
			resmap.put("resultData", resultData);
			
			return resmap;
		}
		
		resultMap.put("resultCode", ResultConstant.Fail);
		resultMap.put("resultMsg", ResultConstant.DESCFail);
		resmap.put("result", resultMap);
		
		errorMap.put("errorCode", ErrorConstant.WrongOperationCode);
		errorMap.put("errorMsg", ErrorConstant.DESCWrongOperationCode);
		resmap.put("error", errorMap);
		
		
		return resmap;
	}

	
	/*
	 * 用户绑定、解绑code
	 */
	@RequestMapping(value="code",method = RequestMethod.POST)  
	@ResponseBody
	public Map<String,Object> dealCode(@RequestBody String requetObj){ 
		
		
		JSONObject jsonObj = JSONObject.fromObject(requetObj);
		
		Map<String,Object> resmap = new HashMap<String,Object>();
		Map<String,String> errorMap = new HashMap<String,String>();
		Map<String,String> resultMap = new HashMap<String,String>();
		
		UserCode userCode = new UserCode();
		
		userCode.setUserId(jsonObj.getString("userId"));
		userCode.setUserCode(jsonObj.getString("userCode"));

		String operationCode = jsonObj.getString("operationCode");
		
		if(operationCode != null && operationCode.equals(OperationCode.BC)){
			resmap = userCodeService.bandCode(userCode);
			return resmap;
		}else if(operationCode != null && operationCode.equals(OperationCode.UBC)){
			resmap = userCodeService.unBandCode(userCode);
			return resmap;
		}
		resultMap.put("resultCode", ResultConstant.Fail);
		resultMap.put("resultMsg", ResultConstant.DESCFail);
		resmap.put("result", resultMap);
		
		errorMap.put("errorCode", ErrorConstant.WrongOperationCode);
		errorMap.put("errorMsg", ErrorConstant.DESCWrongOperationCode);
		resmap.put("error", errorMap);
		
		return resmap;
	}
	
	
	
	/*
	 * 调用官方api获取openID
	 */
	private Map<String,Object> getOauthInfo(String jsCode) throws Exception {
		 //构造HttpClient的实例
		  HttpClient httpClient = new DefaultHttpClient();
		  OauthInfo oauthInfo = new OauthInfo();
		  
		  Map<String,Object> resmap = new HashMap<String,Object>();

		  List<NameValuePair> params = new ArrayList<NameValuePair>();
		  params.add(new BasicNameValuePair("appid", Constants.APP_ID));
		  params.add(new BasicNameValuePair("secret", Constants.SECRET));
		  params.add(new BasicNameValuePair("grant_type", Constants.GRANT_TYPE));
		  params.add(new BasicNameValuePair("js_code", jsCode));

		  String urlParams = EntityUtils.toString(new UrlEncodedFormEntity(params, Consts.UTF_8));

		  //创建GET方法的实例
		  HttpGet httpGet = new HttpGet(Constants.OPEN_ID_URL + "?" + urlParams);

		  HttpResponse response = httpClient.execute(httpGet);
		  HttpEntity entity = response.getEntity();
		  String responseStr =  EntityUtils.toString(entity, "UTF-8");

		  JSONObject jsonObject = JSONObject.fromObject(responseStr);

		  if (null != jsonObject) {

	          try {
		        	  oauthInfo.setAccessToken(jsonObject.getString("session_key"));
		        	  //oauthInfo.setExpiresIn(jsonObject.getInt("expires_in")+"");
		        	  oauthInfo.setOpenId(jsonObject.getString("openid"));
	                
	                resmap.put("oauthInfo", oauthInfo);
	                
	                return resmap;
	          } catch (JSONException e) {
	        	  	oauthInfo = null;
	                // 获取token失败
	                logger.error("网页授权获取openId失败 errcode:{} errmsg:{}" + jsonObject
	                        .getString("errcode") + jsonObject.getString("errmsg"));
	          }
	        }
		  
		  	resmap.put("errcode", jsonObject.getString("errcode"));
		  	resmap.put("errmsg", jsonObject.getString("errmsg"));
		  
	        return resmap;
	}
	
	
}
