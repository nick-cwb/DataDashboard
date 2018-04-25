/**
 * 
 */
package com.data.dashboard.dao;

import java.util.List;
import java.util.Map;

import com.data.dashboard.entity.MsgAnalysis;

/**
 * @author Nick
 * 
 * @Description
 *
 * @version 2018年4月13日 下午3:54:50
 *
 */
public interface MsgAnalysisMapper {
	
	List<MsgAnalysis> queryAgentMsg(Map<String, Object> params);
	List<MsgAnalysis> queryDistributorMsg(Map<String, Object> params);

}
