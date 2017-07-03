package com.myqq.User;

import user.User;

public class UserServiceImpl {
	public static boolean regist(User u){
		UserDaoImpl userDaoImpl=new UserDaoImpl();
		return userDaoImpl.saveUser(u);
	}
	public User login(int qqNum,String passWord){
		UserDaoImpl userDaoImpl1=new UserDaoImpl();
		return userDaoImpl1.findNameAndPassword(qqNum, passWord);
	}
}
