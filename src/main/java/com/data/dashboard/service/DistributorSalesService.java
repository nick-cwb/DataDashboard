/**
 * 
 */
package com.data.dashboard.service;

import java.util.List;
import java.util.Map;

import com.data.dashboard.entity.DistributorSales;

/**
 * @author Nick
 * 
 * @Description
 *
 * @version 2018年4月12日 下午5:09:44
 *
 */
public interface DistributorSalesService {
	
	List<DistributorSales> queryDistributorSales(Map<String, Object> params);

}
