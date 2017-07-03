package com.mychat.message.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import com.mychat.message.view.ChatFrame;
import com.mychat.yp.message;
import com.mychat.message.service.ClientThread;
import com.mychat.message.service.MessageServiceImpl;

public class BtnListener implements ActionListener {
	ChatFrame chatFrame;
	public BtnListener(ChatFrame chatFrame) {
		this.chatFrame=chatFrame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自动生成的方法存根
		String msg=chatFrame.txtMsg.getText();
		message message=new message(0, msg, 0, 0, null, null, 0);
		message.setContent(msg);
		message.setSender(chatFrame.myself.getChatNum());
		message.setReceiver(chatFrame.another.getChatNum());
		message.setSentTime(new Date());
		message.setState(1);
		
		MessageServiceImpl messageServiceImpl=new MessageServiceImpl();
		int key=messageServiceImpl.sendMessage(message);
		message.setId(key);
		//启动线程，发送给对方
		new Thread(new ClientThread(message, chatFrame.another.getIp())).start();
		chatFrame.txtMsg.setText("");
		// TODO 放置内容到多行文本框
		
	}

}
