package com.myqq.user.view.register;

import javax.swing.JFrame;
import javax.swing.JLabel;

import com.myqq.entity.User;

public class RegisterSucceedFrame extends JFrame{
	JLabel lblregister;//文字
	//JLabel qqNumIs;
	User user;
	public RegisterSucceedFrame(){
		lblregister = new JLabel("注册成功!");
		//String qqNum = user.getQqnum();
		//qqNumIs = new JLabel(new String(user.getQqnum()));
		this.getContentPane().setLayout(null);
		
		this.getContentPane().add(lblregister);//用户名文字
		lblregister.setBounds(20,20,80,20);
		
		this.setTitle("提示信息");
		this.setSize(300,300);
		this.setVisible(true);
	}
	
}
