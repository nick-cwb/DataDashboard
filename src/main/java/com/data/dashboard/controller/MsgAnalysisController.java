/**
 * 
 */
package com.data.dashboard.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.data.dashboard.service.MsgAnalysisService;
import com.data.dashboard.util.Constants;
import com.data.dashboard.util.ErrorConstant;
import com.data.dashboard.util.OperationCode;
import com.data.dashboard.util.ResultConstant;

import net.sf.json.JSONObject;

/**
 * @author Nick
 * 
 * @Description
 *
 * @version 2018年4月13日 下午4:13:15
 *
 */
@Controller
@RequestMapping(value="msg")
public class MsgAnalysisController {
	
	private static Logger logger = LoggerFactory.getLogger(MsgAnalysisController.class);
	
	@Resource
	private MsgAnalysisService msgAnalysisService;
	
	@RequestMapping(value="qm",method = RequestMethod.POST)  
	@ResponseBody
	public Map<String,Object> queryData(@RequestBody String requetObj){
		
		JSONObject jsonObj = JSONObject.fromObject(requetObj);
		
		Map<String,Object> resmap = new HashMap<String,Object>();
		Map<String,Object> conditionMap = new HashMap<String,Object>();
		Map<String,Object> resultData = new HashMap<String,Object>();
		Map<String,String> errorMap = new HashMap<String,String>();
		Map<String,String> resultMap = new HashMap<String,String>();
		
		String operationCode = jsonObj.getString("operationCode");
		String condition = jsonObj.getString("condition");
		String regionId = jsonObj.getString("regionId");
		
		conditionMap.put("regionId", regionId);
		conditionMap.put("condition", condition);
		//消息分析
		if(operationCode != null && operationCode.equals(OperationCode.QMT)){
			
			if(regionId.equals(Constants.AGENT_ID)){
				resultData = msgAnalysisService.queryAgentMsg(conditionMap);
			}else{
				resultData = msgAnalysisService.queryDistributorMsg(conditionMap);
			}
			//put result 
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

}
