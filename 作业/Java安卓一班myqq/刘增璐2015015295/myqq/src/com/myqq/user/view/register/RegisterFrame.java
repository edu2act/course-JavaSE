package com.myqq.user.view.register;

import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.myqq.user.view.login.LoginBtnListener;

public class RegisterFrame extends JFrame{
	JLabel lblName;//用户名文字
	JLabel lblPassword;//密码文字
	JLabel lblGender;//性别文字
	JLabel lblIntroduce;//介绍文字
	JTextField txtName;//用户名文本域
	JPasswordField txtPassword;//密码文本域
	JTextField txtGender;//性别文本域
	JTextArea txtIntroduce;//介绍文本域
	JButton btnRegister;//注册按钮
	JButton btnCancle;//取消按钮
	public RegisterFrame(){
		
		lblName = new JLabel("用户名：");
		lblPassword = new JLabel("密码：");
		lblGender = new JLabel("性别：");
		lblIntroduce = new JLabel("介绍：");
		txtName = new JTextField();
		txtPassword = new JPasswordField();
		txtGender = new JTextField();
		txtIntroduce = new JTextArea();
		btnRegister = new JButton("注册");
		btnCancle = new JButton("取消");
	
		this.getContentPane().setLayout(null);
		
		this.getContentPane().add(lblName);//用户名文字
		lblName.setBounds(20,20,80,20);
		
		this.getContentPane().add(lblPassword);//密码文字
		lblPassword.setBounds(20, 50, 80, 20);
		
		this.getContentPane().add(lblGender);//性别文字
		lblGender.setBounds(20, 80, 80, 20);
		
		this.getContentPane().add(lblIntroduce);//介绍文字
		lblIntroduce.setBounds(20, 110, 80, 20);
		
		this.getContentPane().add(txtName);//用户名文本域
		txtName.setBounds(80, 20, 140, 20);
		
		this.getContentPane().add(txtPassword);//密码文本域
		txtPassword.setBounds(80, 50, 140, 20);
	
		this.getContentPane().add(txtGender);//男女文本域
		txtGender.setBounds(80, 80, 140, 20);
		
		this.getContentPane().add(txtIntroduce);//介绍文本域
		txtIntroduce.setBounds(80, 110, 140, 60);
		
		this.getContentPane().add(btnRegister);//注册按钮
		btnRegister.setBounds(60, 190, 80, 20);
		
		this.getContentPane().add(btnCancle);//取消按钮
		btnCancle.setBounds(160, 190, 80, 20);
		
		btnRegister.addActionListener(new RegisterBtnListener(this));
		btnCancle.addActionListener(new RegisterBtnListener(this));
		
		this.setTitle("QQ注册");
		this.setSize(300,300);
		this.setVisible(true);
	}
	
}
