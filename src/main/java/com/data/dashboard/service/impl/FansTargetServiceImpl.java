/**
 * 
 */
package com.data.dashboard.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.data.dashboard.dao.FansTargetMapper;
import com.data.dashboard.entity.FansTarget;
import com.data.dashboard.service.FansTargetService;

/**
 * @author Nick
 * 
 * @Description
 *
 * @version 2018年4月14日 下午3:26:46
 *
 */
@Service
public class FansTargetServiceImpl implements FansTargetService {

	
	@Resource
	private FansTargetMapper fansTargetMapper;
	
	/*
	 *粉丝指标
	 */
	@Override
	public FansTarget queryFansTarget(String regionId) {
		
		List<FansTarget> list = fansTargetMapper.queryFansTarget(regionId);
		
		return list.get(0);
	}

	/*
	 *粉丝趋势
	 */
	@Override
	public List<FansTarget> queryFansTrend(Map<String, Object> params) {
		
		List<FansTarget> list = new ArrayList<FansTarget>();
		
		if("day".equals(params.get("dateCondition"))){
			list = fansTargetMapper.queryFansTrendDay();
		}else{
			list = fansTargetMapper.queryFansTrendMon();
		}
		
		Collections.reverse(list);
		
		return list;
	}

}
