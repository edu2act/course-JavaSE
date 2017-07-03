package com.MyQQ.user.service;

import java.util.List;

import com.MyQQ.entity.User;
import com.MyQQ.user.dao.UserDaoImpl;
import com.MyQQ.util.IpUtil;

public class UserServiceImpl {
//在业务逻辑层 不能出现任何java.sql数据库的东西
	//实现注册方法
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
			u.setIP(ip);
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
