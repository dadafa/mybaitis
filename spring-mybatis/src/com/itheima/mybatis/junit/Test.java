package com.itheima.mybatis.junit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.mybatis.bean.UserInfo;
import com.itheima.mybatis.mapper.UserMapper;

public class Test {

	@org.junit.Test
	public void testname() throws Exception {

		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

		UserMapper bean = (UserMapper) ac.getBean("userMapper");

		UserInfo ps = bean.findUserById("aaa");

		System.out.println(ps.getPassword());
	}

	@org.junit.Test
	public void testInsert() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserMapper bean = ac.getBean(UserMapper.class);
		
		UserInfo info = new UserInfo();
		info.setUsername("腊肠狗01");
		info.setPassword("789789123");
		info.setEmail("456@com");
		
		bean.insertUser(info);
		
		
	}

}
