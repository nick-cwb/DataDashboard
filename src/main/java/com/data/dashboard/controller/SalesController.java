/**
 * 
 */
package com.data.dashboard.controller;

import java.util.ArrayList;
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

import com.data.dashboard.entity.Agent;
import com.data.dashboard.entity.AgentSales;
import com.data.dashboard.entity.DistributorSales;
import com.data.dashboard.entity.SalesTarget;
import com.data.dashboard.service.AgentSalesService;
import com.data.dashboard.service.AgentService;
import com.data.dashboard.service.DistributorSalesService;
import com.data.dashboard.service.SalesTargetService;
import com.data.dashboard.util.ErrorConstant;
import com.data.dashboard.util.OperationCode;
import com.data.dashboard.util.ResultConstant;

import net.sf.json.JSONObject;

/**
 * @author Nick
 * 
 * @Description
 *
 * @version 2018年4月12日 下午5:40:39
 *
 */

@Controller
@RequestMapping(value="sales")
public class SalesController {
	
	private static Logger logger = LoggerFactory.getLogger(SalesController.class);
	
	@Resource
	private SalesTargetService salesTargetService;	
	
	@Resource
	private AgentSalesService agentSalesService;
	
	@Resource
	private DistributorSalesService distributorSalesService;
	
	@RequestMapping(value="qs",method = RequestMethod.POST)  
	@ResponseBody
	public Map<String,Object> queryData(@RequestBody String requetObj){
		
		//JSONObject jsonObj = new JSONObject(requetObj);
		JSONObject jsonObj = JSONObject.fromObject(requetObj);
		
		Map<String,Object> resmap = new HashMap<String,Object>();
		Map<String,Object> conditionMap = new HashMap<String,Object>();
		Map<String,Object> resultData = new HashMap<String,Object>();
		Map<String,String> errorMap = new HashMap<String,String>();
		Map<String,String> resultMap = new HashMap<String,String>();
		
		String operationCode = jsonObj.getString("operationCode");
		
			
		//销售
		if(operationCode != null && operationCode.equals(OperationCode.QST)){
				
			String regionId = jsonObj.getString("regionId");
			String condition = jsonObj.getString("condition");
			String regionName = jsonObj.getString("regionName");
			conditionMap.put("condition", condition);
			conditionMap.put("regionId", regionId);
			conditionMap.put("regionName", regionName);
			
			//关键指标
			SalesTarget salesTarget = salesTargetService.getSalesTarget(regionId);
			
			//经销商
			List<DistributorSales> listD = distributorSalesService.queryDistributorSales(conditionMap);	
			//办事处
			List<AgentSales> listAS = agentSalesService.queryAgentSales(conditionMap);
			//趋势
			List<AgentSales> listST = agentSalesService.querySalesTrend(conditionMap);
			//门店数量
			String storesNum = agentSalesService.queryStoresNum();
			
			
			
			resultData.put("salesTarget", salesTarget);
			resultData.put("agentSales", listAS);
			resultData.put("salesTrend", listST);
			resultData.put("distributorSales", listD);
			resultData.put("storesNum", storesNum);
			
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
