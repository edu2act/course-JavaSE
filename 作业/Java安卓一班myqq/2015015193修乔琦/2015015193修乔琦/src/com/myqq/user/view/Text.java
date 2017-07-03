package com.myqq.user.view;


import java.util.Date;

import com.myqq.entity.User;

import com.myqq.user.service.UserServiceImpl;

public class Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//UserServiceImpl usi=new UserServiceImpl();
		User us=new User();
		UserServiceImpl usi=new UserServiceImpl();
		us.setGender("男");
		us.setNickName("haha");
		us.setIp("127.0.0.1");
		us.setPassword("1234");
		us.setRegistTime(new Date());
		us.setIntroduce("1234567965");
		boolean b=usi.regist(us);
		if(b){
			System.out.println("注册成功");
		}
	}

}
