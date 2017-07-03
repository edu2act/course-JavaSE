package com.GoChat.message.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JTextArea;

import com.GoChat.entity.Message;
import com.GoChat.message.service.ClientThread;
import com.GoChat.message.service.MessageServiceImpl;

public class BtnListener implements ActionListener {

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
		message.setSender(chatFrame.myself.getQQnum());
		message.setRecevier(chatFrame.another.getQQnum());
		message.setSendTime(new Date());
		message.setState(1);
		
		MessageServiceImpl messageServiceImpl=new MessageServiceImpl();
		int key=messageServiceImpl.sendMessage(message);
		message.setId(key);
		//启动线程，发送给对方
		new Thread(new ClientThread(message, chatFrame.another.getIp())).start();
		chatFrame.txtMsg.setText("");
		
		//放置内容到多行文本框
		//从数据库获取信息
		JTextArea jta=chatFrame.txtList;
		String name=messageServiceImpl.getName(message.getSender());
		jta.append(name+"   "+message.getSendTime().toLocaleString()+"\n"+message.getContent()+"\n");
		/*不能执行在btnListener里面*/
		if(true){
			messageServiceImpl.getContent(message);
		}
	}

}
