/**
 * 
 */
package com.data.dashboard.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.data.dashboard.dao.AgentSalesMapper;
import com.data.dashboard.entity.AgentSales;
import com.data.dashboard.service.AgentSalesService;

/**
 * @author Nick
 * 
 * @Description
 *
 * @version 2018年4月12日 下午5:10:47
 *
 */
@Service
public class AgentSalesServiceImpl implements AgentSalesService {

	@Resource
	private AgentSalesMapper agentSalesMapper;
	
	@Override
	public List<AgentSales> querySalesTrend(Map<String, Object> params) {
		
		String condition = (String) params.get("condition");
		
		List<AgentSales> list = new ArrayList<AgentSales>();
		
		if(condition.equals("day")){
			list = agentSalesMapper.querySalesTrend(params);
			
			Collections.reverse(list);
		}else if(condition.equals("month")){
			list = agentSalesMapper.querySalesTrendMon(params);
		}
		
		return list;
	}

	@Override
	public List<AgentSales> queryAgentSales(Map<String, Object> params) {

		List<AgentSales> list = agentSalesMapper.queryAgentSales(params);
		
		return list;
	}

	@Override
	public String queryStoresNum() {
		return agentSalesMapper.queryStoresNum();
	}

}
