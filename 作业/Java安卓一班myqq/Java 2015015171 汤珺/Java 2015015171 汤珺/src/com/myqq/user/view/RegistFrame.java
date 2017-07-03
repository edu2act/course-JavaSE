package com.myqq.user.view;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.myqq.entity.User;
import com.myqq.user.service.UserServiceImpl;

public class RegistFrame extends JFrame {
	JLabel lblQqNickName;
	JLabel lblPassword;
	JLabel lblPassword1;
	JLabel lblGender;
	JLabel lblIntroduce;
	JButton btnRegist;
	JButton btnCancle;
	JTextField txtNickName;
	JTextField txtPassword;
	JTextField txtGender;
	JTextField txtIntroduce;
	
	public RegistFrame(){
		lblQqNickName=new JLabel("QQ昵称：");
		txtNickName=new JTextField(" ");
		lblPassword=new JLabel("密码：");
		txtPassword=new JPasswordField();
		lblGender=new JLabel("性别:");
		txtGender=new JTextField();
		lblIntroduce=new JLabel("介绍");
		txtIntroduce=new JTextField();
		btnRegist=new JButton("注册");
		btnCancle=new JButton("取消");
		
		this.getContentPane().setLayout(null);
		this.getContentPane().add(lblQqNickName);
		lblQqNickName.setBounds(20, 20, 80, 20);
		this.getContentPane().add(txtNickName);
		txtNickName.setBounds(80, 20, 140, 20);
		
		this.getContentPane().add(lblPassword);
		lblPassword.setBounds(20, 50, 80, 20);
		this.getContentPane().add(txtPassword);
		txtPassword.setBounds(80, 50, 140, 20);
		
		
		this.getContentPane().add(lblGender);
		lblGender.setBounds(20, 110, 80, 20);
		this.getContentPane().add(txtGender);
		txtGender.setBounds(80, 110, 140, 20);
		
		this.getContentPane().add(lblIntroduce);
		lblIntroduce.setBounds(20, 140, 80, 20);
		this.getContentPane().add(txtIntroduce);
		txtIntroduce.setBounds(80, 140, 140, 20);
		
		this.getContentPane().add(btnRegist);
		btnRegist.setBounds(60, 170, 80, 20);
		this.getContentPane().add(btnCancle);
		btnCancle.setBounds(160, 170, 80, 20);
		
		btnRegist.addActionListener(new BtnListenerone(this));
		
		
		this.setTitle("QQ注册");
		this.setSize(300,500);
		this.setVisible(true);
	}
}
