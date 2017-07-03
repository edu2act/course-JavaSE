package com.mychat.user.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.mychat.user.view.LoginFrame;
import com.mychat.yp.user;
import com.mychat.user.service.userServiceImpl;
import com.mychat.user.view.MainFrame;

public class BtnListener implements ActionListener {
	LoginFrame loginFrame;
	public BtnListener(LoginFrame loginFrame){
		this.loginFrame=loginFrame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自动生成的方法存根
		String chatNum=loginFrame.txtQqNum.getText();
		String pw=new String(loginFrame.txtPassword.getPassword());
		userServiceImpl userServiceImpl=new userServiceImpl();
		user u=userServiceImpl.login(Integer.parseInt(chatNum), pw);
		if(u!=null){
			MainFrame mf=new MainFrame(u);
			loginFrame.dispose();
			loginFrame=null;
		}
		
	}

}
