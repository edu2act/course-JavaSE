package com.myqq.user.view;

import java.util.Date;

import com.myqq.entity.User;
import com.myqq.user.service.UserServiceImpl;

public class Test {

	public static void main(String[] args) {
		UserServiceImpl userServiceImpl=new UserServiceImpl();
		User u=userServiceImpl.login(5, "123");
		System.out.println(u.getNickName());
//		User u=new User();
//		u.setNickName("monster");
//		u.setPassword("123");
//		u.setGender("男");
//		u.setRegistTime(new Date());
//		u.setIntroduce("456");
//		u.setIp("127.0.0.1");
//		
//		UserServiceImpl userServiceImpl=new UserServiceImpl();
//		boolean b=userServiceImpl.regist(u);
//		if(b)
//			System.out.println("注册成功");

	}

}
