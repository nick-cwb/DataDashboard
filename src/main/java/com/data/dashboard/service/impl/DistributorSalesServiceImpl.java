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

import com.data.dashboard.dao.DistributorSalesMapper;
import com.data.dashboard.entity.DistributorSales;
import com.data.dashboard.service.DistributorSalesService;

/**
 * @author Nick
 * 
 * @Description
 *
 * @version 2018年4月12日 下午5:11:14
 *
 */

@Service
public class DistributorSalesServiceImpl implements DistributorSalesService {
	
	@Resource
	private DistributorSalesMapper distributorSalesMapper;

	@Override
	public List<DistributorSales> queryDistributorSales(Map<String, Object> params) {
		//查询前十个
		params.put("sort", "desc");
		List<DistributorSales> resultLlist = distributorSalesMapper.queryDistributorSales(params);
		/*//查询后十个
		params.put("sort", "asc");
		List<DistributorSales> resultLlists = distributorSalesMapper.queryDistributorSales(params);
		//后十个降序排列
		Collections.reverse(resultLlists);
		//合并列表
		resultLlist.addAll(resultLlists);*/
		
		return resultLlist;
	}

}
