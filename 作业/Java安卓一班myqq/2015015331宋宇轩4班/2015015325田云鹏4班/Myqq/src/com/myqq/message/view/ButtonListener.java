package com.myqq.message.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import com.myqq.entity.Message;
import com.myqq.message.dao.MessageDaoImpl;
import com.myqq.message.service.ClientThread;
import com.myqq.message.service.MessageServiceImpl;

public class ButtonListener implements ActionListener{
	
	ChatFrame chatFrame = null;
	
	public ButtonListener(ChatFrame chatFrame){
		this.chatFrame = chatFrame;
	}
	
	public void actionPerformed(ActionEvent e){
	
		String content = chatFrame.txtMsg.getText();
		Message message = new Message();
		message.setContent(content);
		message.setSender(chatFrame.myself.getQqNum());
		message.setReceiver(chatFrame.another.getQqNum());
		message.setReceiveTime(new Date());
		message.setSendTime(new Date());
		message.setState(1);
		
		MessageServiceImpl messageServiceImpl = new MessageServiceImpl();
	
		int key = messageServiceImpl.sendMessage(message);
		//	这里再为按钮中的message设值id
		message.setId(key);
		
	
		new Thread(new ClientThread(message, chatFrame.another.getIp())).start();
		chatFrame.txtMsg.setText(" ");
		
		String ffffffuck = chatFrame.txtList.getText();
		chatFrame.txtList.setText(ffffffuck+chatFrame.myself.getNickName()+": "+message.getContent().toString()+'\n');
	}
}
