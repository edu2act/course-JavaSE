//package com.myqq.message.view;
//
//import java.awt.GridLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.Date;
//
//import com.myqq.entity.Message;
//import com.myqq.message.sevice.ClientThread;
//import com.myqq.message.sevice.MessageServiceImpl;
//
//public class BtnListener implements ActionListener{
//
//	ChatFrame chatFrame;
//	public BtnListener(ChatFrame chatFrame) {
//		this.chatFrame=chatFrame;
//	}
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		//获取文本框值，
//		String msg=chatFrame.txtMsg.getText();
//		//实例化Message对象，并存入数据库
//		Message message=new Message();
//		message.setContent(msg);
//		message.setSender(chatFrame.myself.getQqnum());
//		message.setReceiver(chatFrame.another.getQqnum());
//		message.setSendTime(new Date());
//		message.setState(1);
//		
//		MessageServiceImpl messageServiceImpl=new MessageServiceImpl();
//		int key=messageServiceImpl.sendMessage(message);
//		message.setId(key);
//		//启动线程，发送给对方
//		new Thread(new ClientThread(message, chatFrame.another.getIp())).start();
//		chatFrame.txtMsg.setText("");
//		// TODO 放置内容到多行文本框
//
//		chatFrame.txtList.setText(chatFrame.txtList.getText()+chatFrame.myself.getNickName()+"发送内容："+msg+"发送时间："+message.getSendTime());
//       // chatFrame.txtList.append(chatFrame.myself.getNickName()+"发送内容："+msg+"发送时间："+message.getSendTime());
//	chatFrame.txtList.setLineWrap(true);
////	chatFrame.txtList.setLayout(new GridLayout(2,1));
//	}
//
//}
//
//
package com.myqq.message.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import com.myqq.entity.Message;
import com.myqq.message.dao.MessageDaoImpl;
import com.myqq.message.sevice.ClientThread;
import com.myqq.message.sevice.MessageServiceImpl;

public class BtnListener implements ActionListener{
	
	ChatFrame chatFrame = null;
	
	public BtnListener(ChatFrame chatFrame){
		this.chatFrame = chatFrame;
	}
	
	public void actionPerformed(ActionEvent e){
		//	当点击发送按钮之后
		//	实例化Message对象并存入数据库
		String content = chatFrame.txtMsg.getText();
		Message message = new Message();
		message.setContent(content);
		message.setSender(chatFrame.myself.getQqnum());
		message.setReceiver(chatFrame.another.getQqnum());
		message.setReceiveTime(new Date());
		message.setSendTime(new Date());
		message.setState(1);
		
		MessageDaoImpl messageServiceImpl = new MessageDaoImpl();
		//	这里只是单纯地将消息放进数据库里面的，可见分层分的很简洁和透彻
		//	一旦加入到数据库中，数据库会默认为id设值
		int key = messageServiceImpl.saveMessage(message);
		//	这里再为按钮中的message设值id
		message.setId(key);
		
		//	TODO添加到数据库之后  还要将消息发送出去并显示在文本框中
		//	启动一个新的线程将消息发送出去
		new Thread(new com.myqq.message.sevice.ClientThread(message, chatFrame.another.getIp())).start();
		chatFrame.txtMsg.setText(" ");
		String msgone = chatFrame.txtList.getText();
		chatFrame.txtList.setText(msgone+chatFrame.myself.getNickName()+": "+message.getContent().toString()+' '+message.getSendTime() +'\n');
	}
}

