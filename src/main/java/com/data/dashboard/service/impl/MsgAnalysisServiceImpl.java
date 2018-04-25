/**
 * 
 */
package com.data.dashboard.service.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.data.dashboard.dao.MsgAnalysisMapper;
import com.data.dashboard.entity.MsgAnalysis;
import com.data.dashboard.service.MsgAnalysisService;

/**
 * @author Nick
 * 
 * @Description 消息分析
 *
 * @version 2018年4月13日 下午3:58:31
 *
 */
@Service
public class MsgAnalysisServiceImpl implements MsgAnalysisService {

	@Resource
	private MsgAnalysisMapper msgAnalysisMapper;
	
	/*
	 * 根据不同条件排序返回办事处的消息分析情况
	 */
	@Override
	public Map<String, Object> queryAgentMsg(Map<String, Object> params) {

		Map<String,Object> resultData = new HashMap<String,Object>();
		//未响应次数
		params.put("sort","wxycs");
		List<MsgAnalysis> list1 = msgAnalysisMapper.queryAgentMsg(params);
		//平均响应时间
		params.put("sort","pjxysj");
		List<MsgAnalysis> list2 = msgAnalysisMapper.queryAgentMsg(params);
		//分数
		params.put("sort","jl_bf");
		List<MsgAnalysis> list3 = msgAnalysisMapper.queryAgentMsg(params);
		
		resultData.put("unresponsiveTimes", list1);
		resultData.put("avgResponseTime", list2);
		resultData.put("score", list3);

		return resultData;
	}


	@Override
	public Map<String, Object> queryDistributorMsg(Map<String, Object> params) {
		
		Map<String,Object> resultData = new HashMap<String,Object>();
		
		
		
		List<MsgAnalysis> list1 = queryDistributorMsgBySort(params,"wxycs");
		List<MsgAnalysis> list2 = queryDistributorMsgBySort(params,"pjxysj");
		List<MsgAnalysis> list3 = queryDistributorMsgBySort(params,"jl_bf");
		
		resultData.put("unresponsiveTimes", list1);
		resultData.put("avgResponseTime", list2);
		resultData.put("score", list3);
		
		return resultData;
	}
	
	private List<MsgAnalysis> queryDistributorMsgBySort(Map<String, Object> params,String sort){
		
		//未响应次数前十
		params.put("sortCondition", "desc");
		params.put("sort",sort);
		//前十
		List<MsgAnalysis> list = msgAnalysisMapper.queryDistributorMsg(params);
		/*//后十
		params.put("sortCondition", "asc");
		List<MsgAnalysis> lists = msgAnalysisMapper.queryDistributorMsg(params);
		//后十个降序排列
		Collections.reverse(lists);
		//合并列表
		list.addAll(lists);*/
		
		return list;
	}

}
