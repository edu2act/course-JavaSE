package com.mychat.user.service;

import java.util.List;

import com.mychat.entity.User;
import com.mychat.user.dao.UserDaoImpl;
import com.mychat.util.IpUtil;

public class UserServiceImpl {
	public boolean regist(User u){
		UserDaoImpl userDaoImpl=new UserDaoImpl();
		return userDaoImpl.saveUser(u);
	}
	
	public User login(int myChatNum, String password){
		UserDaoImpl userDaoImpl=new UserDaoImpl();
		User u = userDaoImpl.findByChatNumAndPassword(myChatNum, password);

		if(u!=null){
			String ip=IpUtil.getLocalHostAddress();
			userDaoImpl.updateIp(myChatNum, ip);
			u.setIp(ip);
			return u;
		}else{
			return null;
		}
	}
	
	public List<User> listFriends(int myChatNum){
		UserDaoImpl userDaoImpl=new UserDaoImpl();
		return userDaoImpl.findFriendByChatNum(myChatNum);
	}
	

	public User listByChatNum(int chatNum){
		UserDaoImpl userDaoImpl = new UserDaoImpl();
		return userDaoImpl.getUser(chatNum);
	}
}
