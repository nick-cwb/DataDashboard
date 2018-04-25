/**
 * 
 */
package com.data.dashboard.dao;

import java.util.List;
import java.util.Map;

import com.data.dashboard.entity.FansAnalysis;

/**
 * @author Nick
 * 
 * @Description
 *
 * @version 2018年4月16日 下午2:18:19
 *
 */
public interface FansAnalysisMapper {
	
	List<FansAnalysis> queryAgentFansInfoDay(Map<String, Object> params);
	List<FansAnalysis> queryAgentFansInfoMon(Map<String, Object> params);
	List<FansAnalysis> queryDistributorFansInfoDay(Map<String, Object> params);
	List<FansAnalysis> queryDistributorFansInfoMon(Map<String, Object> params);

}
