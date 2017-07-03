package com.myqq.User;

import java.util.Date;

import user.User;

public class Tesst {
	public static void main(String[] args){
		User u=new User();
		u.setNickName("zhang");
		u.setPassWord("123");
		u.setGender("男");
		u.setRegistTime(new Date());
		u.setIntroduce("kongbai");
		
		UserServiceImpl use=new UserServiceImpl();
		boolean isRegist=UserServiceImpl.regist(u);
		if(isRegist){
			System.out.println("你注册成功");
		}
	}
}
