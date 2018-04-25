/**
 * 
 */
package com.data.dashboard.service;

import java.util.List;
import java.util.Map;

import com.data.dashboard.entity.AgentSales;

/**
 * @author Nick
 * 
 * @Description
 *
 * @version 2018年4月12日 下午5:09:27
 *
 */
public interface AgentSalesService {
	//销售趋势
	List<AgentSales> querySalesTrend(Map<String, Object> params);
	//办事处销售情况
	List<AgentSales> queryAgentSales(Map<String, Object> params);
	//店铺数量
	String queryStoresNum();

}
