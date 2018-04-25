package com.data.dashboard.entity;

/**
 * 
 * @author Nick
 * 
 * @Description 销售指标
 *
 * @version 2018年4月10日 上午11:16:09
 *
 */
public class SalesTarget {
	
	//年销售总额
	private String totalSalesYear;
	
	//月销售总额
	private String totalSalesMon;
	
	//日销售总额
	private String totalSalesDay;
		
	//累计订单量
	private String totalOrders;
	
	//平均客单价
	private String perCustomerTransaction;

	/**
	 * @return the totalSalesYear
	 */
	public String getTotalSalesYear() {
		return totalSalesYear;
	}

	/**
	 * @param totalSalesYear the totalSalesYear to set
	 */
	public void setTotalSalesYear(String totalSalesYear) {
		this.totalSalesYear = totalSalesYear;
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

	/**
	 * @return the totalOrders
	 */
	public String getTotalOrders() {
		return totalOrders;
	}

	/**
	 * @param totalOrders the totalOrders to set
	 */
	public void setTotalOrders(String totalOrders) {
		this.totalOrders = totalOrders;
	}

	/**
	 * @return the perCustomerTransaction
	 */
	public String getPerCustomerTransaction() {
		return perCustomerTransaction;
	}

	/**
	 * @param perCustomerTransaction the perCustomerTransaction to set
	 */
	public void setPerCustomerTransaction(String perCustomerTransaction) {
		this.perCustomerTransaction = perCustomerTransaction;
	}

	/**
	 * @param totalSalesYear
	 * @param totalSalesMon
	 * @param totalSalesDay
	 * @param totalOrders
	 * @param perCustomerTransaction
	 */
	public SalesTarget(String totalSalesYear, String totalSalesMon, String totalSalesDay, String totalOrders,
			String perCustomerTransaction) {
		super();
		this.totalSalesYear = totalSalesYear;
		this.totalSalesMon = totalSalesMon;
		this.totalSalesDay = totalSalesDay;
		this.totalOrders = totalOrders;
		this.perCustomerTransaction = perCustomerTransaction;
	}

	/**
	 * 
	 */
	public SalesTarget() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
