/**
 * 
 */
package com.data.dashboard.entity;

/**
 * @author Nick
 * 
 * @Description 经销商销售
 *
 * @version 2018年4月12日 下午2:32:32
 *
 */
public class DistributorSales {
	//区域
	private String agentId;
	private String agentName;
	//经销商
	private String distributorId;
	private String distributorName;
	//年销售总额
	//private String totalSalesYear;
	//月销售总额
	private String totalSalesMon;
	//日销售总额
	private String totalSalesDay;
	//累计订单量
	//private String totalOrders;
	//日期
	//private String date;
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
	 * @return the distributorId
	 */
	public String getDistributorId() {
		return distributorId;
	}
	/**
	 * @param distributorId the distributorId to set
	 */
	public void setDistributorId(String distributorId) {
		this.distributorId = distributorId;
	}
	/**
	 * @return the distributorName
	 */
	public String getDistributorName() {
		return distributorName;
	}
	/**
	 * @param distributorName the distributorName to set
	 */
	public void setDistributorName(String distributorName) {
		this.distributorName = distributorName;
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
	
	
}
