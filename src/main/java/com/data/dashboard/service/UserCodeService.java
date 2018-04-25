/**
 * 
 */
package com.data.dashboard.service;

import java.util.Map;

import com.data.dashboard.entity.UserCode;

/**
 * @author Nick
 * 
 * @Description
 *
 * @version 2018年4月12日 上午10:18:58
 *
 */
public interface UserCodeService {
	

	Map<String,Object> bandCode(UserCode userCode);
	
	Map<String,Object> unBandCode(UserCode userCode);
	
	UserCode fetchUserCode(UserCode userCode);

}
