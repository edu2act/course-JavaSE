package com.myqq.user.service;

import java.util.List;

import com.myqq.entity.User;
import com.myqq.user.dao.UserDaoImpl;

public class UserServiceImpl {

	public boolean regist(User u){
		UserDaoImpl userDaoImpl=new UserDaoImpl();
		return userDaoImpl.saveUser(u);
	}
	
	public User login(int qqNum, String password){
		UserDaoImpl userDaoImpl=new UserDaoImpl();
		return userDaoImpl.findByQqNumAndPassword(qqNum, password);
	}
	
	public List<User> listFriends(int qqNum){
		UserDaoImpl userDaoImpl=new UserDaoImpl();
		return userDaoImpl.findFriendByQqNum(qqNum);
	}
	
}
