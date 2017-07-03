package com.mychat.message.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import com.mychat.entity.Message;
import com.mychat.message.service.ClientThread;
import com.mychat.message.service.MessageServiceImpl;


public class BtnListener implements ActionListener {
	ChatFrame chatFrame =null;
	public BtnListener(ChatFrame chatFrame){
		this.chatFrame=chatFrame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String msg = chatFrame.txtMsg.getText().toString();
		Message message = new Message();
		message.setContent(msg);
		message.setSender(chatFrame.myself.getMyChatNum());
		message.setReceiver(chatFrame.another.getMyChatNum());
		message.setSendTime(new Date());//此处还出现过.sql包
		message.setState(1);
		
		chatFrame.txtMsg.setText("");
		MessageServiceImpl messageServiceImpl = new MessageServiceImpl();

		int key = messageServiceImpl.sendMessage(message);
		//	将按钮中的message设值id
		message.setId(key);
		
		//	TODO添加到数据库之后  还要将消息发送出去并显示在文本框中
		//	启动一个新的线程将消息发送出去
		new Thread(new ClientThread(message, chatFrame.another.getIp())).start();
		chatFrame.txtMsg.setText(" ");
		String cframe = chatFrame.txtList.getText();
		chatFrame.txtList.setText(cframe+chatFrame.myself.getNickName()+": "+message.getContent().toString()+'\n');
	

	}

}
