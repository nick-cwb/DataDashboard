/**
 * 
 */
package com.data.dashboard.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.data.dashboard.dao.UserMapper;
import com.data.dashboard.entity.User;
import com.data.dashboard.service.UserService;

/**
 * @author Nick
 * 
 * @Description
 *
 * @version 2018年4月17日 下午1:28:13
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:conf/spring-mvc.xml", "classpath:conf/spring-mybatis.xml" })
public class UserTest {
	
	
	@Resource
	private UserService userService;
	
	
	@Resource
	private UserMapper userMapper;
	
	
	 @Test
	    public void testConstants(){
		 
		 User user = userService.fetchUser("1");
		 
		 System.out.println("userName:+"+user.getNickName());
		 
	 }
	 
	 
	 @Test
	    public void testConstants1(){
		 
		 int num = userMapper.checkUserExist("1");
		 
		 System.out.println("num");
		 
	 }
	 
	 


}
