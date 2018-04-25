/**
 * 
 */
package com.data.dashboard.entity;

/**
 * @author Nick
 * 
 * @Description 消息分析
 *
 * @version 2018年4月13日 下午2:53:31
 *
 */
public class MsgAnalysis {
	
	private String regionName;//办事处或经销商
	private String unresponsiveTimes;//未响应次数
	private String avgResponseTime;//平均响应时间
	private String score;//分值
	/**
	 * @return the regionName
	 */
	public String getRegionName() {
		return regionName;
	}
	/**
	 * @param regionName the regionName to set
	 */
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	/**
	 * @return the unresponsiveTimes
	 */
	public String getUnresponsiveTimes() {
		return unresponsiveTimes;
	}
	/**
	 * @param unresponsiveTimes the unresponsiveTimes to set
	 */
	public void setUnresponsiveTimes(String unresponsiveTimes) {
		this.unresponsiveTimes = unresponsiveTimes;
	}
	/**
	 * @return the avgResponseTime
	 */
	public String getAvgResponseTime() {
		return avgResponseTime;
	}
	/**
	 * @param avgResponseTime the avgResponseTime to set
	 */
	public void setAvgResponseTime(String avgResponseTime) {
		this.avgResponseTime = avgResponseTime;
	}
	/**
	 * @return the score
	 */
	public String getScore() {
		return score;
	}
	/**
	 * @param score the score to set
	 */
	public void setScore(String score) {
		this.score = score;
	}

}
