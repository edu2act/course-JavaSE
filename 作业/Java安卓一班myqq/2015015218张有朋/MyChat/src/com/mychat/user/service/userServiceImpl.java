package com.mychat.user.service;

import java.sql.SQLException;
import java.util.List;

import com.mychat.yp.user;
import com.mychat.user.dao.UserDaoImpl;
import com.mychat.util.IpUtil;

public class userServiceImpl {

	public boolean regist(user u) throws SQLException{
		UserDaoImpl userDaoImpl=new UserDaoImpl();
		return userDaoImpl.saveUser(u);
	}
	
	public user login(int chatNum, String pw){
		UserDaoImpl userDaoImpl=new UserDaoImpl();
		user u=userDaoImpl.findByChatNumAndPassword(chatNum, pw);
		if(u!=null){
			String ip=IpUtil.getLocalHostAddress();
			userDaoImpl.updateIp(chatNum, ip);
			u.setIp(ip);
			return u;
		}else{
			return null;
		}
	}
	
	public List<user> listFriends(int qqNum){
		UserDaoImpl userDaoImpl=new UserDaoImpl();
		return userDaoImpl.findFriendByChatNum(qqNum);
	}
	
	public user listByChatNum(int qqNum){
		UserDaoImpl userDaoImpl=new UserDaoImpl();
		return userDaoImpl.getUser(qqNum);
	}
	
}
