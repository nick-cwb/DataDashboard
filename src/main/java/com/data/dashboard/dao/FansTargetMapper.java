/**
 * 
 */
package com.data.dashboard.dao;

import java.util.List;

import com.data.dashboard.entity.FansTarget;

/**
 * @author Nick
 * 
 * @Description
 *
 * @version 2018年4月14日 下午3:02:26
 *
 */
public interface FansTargetMapper {
	
	List<FansTarget> queryFansTarget(String regionId);
	List<FansTarget> queryFansTrendDay();
	List<FansTarget> queryFansTrendMon();

}
