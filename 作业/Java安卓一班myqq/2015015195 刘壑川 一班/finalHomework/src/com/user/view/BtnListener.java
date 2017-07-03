package com.user.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.bean.User;
import com.user.service.UserServiceImpl;
/** 监听者 */
public class BtnListener implements ActionListener {
	private LoginFrame loginFrame;
	private RegistFrame registFrame;
	public BtnListener(LoginFrame loginFrame){
		this.loginFrame = loginFrame;
	}
	public BtnListener(RegistFrame registFrame){
		this.registFrame = registFrame;
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("登录")){
			String qqNum = loginFrame.txtQQNum.getText();
			String password = new String(loginFrame.txtPassword.getPassword());
			UserServiceImpl userServiceImpl = new UserServiceImpl();
			User u = userServiceImpl.login(Integer.parseInt(qqNum),password);
			if(u != null){
				new MainFrame(u);
				loginFrame.dispose();
				loginFrame = null;
			}
		}else if(e.getActionCommand().equals("注册")){
			new RegistFrame();
			loginFrame.dispose();
			loginFrame = null;
		}else if(e.getActionCommand().equals("完成")){
			String qqNum = registFrame.txtQQNum.getText();
			String password = new String(registFrame.txtPassword.getPassword());
			UserServiceImpl userServiceImpl = new UserServiceImpl();
			if(userServiceImpl.registUser(Integer.parseInt(qqNum),password)){
				new LoginFrame();
				registFrame.dispose();
				registFrame = null;
			}
		}

	}

}
