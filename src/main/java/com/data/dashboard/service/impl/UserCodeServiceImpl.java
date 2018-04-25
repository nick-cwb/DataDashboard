/**
 * 
 */
package com.data.dashboard.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.data.dashboard.dao.UserCodeMapper;
import com.data.dashboard.dao.UserMapper;
import com.data.dashboard.entity.User;
import com.data.dashboard.entity.UserCode;
import com.data.dashboard.service.UserCodeService;
import com.data.dashboard.util.ErrorConstant;
import com.data.dashboard.util.ResultConstant;

/**
 * @author Nick
 * 
 * @Description
 *
 * @version 2018年4月12日 上午10:23:45
 *
 */
@Service
public class UserCodeServiceImpl implements UserCodeService {


	
	@Resource
	private UserCodeMapper userCodeMapper;
	
	@Resource
	private UserMapper userMapper;


	@Override
	public UserCode fetchUserCode(UserCode userCode) {

		return userCodeMapper.fetchUserCode(userCode);
	}

	/*
	 * 绑定code
	 */
	@Override
	public Map<String, Object> bandCode(UserCode userCode) {
		
		Map<String,Object> resmap = new HashMap<String,Object>();
		Map<String,Object> resultData = new HashMap<String,Object>();
		Map<String,String> errorMap = new HashMap<String,String>();
		Map<String,String> resultMap = new HashMap<String,String>();
		
		UserCode userCodes = new UserCode();
		
		if(!"".equals(userCode.getUserCode())){
			userCodes = userCodeMapper.fetchUserCode(userCode);
		}
		
		//code码无效
		if(userCodes == null){
			resultMap.put("resultCode", ResultConstant.Fail);
			resultMap.put("resultMsg", ResultConstant.DESCFail);
			resmap.put("result", resultMap);
			
			errorMap.put("errorCode", ErrorConstant.NullCode);
			errorMap.put("errorMsg", ErrorConstant.DESCNullCode);
			resmap.put("error", errorMap);
			
			return resmap;
		}else if(!"".equals(userCodes.getUserId()) && null != userCodes.getUserId()){
			resultMap.put("resultCode", ResultConstant.Fail);
			resultMap.put("resultMsg", ResultConstant.DESCFail);
			resmap.put("result", resultMap);
			
			errorMap.put("errorCode", ErrorConstant.OccupiedCode);
			errorMap.put("errorMsg", ErrorConstant.DESCOccupiedCode);
			resmap.put("error", errorMap);
			
			return resmap;
		}
		
		//code码有效，绑定用户
		int flag = userCodeMapper.bandCode(userCode);
		int flags = userMapper.bandCode(userCode);
		
		User user = userMapper.fetchUserById(userCode.getUserId());
		
		resultData.put("userInfo", user);
		
		//put result 
		resultMap.put("resultCode", ResultConstant.Success);
		resultMap.put("resultMsg", ResultConstant.DESCSuccess);
		
		resmap.put("result", resultMap);
		resmap.put("resultData", resultData);
		
		return resmap;
	}

	/*
	 * 解绑code
	 */
	@Override
	public Map<String, Object> unBandCode(UserCode userCode) {
		Map<String,Object> resmap = new HashMap<String,Object>();
		Map<String,Object> resultData = new HashMap<String,Object>();
		Map<String,String> errorMap = new HashMap<String,String>();
		Map<String,String> resultMap = new HashMap<String,String>();

		
		UserCode userCode1 = new UserCode();
		userCode1.setUserId("");
		userCode1.setUserCode(userCode.getUserCode());
		int flag = userCodeMapper.bandCode(userCode1);
		UserCode userCode2 = new UserCode();
		userCode2.setUserCode("");
		userCode2.setUserId(userCode.getUserId());
		int flags = userMapper.bandCode(userCode2);
		
		User user = userMapper.fetchUserById(userCode.getUserId());
		
		resultData.put("userInfo", user);
		
		//put result 
		resultMap.put("resultCode", ResultConstant.Success);
		resultMap.put("resultMsg", ResultConstant.DESCSuccess);
		
		resmap.put("result", resultMap);
		resmap.put("resultData", resultData);
		
		return resmap;
	}

}
