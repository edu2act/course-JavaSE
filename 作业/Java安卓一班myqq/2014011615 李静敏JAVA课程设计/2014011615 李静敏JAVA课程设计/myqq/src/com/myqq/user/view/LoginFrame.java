package com.myqq.user.view;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame {
	
	
	JLabel lblQqNum;
	JLabel lblPassword;
	JTextField txtQqNum;
	JPasswordField txtPassword;
	JButton btnLogin;
	JButton btnCancle;
	JButton btnRegist;
	
	public LoginFrame(){
		lblQqNum=new JLabel("QQ号：");
		lblPassword=new JLabel("密码：");
		txtQqNum=new JTextField();
		txtPassword=new JPasswordField();
		btnLogin=new JButton("登录");
		btnCancle=new JButton("取消");
		btnRegist=new JButton("注册");
		
		this.getContentPane().setLayout(null);
		this.getContentPane().add(lblQqNum);
		lblQqNum.setBounds(20, 20, 80, 30);
		this.getContentPane().add(lblPassword);
		lblPassword.setBounds(20, 50, 80, 30);
		this.getContentPane().add(txtQqNum);
		txtQqNum.setBounds(80, 20, 150, 30);
		this.getContentPane().add(txtPassword);
		txtPassword.setBounds(80, 60, 150, 30);
		this.getContentPane().add(btnLogin);
		btnLogin.setBounds(30, 150, 60, 30);
		this.getContentPane().add(btnCancle);
		btnCancle.setBounds(100, 150, 60, 30);
		this.getContentPane().add(btnRegist);
		btnRegist.setBounds(170, 150, 60, 30);
		
		btnLogin.addActionListener(new BtnListener(this));
		btnRegist.addActionListener(new BtnListener(this));
		btnCancle.addActionListener(new BtnListener(this));
		
		this.setTitle("QQ登录");
		this.setSize(300,300);
		this.setVisible(true);
	}

}
