/**
 * 
 */
package com.data.dashboard.entity;

/**
 * @author Nick
 * 
 * @Description 办事处销售
 *
 * @version 2018年4月12日 上午11:39:37
 *
 */
public class AgentSales {
	//区域
	private String agentId;
	private String agentName;
	//年销售总额
	//private String totalSalesYear;
	//月销售总额
	private String totalSalesMon;
	//上月销售总额
	private String totalSalesLastMon;
	//日销售总额
	private String totalSalesDay;
	//累计订单量
	//private String totalOrders;
	//日期
	private String date;
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
	 * @return the totalSalesMon
	 */
	public String getTotalSalesMon() {
		return totalSalesMon;
	}
	/**
	 * @param totalSalesMon the totalSalesMon to set
	 */
	public void setTotalSalesMon(String totalSalesMon) {
		this.totalSalesMon = totalSalesMon;
	}
	/**
	 * @return the totalSalesLastMon
	 */
	public String getTotalSalesLastMon() {
		return totalSalesLastMon;
	}
	/**
	 * @param totalSalesLastMon the totalSalesLastMon to set
	 */
	public void setTotalSalesLastMon(String totalSalesLastMon) {
		this.totalSalesLastMon = totalSalesLastMon;
	}
	/**
	 * @return the totalSalesDay
	 */
	public String getTotalSalesDay() {
		return totalSalesDay;
	}
	/**
	 * @param totalSalesDay the totalSalesDay to set
	 */
	public void setTotalSalesDay(String totalSalesDay) {
		this.totalSalesDay = totalSalesDay;
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
