package com.myqq.user.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import com.myqq.entity.User;
import com.myqq.message.service.ClientThread;
import com.myqq.message.service.ServerThread;

import com.myqq.user.service.UserServiceImpl;
import com.myqq.util.IpUtil;

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
			ClientThread client=new ClientThread(qqNum);
			client.start();
	}
	}
	
	

}
