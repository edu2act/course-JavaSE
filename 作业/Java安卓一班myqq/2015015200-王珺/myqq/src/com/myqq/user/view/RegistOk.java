package com.myqq.user.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class RegistOk extends JFrame {

	JLabel lblSucceed;//注册成功
	//JLabel lblQqNum;
	//JLabel lblQqNumber;
	
	
	public RegistOk() {
		//String number = 
		
		
		
		lblSucceed= new JLabel("注册成功");
		lblSucceed.setFont(new Font("",1,30));
		lblSucceed.setForeground(Color.BLUE);
		
		//lblQqNum = new JLabel("QQ号：");
		//lblQqNum = new JLabel(number);
		
		this.getContentPane().setLayout(null);
		
		this.getContentPane().add(lblSucceed);
		lblSucceed.setBounds(40,40,150,50);
		
		//this.getContentPane().add(lblQqNum);
		//lblQqNum.setBounds(20,20,80,20);
		
		//this.getContentPane().add(lblQqNumber);
		//lblQqNumber.setBounds(20,20,80,20);
		
		
		//btnLogin.addActionListener(new BtnListener(this));
		
		this.setTitle("注册成功");
		this.setSize(300,200);
		this.setLocation(500, 300);
		this.setVisible(true);
		
		
	}
	
	
}
