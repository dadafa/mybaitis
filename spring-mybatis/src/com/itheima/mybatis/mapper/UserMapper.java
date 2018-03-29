package com.itheima.mybatis.mapper;

import com.itheima.mybatis.bean.UserInfo;

public interface UserMapper {

	//通过name查询
	UserInfo findUserById(String username);
	
	//添加数据
	void insertUser(UserInfo u);
}

