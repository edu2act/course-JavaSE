package com.mychat.user.view;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import com.mychat.user.service.userServiceImpl;
import com.mychat.yp.user;

public class Test {

	public static void main(String[] args) {
		user u = new user();
		u.setNickName("monster");
		u.setPw("123");
		u.setRegistTime(new Date());
		u.setGender("男");																											
		u.setIntroduce("woshidie");
		u.setIp("127.0.0.1");
		
		/*user u1 = new user();
		u1.setNickName("zhang");
		u1.setPw("231");
		u1.setRegistTime(new Date());
		u1.setGender("女");
		u1.setIntroduce("hhhh");
		u1.setIp("127.0.0.1");*/
		userServiceImpl usi = new userServiceImpl();
		try {
			boolean b = usi.regist(u);
			if(b){
				System.out.println("注册成功");
			}
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		

	}

}
