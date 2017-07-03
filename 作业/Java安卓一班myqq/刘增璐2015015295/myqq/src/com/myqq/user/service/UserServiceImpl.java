package com.myqq.user.service;

import com.myqq.entity.User;
import com.myqq.user.dao.UserDaoImpl;

public class UserServiceImpl {

	public boolean regist(User u){
		UserDaoImpl userDaoImpl = new UserDaoImpl();
		return userDaoImpl.saveUser(u);
	}
}
