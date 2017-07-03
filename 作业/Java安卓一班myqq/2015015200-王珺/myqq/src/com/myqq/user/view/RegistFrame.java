package com.myqq.user.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegistFrame extends JFrame{
	
	JLabel lblName;//昵称
	JLabel lblPassword;//密码
	JLabel lblGender;//性别
	JLabel lblIntroduce;//自我介绍
	JButton btnSure;
	JButton btnCancle;
	
	JTextField txtName;
	JPasswordField txtPassword;
	JTextField txtGender;
	JTextField txtIntroduce;
	
	
	
	public RegistFrame() {
		
		lblName = new JLabel("昵称");
		txtName = new JTextField();
		
		
		lblPassword = new JLabel("密码：");
		txtPassword = new JPasswordField();
		
		lblGender = new JLabel("性别");
		txtGender = new JTextField();
		
		lblIntroduce = new JLabel("自我介绍");
		txtIntroduce = new JTextField();
		
		btnSure = new JButton("确定");
		
		btnCancle = new JButton("取消");
		
		this.getContentPane().setLayout(null);
		
		//“昵称” 位置
		this.getContentPane().add(lblName);
		//x y 长  宽
		lblName.setBounds(30,20,80,20);
		
		//“密码” 位置
		this.getContentPane().add(lblPassword);
		lblPassword.setBounds(30,50,80,20);
		
		//性别位置
		this.getContentPane().add(lblGender);
		lblGender.setBounds(30,80,80,20);
		
		//“自我介绍” 位置
		this.getContentPane().add(lblIntroduce);
		lblIntroduce.setBounds(30,110,80,20);
		
		//“QQ号”文本框  位置
		this.getContentPane().add(txtName);
		txtName.setBounds(90,20,200,20);
		//“密码”文本框  位置
		this.getContentPane().add(txtPassword);
		txtPassword.setBounds(90,50,200,20);
		//性别
		this.getContentPane().add(txtGender);
		txtGender.setBounds(90,80,200,20);
		//“自我介绍”文本框位置
		this.getContentPane().add(txtIntroduce);
		txtIntroduce.setBounds(90,110,200,120);
		
				
		this.getContentPane().add(btnSure);
		btnSure.setBounds(50,250,100,20);
		
		//“取消”按钮  位置
		this.getContentPane().add(btnCancle);
		btnCancle.setBounds(220,250,100,20);
				
		//添加监听着
		btnSure.addActionListener(new RegistListener(this));
				
				
		this.setTitle("QQ注册 ");
		this.setSize(400,400);
		this.setLocation(500, 300);
		this.setVisible(true);
		

	}
	
}
