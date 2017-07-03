package com.myqq.user.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import com.myqq.entity.User;
import com.myqq.user.service.UserServiceImpl;

public class BtnListener implements ActionListener {

	LoginFrame loginFrame;
	
	public BtnListener(LoginFrame loginFrame){
		this.loginFrame=loginFrame;
	}
	public void actionPerformed(ActionEvent e) {
		String qqNum=loginFrame.txtQqNum.getText();
		String password1=new String(loginFrame.txtPassword.getPassword());
		UserServiceImpl userServiceImpl=new UserServiceImpl();
		User u=userServiceImpl.login(Integer.parseInt(qqNum), password1);
		if(u!=null){
			MainFrame mf=new MainFrame(u);
			loginFrame.dispose();
			loginFrame=null;
		}
	}
	
			
		}




