package com.myqq.user.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.myqq.util.ConnectionUtil;

public class RegistFrame extends JFrame {
	JLabel lblQqNum;
	JLabel qqName;
	JLabel gender;
	JLabel introduce;
	JLabel IP;
	JLabel registTime;
	JLabel lblPassword1,lblPassword2;
	JTextField txtQqNum,txtName,txtGender,txtIn,txtIp,txtRe;
	JPasswordField txtPassword1,txtPassword2;
	JButton btnRegist;
	JButton btnCancle;
	
	public RegistFrame(){
		lblQqNum=new JLabel("请输入手机号：");
		lblPassword1=new JLabel("设置密码：");
		lblPassword2=new JLabel("确认密码：");
		txtQqNum=new JTextField();
		txtName=new JTextField();
		qqName=new JLabel("请输入昵称:");
		gender=new JLabel("性别:");
		txtGender=new JTextField();
		introduce=new JLabel("自我介绍：");
		txtIn=new JTextField();
		IP=new JLabel("IP地址：");
		txtIp=new JTextField();
		registTime=new JLabel("注册时间：");
		txtRe=new JTextField();
		txtPassword1=new JPasswordField();
		txtPassword2=new JPasswordField();
		btnRegist=new JButton("注册");
		btnCancle=new JButton("返回");
		
		this.getContentPane().setLayout(null);
		this.getContentPane().add(lblQqNum);
		lblQqNum.setBounds(30, 20, 92, 20);
		this.getContentPane().add(qqName);
		qqName.setBounds(30, 50, 90, 20);
		this.getContentPane().add(lblPassword1);
		lblPassword1.setBounds(30, 80, 80, 20);
		this.getContentPane().add(lblPassword2);
		lblPassword2.setBounds(30, 110, 80, 20);
		this.getContentPane().add(gender);
		gender.setBounds(30, 140, 80, 20);
		this.getContentPane().add(IP);
		IP.setBounds(30, 170, 80, 20);
		this.getContentPane().add(introduce);
		introduce.setBounds(30, 200, 80, 20);
		this.getContentPane().add(registTime);
		registTime.setBounds(30, 254, 80, 20);
		this.getContentPane().add(txtQqNum);
		txtQqNum.setBounds(110, 20, 140, 20);
		this.getContentPane().add(txtName);
		txtName.setBounds(110, 50, 140, 20);
		this.getContentPane().add(txtPassword1);
		txtPassword1.setBounds(110, 80, 140, 20);
		this.getContentPane().add(txtPassword2);
		txtPassword2.setBounds(110, 110, 140, 20);
		this.getContentPane().add(txtGender);
		txtGender.setBounds(110, 140, 100, 20);
		this.getContentPane().add(txtIp);
		txtIp.setBounds(110, 170, 140, 20);
		this.getContentPane().add(txtIn);
		txtIn.setBounds(110, 200, 140, 50);
		this.getContentPane().add(txtRe);
		txtRe.setBounds(110, 255, 140, 20);
		this.getContentPane().add(btnRegist);
		btnRegist.setBounds(60, 300, 80, 20);
		this.getContentPane().add(btnCancle);
		btnCancle.setBounds(160, 300, 80, 20);
		
		btnRegist.addActionListener(new UserRegis());
		
		
		this.setTitle("QQ注册");
		this.setSize(500,400);
		this.setVisible(true);
	}
}