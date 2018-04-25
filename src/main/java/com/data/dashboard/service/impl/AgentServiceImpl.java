/**
 * 
 */
package com.data.dashboard.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.data.dashboard.dao.AgentMapper;
import com.data.dashboard.entity.Agent;
import com.data.dashboard.service.AgentService;

/**
 * @author Nick
 * 
 * @Description
 *
 * @version 2018年4月13日 上午10:53:12
 *
 */
@Service
public class AgentServiceImpl implements AgentService{
	
	@Resource
	private AgentMapper agentMapper;
	
	@Override
	public List queryAgentList() {
		
		List<Agent> list = agentMapper.queryAgentList();
		
		list.add(0, new Agent("0000001","全国","全国"));
		
		return list;
	}
	
	

}
