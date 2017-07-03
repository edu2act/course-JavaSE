package com.myqq.user.service;

import java.util.List;

import com.myqq.entity.User;
import com.myqq.user.dao.UserDaoImpl;

public class UserServiceImpl {
	public boolean regist(User U){
		UserDaoImpl userDaoImpl=new UserDaoImpl();
		return userDaoImpl.saveUser(U);
	
}
	public User login(int qqnum,String password){
		UserDaoImpl userDaoImpl=new UserDaoImpl();
		return userDaoImpl.findByNumberAndPassword(qqnum, password);
	}
	public List<User> listFriends(int qqnum) {
		UserDaoImpl userDaoImpl=new UserDaoImpl();
		return userDaoImpl.findFriendByQqNum(qqnum);
	}
	public User listByQqNum(int qqNum) {
		UserDaoImpl userDaoImpl=new UserDaoImpl();
		return userDaoImpl.getUser(qqNum);
	}
}
