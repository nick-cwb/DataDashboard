/**
 * 
 */
package com.data.dashboard.dao;

import com.data.dashboard.entity.UserCode;

/**
 * @author Nick
 * 
 * @Description
 *
 * @version 2018年4月12日 上午10:17:58
 *
 */
public interface UserCodeMapper {

	int bandCode(UserCode userCode);
	
	UserCode fetchUserCode(UserCode userCode);
}
