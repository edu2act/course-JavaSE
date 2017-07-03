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
		//	当点击发送按钮之后
		//	实例化Message对象并存入数据库
		String content = chatFrame.txtMsg.getText();
		Message message = new Message();
		message.setContent(content);
		message.setSender(chatFrame.myself.getQqNum());
		message.setReceiver(chatFrame.another.getQqNum());
		message.setReceiveTime(new Date());
		message.setSendTime(new Date());
		message.setState(1);
		
		MessageServiceImpl messageServiceImpl = new MessageServiceImpl();
		//	这里只是单纯地将消息放进数据库里面的，可见分层分的很简洁和透彻
		//	一旦加入到数据库中，数据库会默认为id设值
		int key = messageServiceImpl.sendMessage(message);
		//	这里再为按钮中的message设值id
		message.setId(key);
		
		//	TODO添加到数据库之后  还要将消息发送出去并显示在文本框中
		//	启动一个新的线程将消息发送出去
		new Thread(new ClientThread(message, chatFrame.another.getIp())).start();
		chatFrame.txtMsg.setText(" ");
		
		// 	TODO 在文本框中添加消息，消息的格式这里我设置为“发送者的nickName：发送内容”
		// 	TODO 当再次点击发送按钮的时候，我希望是能够在之前的内容上面继续出现新的内容而不是将之前的内容覆盖
		String ffffffuck = chatFrame.txtList.getText();
		chatFrame.txtList.setText(ffffffuck+chatFrame.myself.getNickName()+": "+message.getContent().toString()+'\n');
	}
}
