package com.myqq.user.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame{
	
	JLabel lblQqNum;
	JLabel lblPassword;
	JTextField txtQqNum;
	JPasswordField txtPassword;
	JButton btnRegist;
	JButton btnLogin;
	JButton btnCancle;
	
	public LoginFrame() {
		
		lblQqNum = new JLabel("QQ号：");
		lblPassword = new JLabel("密码：");
		txtQqNum = new JTextField();
		txtPassword = new JPasswordField();
		btnRegist = new JButton("注册");
		btnLogin = new JButton("登录");
		btnCancle = new JButton("取消");
		
		
		this.getContentPane().setLayout(null);
		//“QQ号” 位置
		this.getContentPane().add(lblQqNum);
		//x y 长  宽
		lblQqNum.setBounds(20,20,80,20);
		//“密码” 位置
		this.getContentPane().add(lblPassword);
		lblPassword.setBounds(20,50,80,20);
		//“QQ号”文本框  位置
		this.getContentPane().add(txtQqNum);
		txtQqNum.setBounds(80,20,140,20);
		//“密码”文本框  位置
		this.getContentPane().add(txtPassword);
		txtPassword.setBounds(80,50,140,20);
		
		//注册
		this.getContentPane().add(btnRegist);
		btnRegist.setBounds(30,100,70,20);
		//“登录”按钮  位置
		this.getContentPane().add(btnLogin);
		btnLogin.setBounds(110,100,70,20);
		//“取消”按钮  位置
		this.getContentPane().add(btnCancle);
		btnCancle.setBounds(190,100,70,20);
		
		//添加监听着
		
		//注册按钮监听器
		btnRegist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistFrame rf = new RegistFrame();
			}
		});
		//登录页面监听器
		btnLogin.addActionListener(new BtnListener(this));
		
		
		this.setTitle("QQ登录");
		this.setSize(300,200);
		this.setLocation(500, 300);
		this.setVisible(true);
	}
	
			
		

}
