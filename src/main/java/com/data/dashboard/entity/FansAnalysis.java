/**
 * 
 */
package com.data.dashboard.entity;

/**
 * @author Nick
 * 
 * @Description
 *
 * @version 2018年4月16日 下午1:40:33
 *
 */
public class FansAnalysis {
	
	private String agentName;//办事处、经销商、店员名称
	private String newFans;//新增粉丝
	private String netIncreaseFans;//净增粉丝
	private String activeFans;//活跃粉丝
	private String date;//日期
	
	
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
	 * @return the newFans
	 */
	public String getNewFans() {
		return newFans;
	}
	/**
	 * @param newFans the newFans to set
	 */
	public void setNewFans(String newFans) {
		this.newFans = newFans;
	}
	/**
	 * @return the netIncreaseFans
	 */
	public String getNetIncreaseFans() {
		return netIncreaseFans;
	}
	/**
	 * @param netIncreaseFans the netIncreaseFans to set
	 */
	public void setNetIncreaseFans(String netIncreaseFans) {
		this.netIncreaseFans = netIncreaseFans;
	}
	/**
	 * @return the activeFans
	 */
	public String getActiveFans() {
		return activeFans;
	}
	/**
	 * @param activeFans the activeFans to set
	 */
	public void setActiveFans(String activeFans) {
		this.activeFans = activeFans;
	}
	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}
	
}
