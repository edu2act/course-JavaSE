package com.myqq.user.view1;

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
	
	public LoginFrame(){
		lblQqNum=new JLabel("QQ号：");
		lblPassword=new JLabel("密码：");
		txtQqNum=new JTextField();
		txtPassword=new JPasswordField();
		btnLogin=new JButton("登录");
		btnCancle=new JButton("取消");
		
		this.getContentPane().setLayout(null);
		this.getContentPane().add(lblQqNum);
		lblQqNum.setBounds(40,20,160,25);
		this.getContentPane().add(lblPassword);
		lblPassword.setBounds(40,55,160,25);
		this.getContentPane().add(txtQqNum);
		txtQqNum.setBounds(120,20,100,25);
		this.getContentPane().add(txtPassword);
		txtPassword.setBounds(120,55,100,25);
		this.getContentPane().add(btnLogin);
		btnLogin.setBounds(60,90,80,25);
		this.getContentPane().add(btnCancle);
		btnCancle.setBounds(160,90,80,25);
		
		btnLogin.addActionListener(new BtnListener(this));
		
		this.setTitle("QQ登录");
		this.setSize(300, 200);
		this.setVisible(true);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	

}
