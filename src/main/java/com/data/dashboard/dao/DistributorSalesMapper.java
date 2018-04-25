/**
 * 
 */
package com.data.dashboard.dao;

import java.util.List;
import java.util.Map;

import com.data.dashboard.entity.DistributorSales;

/**
 * @author Nick
 * 
 * @Description
 *
 * @version 2018年4月12日 下午3:02:40
 *
 */
public interface DistributorSalesMapper {
	
	List<DistributorSales> queryDistributorSales(Map<String, Object> params);

}
