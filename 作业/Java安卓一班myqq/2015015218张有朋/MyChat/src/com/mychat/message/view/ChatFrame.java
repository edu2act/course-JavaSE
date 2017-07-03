package com.mychat.message.view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.mychat.yp.user;
import com.mychat.message.view.BtnListener;
import com.mychat.user.service.userServiceImpl;

public class ChatFrame extends JFrame {
	public user myself;
	public user another;
	
	public JTextArea txtList=null;
	public JTextField txtMsg=null;
	public JButton btn=null;
	
	public ChatFrame(user myself, String other){
		this.myself=myself;
		String temp[]=other.split(" ");
		userServiceImpl userServiceImpl=new userServiceImpl();
		another=userServiceImpl.listByChatNum(Integer.parseInt(temp[0]));
		JPanel panel=new JPanel();
		this.getContentPane().add(panel);
		panel.setLayout(new BorderLayout());
		
		txtList=new JTextArea(5, 20);
		panel.add(txtList, BorderLayout.CENTER);
		
		JPanel txtPanel=new JPanel();
		txtMsg=new JTextField(10);
		btn=new JButton("发送");
		
		btn.addActionListener(new BtnListener(this));
		
		txtPanel.add(txtMsg);
		txtPanel.add(btn);
		panel.add(txtPanel, BorderLayout.SOUTH);
		
		this.setTitle(temp[1]);
		this.setSize(400,300);
		this.setVisible(true);
		
	}
}
