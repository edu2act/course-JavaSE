package com.myqq.user.service;

import java.util.List;

import com.myqq.entity.User;
import com.myqq.user.dao.UserDaoImpl;
import com.myqq.util.IpUtil;

public class UserServiceImpl {

	
	public User login(int qqNum, String password){
		UserDaoImpl userDaoImpl=new UserDaoImpl();
		User u=userDaoImpl.findByQqNumAndPassword(qqNum, password);
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
		return userDaoImpl.findFriendByQqNum(qqNum);
	}
	
	public User listByQqNum(int qqNum){
		UserDaoImpl userDaoImpl=new UserDaoImpl();
		return userDaoImpl.getUser(qqNum);
	}
	public String saveUsers(User u){
		
		UserDaoImpl userDaoImpl=new UserDaoImpl();
		String qqnum=String.valueOf(userDaoImpl.saveUser(u));
		if(qqnum.equals("-1")){
			return "失败 ";
		}else{
			return qqnum;
		}
		
		
	}
	
}
