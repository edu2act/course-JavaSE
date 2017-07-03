package com.myqq.user.view;


import java.util.Date;

import com.myqq.entity.User;
import com.myqq.user.service.UserServiceImpl;

public class Test {

	public static void main(String[] args) {
		User u = new User();
		u.setNickName("猎空");
		u.setPassword("123");
		u.setGender("男");
		u.setRegistTime(new Date());
		u.setIntroduce("456");
		u.setIp("127.0.0.1");
		
		UserServiceImpl userServiceImpl = new UserServiceImpl();
		
		boolean isRegist = userServiceImpl.regist(u);
		if (isRegist) {
			System.out.println("您注册成功！");
		}
	}

}

