/**
 * 
 */
package com.data.dashboard.dao;

import java.util.List;
import java.util.Map;

import com.data.dashboard.entity.AgentSales;

/**
 * @author Nick
 * 
 * @Description
 *
 * @version 2018年4月12日 下午3:03:01
 *
 */
public interface AgentSalesMapper {
	
	List<AgentSales> querySalesTrend(Map<String, Object> params);
	List<AgentSales> querySalesTrendMon(Map<String, Object> params);
	List<AgentSales> queryAgentSales(Map<String, Object> params);
	String queryStoresNum();

}
