package com.MYQQ.user.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import com.MYQQ.entity.user;
import com.MYQQ.user.service.UserserviceImpl;

public class btnListener implements ActionListener {

	LoginFrame loginFrame;
	public btnListener(LoginFrame loginFrame){
		this.loginFrame=loginFrame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String qqNum=loginFrame.txtQqNum.getText();
		String password=new String(loginFrame.txtPassword.getText());
		UserserviceImpl userServiceImpl=new UserserviceImpl();
		user u=userServiceImpl.login(Integer.parseInt(qqNum), password);
		if(u!=null){
			MainFrame mf=new MainFrame(u);
			loginFrame.dispose();
			loginFrame=null;
		}
	}
}
