package com.MYQQ.user.service;
import java.util.List;

import com.MYQQ.entity.user;
import com.MYQQ.user.dao.UserDaoImpl;
import com.MYQQ.util.IpUtil;
public class UserserviceImpl {
	public boolean regist(user u){
		UserDaoImpl userDaoImpl=new UserDaoImpl();
		return userDaoImpl.saveUser(u);
	}
	public user login(int qqNum, String password){
		UserDaoImpl userDaoImpl=new UserDaoImpl();
		user u=userDaoImpl.findByQqNumAndPassword(qqNum, password);
		if(u!=null){
			String ip=IpUtil.getLocalHostAddress();
			userDaoImpl.updateIp(qqNum, ip);
			return u;
		}else{
			return null;
		}
	}
	public List<user> listFriends(int qqNum){
		UserDaoImpl userDaoImpl=new UserDaoImpl();
		return userDaoImpl.findFriendByQqNum(qqNum);
	}
	public boolean updatePassword(int qqNum,String password){
		UserDaoImpl userDaoImpl=new UserDaoImpl();
		return userDaoImpl.updatePassword(qqNum, password);
	}
	public boolean deletuser(int qqNum,String password){
		UserDaoImpl userDaoImpl=new UserDaoImpl();
		return userDaoImpl.deletuser(qqNum, password);
	}
	public user listByQqNum(int qqNum){
		UserDaoImpl userDaoImpl=new UserDaoImpl();
		return userDaoImpl.getUser(qqNum);
	}
}
