package com.mychat.user.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.mychat.entity.User;
import com.mychat.user.service.UserServiceImpl;
import com.mychat.user.view.LoginFrame;
import com.mychat.user.view.MainFrame;

public class BtnListener implements ActionListener {

	LoginFrame loginFrame;
	public BtnListener(LoginFrame loginFrame){
		this.loginFrame=loginFrame;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		String qqNum=loginFrame.txtMyChatNum.getText();
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
