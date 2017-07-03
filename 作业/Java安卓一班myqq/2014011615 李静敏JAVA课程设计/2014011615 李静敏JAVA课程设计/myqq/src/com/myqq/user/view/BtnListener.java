package com.myqq.user.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.myqq.entity.User;
import com.myqq.user.service.UserServiceImpl;

public class BtnListener implements ActionListener {

	LoginFrame loginFrame;
	//RegistFrame registFrame;
//	public BtnListener(RegistFrame registFrame) {
//		// TODO Auto-generated constructor stub
//		this.registFrame=registFrame;
//	}
	public BtnListener(LoginFrame loginFrame){
		this.loginFrame=loginFrame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand()=="取消"){
			System.exit(0);
		}else if(e.getActionCommand()=="登录"){
			String qqNum=loginFrame.txtQqNum.getText();
			String password=new String(loginFrame.txtPassword.getPassword());
			UserServiceImpl userServiceImpl=new UserServiceImpl();
			User u=userServiceImpl.login(Integer.parseInt(qqNum), password);
			if(u!=null){
				MainFrame mf=new MainFrame(u);
				loginFrame.dispose();
				loginFrame=null;
			}
		}else if(e.getActionCommand()=="注册"){
			this.Regists();
		}
		
	}
	public void Regists(){
		loginFrame.dispose();//关闭当前页面，打开新页面
		RegistFrame registFrame=new RegistFrame();
	}

}
