/**
 * 
 */
package com.data.dashboard.service;

import java.util.List;
import java.util.Map;

import com.data.dashboard.entity.MsgAnalysis;

/**
 * @author Nick
 * 
 * @Description
 *
 * @version 2018年4月13日 下午3:56:34
 *
 */
public interface MsgAnalysisService {
	Map<String,Object> queryAgentMsg(Map<String, Object> params);
	Map<String,Object> queryDistributorMsg(Map<String, Object> params);
}
