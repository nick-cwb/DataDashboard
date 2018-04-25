/**
 * 
 */
package com.data.dashboard.dao;

import java.util.List;

import com.data.dashboard.entity.SalesTarget;

/**
 * @author Nick
 * 
 * @Description 销售概况
 *
 * @version 2018年4月10日 下午12:03:05
 *
 */
public interface SalesTargetMapper {
	
	List<SalesTarget> getSalesTarget(String regionId);

}
