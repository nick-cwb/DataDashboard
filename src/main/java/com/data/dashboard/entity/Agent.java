/**
 * 
 */
package com.data.dashboard.entity;

/**
 * @author Nick
 * 
 * @Description
 *
 * @version 2018年4月13日 上午10:36:57
 *
 */
public class Agent {
	
	private String agentId;//办事处id
	private String agentName;//办事处名称
	private String agentAbbrName;//办事处名称缩写
	
	
	/**
	 * @return the agentId
	 */
	public String getAgentId() {
		return agentId;
	}
	/**
	 * @param agentId the agentId to set
	 */
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	/**
	 * @return the agentName
	 */
	public String getAgentName() {
		return agentName;
	}
	/**
	 * @param agentName the agentName to set
	 */
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	/**
	 * @return the agentAbbrName
	 */
	public String getAgentAbbrName() {
		return agentAbbrName;
	}
	/**
	 * @param agentAbbrName the agentAbbrName to set
	 */
	public void setAgentAbbrName(String agentAbbrName) {
		this.agentAbbrName = agentAbbrName;
	}
	/**
	 * @param agentId
	 * @param agentName
	 * @param agentAbbrName
	 */
	public Agent(String agentId, String agentName, String agentAbbrName) {
		super();
		this.agentId = agentId;
		this.agentName = agentName;
		this.agentAbbrName = agentAbbrName;
	}
	/**
	 * 
	 */
	public Agent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
