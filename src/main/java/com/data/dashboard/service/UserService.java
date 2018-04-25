/**
 * 
 */
package com.data.dashboard.service;

import com.data.dashboard.entity.User;

/**
 * @author Nick
 * 
 * @Description
 *
 * @version 2018年4月11日 下午3:52:59
 *
 */
public interface UserService {
	
	User fetchUser(String openId);
	
	Boolean addUser(User user);
	
	Boolean updUser(User user); 
	

}
