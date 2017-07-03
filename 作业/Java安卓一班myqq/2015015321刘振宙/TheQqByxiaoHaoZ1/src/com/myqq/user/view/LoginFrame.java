package com.myqq.user.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame{
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
		lblQqNum.setBounds(20, 20, 80, 20);
		this.getContentPane().add(lblPassword);
		lblPassword.setBounds(20, 50, 80, 20);
		this.getContentPane().add(txtQqNum);
		txtQqNum.setBounds(80, 20, 140, 20);
		this.getContentPane().add(txtPassword);
		txtPassword.setBounds(80, 50, 140, 20);
		this.getContentPane().add(btnLogin);
		btnLogin.setBounds(60, 100, 80, 20);
		this.getContentPane().add(btnCancle);
		btnCancle.setBounds(160, 100, 80, 20);
		
		//	添加监听器，当点击登录按钮时界面转换
		btnLogin.addActionListener(new BtnListener(this));
		
		//	这里我想到一个问题，因为我们的数据库刚刚创建的时候还没有任何的数据呢，我们是否可以把注册功能同样的实现
		//	如果点击注册按钮的话，就将用户输入的QQ号和密码加入到数据库中，当然前提是不存在这样的QQ号
		//	嘿嘿 不行 因为默认主键是递增的，所以不能插入 我还是直接在数据库中填写信息再实验吧
		this.setTitle("QQ登录");
		this.setSize(300,200);
		this.setVisible(true);
	}
}
