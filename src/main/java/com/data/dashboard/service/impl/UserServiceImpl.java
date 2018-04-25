/**
 * 
 */
package com.data.dashboard.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.data.dashboard.dao.UserMapper;
import com.data.dashboard.entity.User;
import com.data.dashboard.service.UserService;
import com.data.dashboard.util.Utils;

/**
 * @author Nick
 * 
 * @Description
 *
 * @version 2018年4月11日 下午3:53:43
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;
	
	@Override
	public User fetchUser(String openId) {
		User user = userMapper.fetchUser(openId);
		return user;
	}

	@Override
	public Boolean addUser(User user) {
		
		user.setUserId(Utils.getUUID());
		user.setFirstLoginTime(Utils.getCurrentTime());
		user.setLoginCount("1");
		if(userMapper.addUser(user)>0){
            return true;
        }else{
            return false;
        }
	}

	@Override
	public Boolean updUser(User user) {
		
		int loginCount = Integer.parseInt(user.getLoginCount())+1;
		
		user.setLastLoginTime(Utils.getCurrentTime());
		user.setLoginCount(loginCount+"");
		
		if(userMapper.updUser(user)>0){
            return true;
        }else{
            return false;
        }
	}
	

}
