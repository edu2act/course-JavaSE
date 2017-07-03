 package com.myqq.user.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegisterFrame extends JFrame {
	
	JLabel lblNickName;
	JLabel lblPassword;
	JTextField txtName;
	JPasswordField txtPassword;
	JButton btnregister;
	JLabel lblgender;
	JLabel lblintroduce;
	JTextField txtgender;
	JTextField txtintroduce;
	JButton btnback;
	JLabel qqNum;
	public RegisterFrame(){
		lblNickName=new JLabel("名字：");
		lblPassword=new JLabel("密码：");
		qqNum=new JLabel();
		txtName=new JTextField();
		txtPassword=new JPasswordField();
		lblgender=new JLabel("性别");
		txtgender=new JTextField();
		txtintroduce=new JTextField();
		lblintroduce=new JLabel("介绍");
		btnregister=new JButton("注册");
		btnback=new JButton("返回");
		this.getContentPane().setLayout(null);
		this.getContentPane().add(lblNickName);
		lblNickName.setBounds(20, 20, 80, 20);
		this.getContentPane().add(lblPassword);
		lblPassword.setBounds(20, 50, 80, 20);
		this.getContentPane().add(txtName);
		this.getContentPane().add(txtgender);
		this.getContentPane().add(lblgender);
		txtName.setBounds(80,20,140,20);
		lblgender.setBounds(20, 80, 80, 20);
		txtgender.setBounds(80, 80, 140, 20);
		this.getContentPane().add(lblintroduce);
		this.getContentPane().add(txtintroduce);
		this.getContentPane().add(qqNum);
		qqNum.setBounds(80,250,100,20);
		lblintroduce.setBounds(20, 110, 80, 20);
		txtintroduce.setBounds(80, 110, 140, 60);
		this.getContentPane().add(txtPassword);
		txtPassword.setBounds(80, 50, 140, 20);
		this.getContentPane().add(btnregister);
		btnregister.setBounds(60, 200, 60, 20);
		this.getContentPane().add(btnback);
		btnback.setBounds(150,200,60,20);
		
		
		btnregister.addActionListener(new SignListener(this));
		btnback.addActionListener(new RebackListener(this));
		this.setTitle("注册");
		this.setSize(300,350);
		this.setVisible(true);
	}
}
