package com.myqq.message.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import com.myqq.entity.Message;
import com.myqq.message.Service.ClientThread;
import com.myqq.message.Service.MessageServiceImpl;

public class BtnListener implements ActionListener {

	ChatFrame chatFrame;
	public BtnListener(ChatFrame chatFrame) {
		this.chatFrame = chatFrame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//获取文本框值
		String msg = chatFrame.txtMsg.getText();
		//实例化Message对象，并存入数据库
		Message message = new Message();
		message.setContent(msg);
		message.setSender(chatFrame.myself.getQqnum());
		message.setReceiver(chatFrame.myself.getQqnum());
		message.setSendTime(new Date());
		message.setState(1);
		
		MessageServiceImpl messageServiceImpl = new MessageServiceImpl();
		int key = messageServiceImpl.sendMessage(message);
		message.setId(key);
		//启动线程，发送给对方
		new Thread(new ClientThread(message, chatFrame.another.getIp())).start();
		chatFrame.txtMsg.setText("");
		//将消息放到多行文本框
		String content = chatFrame.txtList.getText();
		int size = chatFrame.txtList.getWidth()/30;
		int spaceSize = size-chatFrame.myself.getNickName().length()-msg.length()-1;
		if (spaceSize > 0) {
			for (int i = 0; i < spaceSize; i++) {
				content += " ";
			}
		}
		content += chatFrame.myself.getNickName() + ":" + msg + "\n";
		chatFrame.txtList.setText(content);
	}

}
