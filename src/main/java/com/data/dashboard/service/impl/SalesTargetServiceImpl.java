/**
 * 
 */
package com.data.dashboard.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.data.dashboard.dao.SalesTargetMapper;
import com.data.dashboard.entity.SalesTarget;
import com.data.dashboard.service.SalesTargetService;

/**
 * @author Nick
 * 
 * @Description
 *
 * @version 2018年4月10日 下午1:21:09
 *
 */

@Service
public class SalesTargetServiceImpl implements SalesTargetService {


	@Resource
	private SalesTargetMapper salesTargetMapper;
	
	@Override
	public SalesTarget getSalesTarget(String regionId) {

		List<SalesTarget> list = salesTargetMapper.getSalesTarget(regionId);
		return list.get(0);
	}

}
