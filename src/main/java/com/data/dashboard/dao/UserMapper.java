/**
 * 
 */
package com.data.dashboard.dao;

import com.data.dashboard.entity.User;
import com.data.dashboard.entity.UserCode;

/**
 * @author Nick
 * 
 * @Description
 *
 * @version 2018年4月11日 上午11:37:23
 *
 */
public interface UserMapper {
	
	User fetchUser(String openId);
	
	User fetchUserById(String userId);
	
	int addUser(User user);
	
	int updUser(User user);
	
	int checkUserExist(String openId);
	
	int bandCode(UserCode userCode);

}
