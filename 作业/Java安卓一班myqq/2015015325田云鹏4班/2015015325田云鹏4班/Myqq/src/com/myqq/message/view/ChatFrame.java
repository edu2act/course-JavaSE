package com.myqq.message.view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.myqq.entity.User;
import com.myqq.user.service.UserServiceImpl;

public class ChatFrame extends JFrame {
	
	User myself;
	public User getMyself() {
		return myself;
	}

	public void setMyself(User myself) {
		this.myself = myself;
	}

	User another;
	

	JTextArea txtList=null;
	public JTextArea getTxtList() {
		return txtList;
	}

	public User getAnother() {
		return another;
	}

	public void setAnother(User another) {
		this.another = another;
	}

	public void setTxtList(JTextArea txtList) {
		this.txtList = txtList;
	}

	JTextField txtMsg=null;
	JButton btn=null;
	

	public ChatFrame(User myself,String another){
		this.myself = myself;
		String temp[] = another.split(" ");	//用空格分隔再去得到好友的QQ号码
		UserServiceImpl userServiceImpl = new UserServiceImpl();
		this.another = userServiceImpl.listByQqNum(Integer.parseInt(temp[0]));
		JPanel panel=new JPanel();
		this.getContentPane().add(panel);
		panel.setLayout(new BorderLayout());
		
		txtList=new JTextArea(5, 20);
		panel.add(txtList, BorderLayout.CENTER);
		
		JPanel txtPanel=new JPanel();
		txtMsg=new JTextField(10);
		btn=new JButton("发送");
		

		btn.addActionListener(new ButtonListener(this));
		
		txtPanel.add(txtMsg);
		txtPanel.add(btn);
		panel.add(txtPanel, BorderLayout.SOUTH);
		
		this.setTitle(temp[1]);
		this.setSize(400,300);
		this.setVisible(true);
		
	}

	public JTextField getTxtMsg() {
		return txtMsg;
	}
	
}
