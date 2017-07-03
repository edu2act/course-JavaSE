package com.myqq.user.view.login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.myqq.entity.User;
import com.myqq.user.service.UserServiceImpl;
import com.myqq.user.view.MainFrame;
import com.myqq.user.view.register.RegisterFrame;

public class LoginBtnListener implements ActionListener {

	LoginFrame loginFrame;
	public LoginBtnListener(LoginFrame loginFrame){
		this.loginFrame=loginFrame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == loginFrame.btnLogin){
			String qqNum=loginFrame.txtQqNum.getText();
			String password=new String(loginFrame.txtPassword.getPassword());
			UserServiceImpl userServiceImpl=new UserServiceImpl();
			User u=userServiceImpl.login(Integer.parseInt(qqNum), password);
			if(u!=null){
				MainFrame mf=new MainFrame(u);
				loginFrame.dispose();
				loginFrame=null;
			}
		}else if(e.getSource() == loginFrame.btnRegister){
			RegisterFrame registerFrame = new RegisterFrame();
		}
	}

}
