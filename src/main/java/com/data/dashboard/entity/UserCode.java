/**
 * 
 */
package com.data.dashboard.entity;

import java.io.Serializable;

/**
 * @author Nick
 * 
 * @Description
 *
 * @version 2018年4月11日 下午2:52:57
 *
 */
public class UserCode implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userCode;
	private String userId;
	private String nickName;
	private String tel;
	private String sex;
	private String age;
	/**
	 * @return the userCode
	 */
	public String getUserCode() {
		return userCode;
	}
	/**
	 * @param userCode the userCode to set
	 */
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
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
	 * @return the tel
	 */
	public String getTel() {
		return tel;
	}
	/**
	 * @param tel the tel to set
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}
	/**
	 * @param userCode
	 * @param userId
	 * @param nickName
	 * @param tel
	 * @param sex
	 * @param age
	 */
	public UserCode(String userCode, String userId, String nickName, String tel, String sex, String age) {
		super();
		this.userCode = userCode;
		this.userId = userId;
		this.nickName = nickName;
		this.tel = tel;
		this.sex = sex;
		this.age = age;
	}
	/**
	 * 
	 */
	public UserCode() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param userCode
	 * @param userId
	 */
	public UserCode(String userCode, String userId) {
		super();
		this.userCode = userCode;
		this.userId = userId;
	}

	

}
