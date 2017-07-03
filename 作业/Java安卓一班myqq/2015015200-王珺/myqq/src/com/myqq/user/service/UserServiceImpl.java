package com.myqq.user.service;

import java.util.List;

import com.myqq.entity.Users;
import com.myqq.user.dao.UserDaoImpl;
import com.myqq.util.IpUtil;

public class UserServiceImpl {

	//service层不能出现java.sal层的东西
	//业务逻辑层
	
	public boolean regist(Users u) {
		UserDaoImpl userDaoImp1 = new UserDaoImpl();
		return userDaoImp1.saveUser(u);
	}
	
	
	public Users login(int qqNum, String password){
		UserDaoImpl userDaoImpl=new UserDaoImpl();
		Users u=userDaoImpl.findByQqNumAndPassword(qqNum, password);
		if(u!=null){
			String ip=IpUtil.getLocalHostAddress();
			userDaoImpl.updateIp(qqNum, ip);
			u.setIp(ip);
			return u;
		}else{
			return null;
		}
	}
	
	
	
	public List<Users> listFriends(int qqNum){
		UserDaoImpl userDaoImpl=new UserDaoImpl();
		return userDaoImpl.findFriendByQqNum(qqNum);
	}

	public Users listByQqNum(int qqNum){
		UserDaoImpl userDaoImpl=new UserDaoImpl();
		return userDaoImpl.getUser(qqNum);
	}
	
	
}

