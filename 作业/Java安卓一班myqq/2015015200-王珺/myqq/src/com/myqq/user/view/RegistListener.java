package com.myqq.user.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import com.myqq.entity.Message;
import com.myqq.entity.Users;
import com.myqq.message.service.ClientThread;
import com.myqq.message.service.MessageServiceImpl;
import com.myqq.message.view.ChatFrame;
import com.myqq.user.service.UserServiceImpl;

public class RegistListener implements ActionListener{

	RegistFrame registFrame;
	public RegistListener(RegistFrame registFrame) {
		this.registFrame=registFrame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Users u = new Users();
		u.setNickName(registFrame.txtName.getText());
		
		String password=new String(registFrame.txtPassword.getPassword());
		u.setPassword(password);
		
		u.setGender(registFrame.txtGender.getText());
		
		u.setRegistTime(new Date());
		
		String introduce=registFrame.txtIntroduce.getText();
		u.setIntroduce(introduce);
		
		u.setIp("127.0.0.1");
		
		UserServiceImpl userServiceImpl=new UserServiceImpl();
		boolean b=userServiceImpl.regist(u);
		if(b){
			RegistOk ro = new RegistOk();
			//MainFrame mf=new MainFrame(u);
			registFrame.dispose();
			registFrame=null;
			
			
		}
	}
	
	
	
	
}
