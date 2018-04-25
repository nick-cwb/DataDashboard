/**
 * 
 */
package com.data.dashboard.entity;

/**
 * @author Nick
 * 
 * @Description
 *
 * @version 2018年4月11日 下午1:44:15
 *
 */
public class OauthInfo {
	
	private String accessToken;
	private String expiresIn;
	private String refreshToken;
	private String openId;
	private String scope;
	private String unionid;
	/**
	 * @return the accessToken
	 */
	public String getAccessToken() {
		return accessToken;
	}
	/**
	 * @param accessToken the accessToken to set
	 */
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	/**
	 * @return the expiresIn
	 */
	public String getExpiresIn() {
		return expiresIn;
	}
	/**
	 * @param expiresIn the expiresIn to set
	 */
	public void setExpiresIn(String expiresIn) {
		this.expiresIn = expiresIn;
	}
	/**
	 * @return the refreshToken
	 */
	public String getRefreshToken() {
		return refreshToken;
	}
	/**
	 * @param refreshToken the refreshToken to set
	 */
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
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
	 * @return the scope
	 */
	public String getScope() {
		return scope;
	}
	/**
	 * @param scope the scope to set
	 */
	public void setScope(String scope) {
		this.scope = scope;
	}
	/**
	 * @return the unionid
	 */
	public String getUnionid() {
		return unionid;
	}
	/**
	 * @param unionid the unionid to set
	 */
	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}
	/**
	 * @param accessToken
	 * @param expiresIn
	 * @param refreshToken
	 * @param openId
	 * @param scope
	 * @param unionid
	 */
	public OauthInfo(String accessToken, String expiresIn, String refreshToken, String openId, String scope,
			String unionid) {
		super();
		this.accessToken = accessToken;
		this.expiresIn = expiresIn;
		this.refreshToken = refreshToken;
		this.openId = openId;
		this.scope = scope;
		this.unionid = unionid;
	}
	/**
	 * 
	 */
	public OauthInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
