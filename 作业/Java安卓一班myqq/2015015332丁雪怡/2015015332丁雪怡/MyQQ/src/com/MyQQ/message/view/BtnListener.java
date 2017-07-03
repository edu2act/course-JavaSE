package com.MyQQ.message.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JPanel;

import com.MyQQ.entity.Message;
import com.MyQQ.entity.User;
import com.MyQQ.message.service.ClientThread;
import com.MyQQ.message.service.MessageSericeImpl;
import com.MyQQ.message.service.ServerThread;
import com.MyQQ.user.dao.UserDaoImpl;
import com.MyQQ.user.service.UserServiceImpl;
import com.MyQQ.user.view.LoginFrame;
import com.MyQQ.user.view.MainFrame;

public class BtnListener implements ActionListener{

	ChatFrame chatFrame;
	public BtnListener(ChatFrame chatFrame) {
		this.chatFrame=chatFrame;
	}
	public void actionPerformed(ActionEvent e) {
		//获取文本框值，
		String msg=chatFrame.txtMsg.getText();
		//实例化Message对象，并存入数据库
		Message message=new Message();
		message.setContent(msg);
		message.setSender(chatFrame.myself.getQqNum());
		message.setReceiver(chatFrame.another.getQqNum());
		message.setSendTime(new Date());
		message.setState(1);
		
		MessageSericeImpl messageServiceImpl=new MessageSericeImpl();
		int key=messageServiceImpl.sendMessage(message);
		message.setId(key);
		//启动线程，发送给对方
		new Thread(new ClientThread(message, chatFrame.another.getip())).start();
		chatFrame.txtMsg.setText("");
		
		// TODO 放置内容到多行文本框
		UserDaoImpl reciverName=new UserDaoImpl();
		chatFrame.txtList.append(reciverName.findName(message.getSender())+"("+message.getSender()+")"+"    "+
				message.getSendTime().toLocaleString());
		chatFrame.txtList.append("\n");
		chatFrame.txtList.append(message.getContent()+"\n");
		chatFrame.txtList.setLineWrap(true);

	}
	
}
