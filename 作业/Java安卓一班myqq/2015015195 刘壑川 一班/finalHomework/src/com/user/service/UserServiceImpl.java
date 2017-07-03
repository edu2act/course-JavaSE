package com.user.service;

import java.util.List;

import com.bean.User;
import com.user.dao.UserDaoImpl;
import com.util.IpUtil;

public class UserServiceImpl {
	/** 用户登录  */
	public User login(int qqNum,String password){
		UserDaoImpl userDaoImpl = new UserDaoImpl();
		User u = userDaoImpl.findUserByQQNumAndPassword(qqNum, password);
		if(u != null){
			String ip = IpUtil.getLocalHostAddress();
			userDaoImpl.updateIp(qqNum, ip);
			u.setIp(ip);
			return u;
		}else{
			return null;
		}
		
	}
	/** 得到该用户 */
	public User findUserByQQNum(int qqNum){
		UserDaoImpl userDaoImpl=new UserDaoImpl();
		return userDaoImpl.getUser(qqNum);
	}
	/** 显示所有好友 */
	public List<User> listFriends(int qqNum) {
		UserDaoImpl userDaoImpl = new UserDaoImpl();
		return userDaoImpl.findAllFriends(qqNum);
	}
	/** 注册用户 */
	public boolean registUser(int qqNum,String password){
		UserDaoImpl userDaoImpl = new UserDaoImpl();
		return userDaoImpl.saveUser(qqNum, password);
	}
}
