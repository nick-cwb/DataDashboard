/**
 * 
 */
package com.data.dashboard.service;

import java.util.List;
import java.util.Map;

import com.data.dashboard.entity.FansTarget;

/**
 * @author Nick
 * 
 * @Description
 *
 * @version 2018年4月14日 下午3:15:17
 *
 */
public interface FansTargetService {
	
	FansTarget queryFansTarget(String regionId);
	List<FansTarget> queryFansTrend(Map<String, Object> params);

}
