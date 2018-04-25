/**
 * 
 */
package com.data.dashboard.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.data.dashboard.dao.FansAnalysisMapper;
import com.data.dashboard.entity.FansAnalysis;
import com.data.dashboard.entity.MsgAnalysis;
import com.data.dashboard.service.FansAnalysisService;

/**
 * @author Nick
 * 
 * @Description
 *
 * @version 2018年4月16日 下午3:00:34
 *
 */

@Service
public class FansAnalysisServiceImpl implements FansAnalysisService {

	@Resource
	private FansAnalysisMapper fansAnalysisMapper;
	
	/*
 	 *办事处粉丝信息
	 */
	@Override
	public List<FansAnalysis> queryAgentFansInfo(Map<String, Object> params) {
		
		List<FansAnalysis> list = new ArrayList<FansAnalysis>();
		
		if("day".equals(params.get("dateCondition"))){
			list = fansAnalysisMapper.queryAgentFansInfoDay(params);
		}else{
			list = fansAnalysisMapper.queryAgentFansInfoMon(params);
		}
		return list;
	}

	/* 
	 * 经销商粉丝信息
	 */
	@Override
	public List<FansAnalysis> queryDistributorFansInfo(Map<String, Object> params) {
		
		List<FansAnalysis> list = disposeDataList(params,"distributor");
		
		return list;
	}
	
	
	private List<FansAnalysis> disposeDataList(Map<String, Object> params,String obj){
		
		List<FansAnalysis> list = new ArrayList<>();
		List<FansAnalysis> lists = new ArrayList<>();
		
		if("distributor".equals(obj)){
			if("day".equals(params.get("dateCondition"))){
				//前十
				params.put("sortCondition", "desc");
				list = fansAnalysisMapper.queryDistributorFansInfoDay(params);
				/*//后十
				params.put("sortCondition", "asc");
				lists = fansAnalysisMapper.queryDistributorFansInfoDay(params);*/
			}else if("month".equals(params.get("dateCondition"))){
				//前十
				params.put("sortCondition", "desc");
				list = fansAnalysisMapper.queryDistributorFansInfoMon(params);
				/*//后十
				params.put("sortCondition", "asc");
				lists = fansAnalysisMapper.queryDistributorFansInfoMon(params);*/
			}
		}
		
		/*Collections.reverse(lists);
		//合并列表
		list.addAll(lists);*/
		
		return list;
	}
	

}
