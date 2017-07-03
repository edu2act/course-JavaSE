package com.user.view;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegistFrame extends JFrame{
	JLabel lblQQNum;
	JLabel lblPassword;
	JTextField txtQQNum;
	JPasswordField txtPassword;
	JButton btnRegist;
	
	public RegistFrame(){
		//构造按钮，文字，文本框
		lblQQNum = new JLabel("账号：");
		lblPassword = new JLabel("密码：");
		txtQQNum = new JTextField();
		txtPassword = new JPasswordField();
		btnRegist = new JButton("完成");
		//添加账号
		this.getContentPane().setLayout(null);
		this.getContentPane().add(lblQQNum);
		lblQQNum.setBounds(20,20,80,20);
		//添加密码
		this.getContentPane().add(lblPassword);
		lblPassword.setBounds(20,50,80,20);
		//添加账号框
		this.getContentPane().add(txtQQNum);
		txtQQNum.setBounds(80,20,140,20);
		//添加密码框
		this.getContentPane().add(txtPassword);
		txtPassword.setBounds(80, 50, 140, 20);
		//添加两个按钮
		this.getContentPane().add(btnRegist);
		btnRegist.setBounds(160,100,80,30);
		
		
		btnRegist.addActionListener(new BtnListener(this));
		//构造窗体
		this.setSize(300,200);
		this.setVisible(true);
		this.setTitle("注册窗口");
		
	}
}
