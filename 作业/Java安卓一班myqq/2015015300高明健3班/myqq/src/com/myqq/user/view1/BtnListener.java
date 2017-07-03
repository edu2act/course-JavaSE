package com.myqq.user.view1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.myqq.entity.User;
import com.myqq.user.service.UserServiceImpl;

public class BtnListener implements ActionListener {

	LoginFrame loginFrame;
	public BtnListener(LoginFrame loginFrame) {
		this.loginFrame=loginFrame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String qqNum=loginFrame.txtQqNum.getText();
		String password=new String(loginFrame.txtPassword.getPassword());
		UserServiceImpl userServiceImpl=new UserServiceImpl();
		int qqnum=0;
		try{
			qqnum=Integer.parseInt(qqNum);
		}catch(Exception e1){
			loginFrame.txtQqNum.setText("请填写QQ号");
			loginFrame.txtQqNum.select(0, loginFrame.txtQqNum.getText().length());
		}
		User u=userServiceImpl.login(qqnum, password);
		if(u!=null){
			System.out.println(u.getNickName());
		}else{
			
		}
	}

}
