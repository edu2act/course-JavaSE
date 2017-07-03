package com.GoChat.user.service;

import java.util.List;

import com.GoChat.entity.User;
import com.GoChat.user.dao.UserDaoImpl;
import com.GoChat.util.IpUtil;

public class UserServiceImpl {

	//业务逻辑层一般用biz或者service命名
	//不允许出现任何关于数据库的内容
	public boolean regist(User u){
		UserDaoImpl userDaoImpl=new UserDaoImpl();
		return userDaoImpl.saveUser(u);
	}
	
	public User login(int qqNum, String password){
		UserDaoImpl userDaoImpl=new UserDaoImpl();
		User u=userDaoImpl.fingQQNumAndPassword(qqNum, password);
		if(u!=null){
			String ip=IpUtil.getLocalHostAddress();
			userDaoImpl.updateIp(qqNum, ip);
			u.setIp(ip);
			return u;
		}else{
			return null;
		}
	}
	
	public List<User> listFriends(int qqNum){
		UserDaoImpl userDaoImpl=new UserDaoImpl();
		return userDaoImpl.findFriendByQQNum(qqNum);
	}
	
	public User listByQqNum(int qqNum){
		UserDaoImpl userDaoImpl=new UserDaoImpl();
		return userDaoImpl.getUser(qqNum);
	}
	
}
