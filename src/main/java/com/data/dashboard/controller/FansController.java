/**
 * 
 */
package com.data.dashboard.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.data.dashboard.entity.FansAnalysis;
import com.data.dashboard.entity.FansTarget;
import com.data.dashboard.service.FansAnalysisService;
import com.data.dashboard.service.FansTargetService;
import com.data.dashboard.util.ErrorConstant;
import com.data.dashboard.util.OperationCode;
import com.data.dashboard.util.ResultConstant;

import net.sf.json.JSONObject;

/**
 * @author Nick
 * 
 * @Description
 *
 * @version 2018年4月16日 上午11:44:43
 *
 */
@Controller
@RequestMapping(value="fans")
public class FansController {
	
	private static Logger logger = LoggerFactory.getLogger(FansController.class);
	
	@Resource
	private FansTargetService fansTargetService;
	
	@Resource
	private FansAnalysisService fansAnalysisService;
	
	@RequestMapping(value="qf",method = RequestMethod.POST)  
	@ResponseBody
	public Map<String,Object> queryData(@RequestBody String requetObj){
		
		
		JSONObject jsonObj = JSONObject.fromObject(requetObj);
		
		Map<String,Object> resmap = new HashMap<String,Object>();
		Map<String,Object> conditionMap = new HashMap<String,Object>();
		Map<String,Object> resultData = new HashMap<String,Object>();
		Map<String,String> errorMap = new HashMap<String,String>();
		Map<String,String> resultMap = new HashMap<String,String>();

		String operationCode = jsonObj.getString("operationCode");
		
		
		//粉丝
		if(operationCode != null && operationCode.equals(OperationCode.QFT)){
			
			String regionId = jsonObj.getString("regionId");
			String condition = jsonObj.getString("condition");
			String dateCondition = jsonObj.getString("dateCondition");
			conditionMap.put("condition", condition);
			conditionMap.put("regionId", regionId);
			conditionMap.put("dateCondition", dateCondition);
			
			
			//关键指标
			FansTarget fansTarget = fansTargetService.queryFansTarget(regionId);
			//粉丝趋势
			List<FansTarget> listT = fansTargetService.queryFansTrend(conditionMap);
			//办事处信息
			List<FansAnalysis> listA = fansAnalysisService.queryAgentFansInfo(conditionMap);
			//经销商信息
			List<FansAnalysis> listD = fansAnalysisService.queryDistributorFansInfo(conditionMap);
			
			resultData.put("fansTarget", fansTarget);
			resultData.put("fansTrend", listT);
			resultData.put("agentFansInfo", listA);
			resultData.put("distributorFansInfo", listD);
			
			
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
