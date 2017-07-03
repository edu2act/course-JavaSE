package com.myqq.user.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class registerFrame extends JFrame {
	
	JLabel lblQqNum;
	JLabel lblPassword;
	JTextField txtQqNum;
	JPasswordField txtPassword;
	JButton btnregister;
	JLabel lblgender;
	JLabel lblintroduce;
	JTextField txtgender;
	JTextField txtintroduce;
	public registerFrame(){
		lblQqNum=new JLabel("QQ号：");
		lblPassword=new JLabel("密码：");
		txtQqNum=new JTextField();
		txtPassword=new JPasswordField();
		lblgender=new JLabel("性别");
		txtgender=new JTextField();
		txtintroduce=new JTextField();
		lblintroduce=new JLabel("签名");
		btnregister=new JButton("注册");
		this.getContentPane().setLayout(null);
		this.getContentPane().add(lblQqNum);
		lblQqNum.setBounds(20, 20, 80, 20);
		this.getContentPane().add(lblPassword);
		lblPassword.setBounds(20, 40, 80, 20);
		this.getContentPane().add(txtQqNum);
		this.getContentPane().add(txtgender);
		this.getContentPane().add(lblgender);
		txtQqNum.setBounds(80,20,140,20);
		lblgender.setBounds(20, 80, 80, 20);
		txtgender.setBounds(80, 80, 140, 20);
		this.getContentPane().add(lblintroduce);
		this.getContentPane().add(txtintroduce);
		
		lblintroduce.setBounds(20, 110, 80, 20);
		txtintroduce.setBounds(80, 110, 140, 60);
		this.getContentPane().add(txtPassword);
		txtPassword.setBounds(80, 40, 140, 20);
		this.getContentPane().add(btnregister);
		btnregister.setBounds(100, 200, 60, 20);
		
		
		
		this.setTitle("注册");
		this.setSize(300,300);
		this.setVisible(true);
	}
}
