/**
 * 
 */
package com.data.dashboard.entity;

/**
 * @author Nick
 * 
 * @Description 小程序用户
 *
 * @version 2018年4月11日 上午11:20:09
 *
 */
public class User {

	private String userId;
	private String openId;
	private String avatarUrl;
	private String city;
	private String country;
	private String firstLoginTime;
	private String gender;
	private String jsCode;
	private String language;
	private String lastLoginTime;
	private String loginCount;
	private String nickName;
	private String province;
	private String sessionKey;
	private String code;
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the openId
	 */
	public String getOpenId() {
		return openId;
	}
	/**
	 * @param openId the openId to set
	 */
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	/**
	 * @return the avatarUrl
	 */
	public String getAvatarUrl() {
		return avatarUrl;
	}
	/**
	 * @param avatarUrl the avatarUrl to set
	 */
	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the firstLoginTime
	 */
	public String getFirstLoginTime() {
		return firstLoginTime;
	}
	/**
	 * @param firstLoginTime the firstLoginTime to set
	 */
	public void setFirstLoginTime(String firstLoginTime) {
		this.firstLoginTime = firstLoginTime;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the jsCode
	 */
	public String getJsCode() {
		return jsCode;
	}
	/**
	 * @param jsCode the jsCode to set
	 */
	public void setJsCode(String jsCode) {
		this.jsCode = jsCode;
	}
	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}
	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	/**
	 * @return the lastLoginTime
	 */
	public String getLastLoginTime() {
		return lastLoginTime;
	}
	/**
	 * @param lastLoginTime the lastLoginTime to set
	 */
	public void setLastLoginTime(String lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	/**
	 * @return the loginCount
	 */
	public String getLoginCount() {
		return loginCount;
	}
	/**
	 * @param loginCount the loginCount to set
	 */
	public void setLoginCount(String loginCount) {
		this.loginCount = loginCount;
	}
	/**
	 * @return the nickName
	 */
	public String getNickName() {
		return nickName;
	}
	/**
	 * @param nickName the nickName to set
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	/**
	 * @return the province
	 */
	public String getProvince() {
		return province;
	}
	/**
	 * @param province the province to set
	 */
	public void setProvince(String province) {
		this.province = province;
	}
	/**
	 * @return the sessionKey
	 */
	public String getSessionKey() {
		return sessionKey;
	}
	/**
	 * @param sessionKey the sessionKey to set
	 */
	public void setSessionKey(String sessionKey) {
		this.sessionKey = sessionKey;
	}
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @param userId
	 * @param openId
	 * @param avatarUrl
	 * @param city
	 * @param country
	 * @param firstLoginTime
	 * @param gender
	 * @param jsCode
	 * @param language
	 * @param lastLoginTime
	 * @param loginCount
	 * @param nickName
	 * @param province
	 * @param sessionKey
	 * @param code
	 */
	public User(String userId, String openId, String avatarUrl, String city, String country, String firstLoginTime,
			String gender, String jsCode, String language, String lastLoginTime, String loginCount, String nickName,
			String province, String sessionKey, String code) {
		super();
		this.userId = userId;
		this.openId = openId;
		this.avatarUrl = avatarUrl;
		this.city = city;
		this.country = country;
		this.firstLoginTime = firstLoginTime;
		this.gender = gender;
		this.jsCode = jsCode;
		this.language = language;
		this.lastLoginTime = lastLoginTime;
		this.loginCount = loginCount;
		this.nickName = nickName;
		this.province = province;
		this.sessionKey = sessionKey;
		this.code = code;
	}
	/**
	 * 
	 */
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
