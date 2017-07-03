package com.myqq.user.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.myqq.entity.User;
import com.myqq.user.service.UserServiceImpl;

public class BtnListener implements ActionListener {

	LoginFrame loginFrame;
	public BtnListener(LoginFrame loginFrame){
		this.loginFrame=loginFrame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String qqNum=loginFrame.txtQqNum.getText();
		String password=new String(loginFrame.txtPassword.getPassword());
		UserServiceImpl userServiceImpl=new UserServiceImpl();
		User u=userServiceImpl.login(Integer.parseInt(qqNum), password);
		if(u!=null){
			MainFrame mf=new MainFrame(u);
			loginFrame.dispose();
			loginFrame=null;
		}
	}

}
