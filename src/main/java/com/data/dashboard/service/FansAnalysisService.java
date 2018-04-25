/**
 * 
 */
package com.data.dashboard.service;

import java.util.List;
import java.util.Map;

import com.data.dashboard.entity.FansAnalysis;

/**
 * @author Nick
 * 
 * @Description
 *
 * @version 2018年4月16日 下午2:59:48
 *
 */
public interface FansAnalysisService {
	
	List<FansAnalysis> queryAgentFansInfo(Map<String, Object> params);
	
	List<FansAnalysis> queryDistributorFansInfo(Map<String, Object> params);

}
