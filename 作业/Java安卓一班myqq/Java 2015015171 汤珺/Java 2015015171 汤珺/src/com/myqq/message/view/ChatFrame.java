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
	//	对话的两个用户
	User myself;
	public User getMyself() {
		return myself;
	}

	public void setMyself(User myself) {
		this.myself = myself;
	}

	User another;
	
	//	聊天界面的三个参数
	JTextArea txtList=null;
	public JTextArea getTxtList() {
		return txtList;
	}

	public void setTxtList(JTextArea txtList) {
		this.txtList = txtList;
	}

	JTextField txtMsg=null;
	JButton btn=null;
	
	//	another参数是好友结点的String类型的值
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
		
		//	TODO添加事件监听器，当点击发送按钮时所产生的事件
		btn.addActionListener(new BtnListener(this));
		
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
