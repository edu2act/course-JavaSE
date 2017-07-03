package com.myqq.user.view;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import com.myqq.entity.User;
import com.myqq.user.service.UserServiceImpl;

public class BtnListenerone implements ActionListener {

	LoginFrame loginFrame;
	
	public BtnListenerone(LoginFrame loginFrame){
		this.loginFrame=loginFrame;
	}
	RegistFrame registFrame;
	public BtnListenerone(RegistFrame registFrame) {
		this.registFrame=registFrame;
	}
	
	public void actionPerformed(ActionEvent e) {
		String nickName=registFrame.txtNickName.getText();
		String password=new String(registFrame.txtPassword.getText());
		String gender=registFrame.txtGender.getText();
		String introduce=registFrame.txtIntroduce.getText();
		Date date=new Date();
		UserServiceImpl userServiceImpl=new UserServiceImpl();
		User u=new User();
		u.setNickName(nickName);
		u.setPassword(password);
		u.setGenDer(gender);
		u.setRegistTime(date);
		u.setIntorduce(introduce);
		u.setIp("127.0.0.1");
			boolean b=userServiceImpl.regist(u);
			if(b==true){
				System.out.println("注册成功");
				
			}
	}
}
