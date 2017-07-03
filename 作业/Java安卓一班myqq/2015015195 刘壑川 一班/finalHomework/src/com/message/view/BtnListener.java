package com.message.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import com.bean.Message;
import com.message.service.ClientThread;
import com.message.service.MessageServiceImpl;

public class BtnListener implements ActionListener{
	private ChatFrame chatFrame;
	public BtnListener(ChatFrame chatFrame) {
		this.chatFrame=chatFrame;
	}
	public void actionPerformed(ActionEvent e) {
		//获取文本框值
		String msg=chatFrame.txtMsg.getText();
		//实例化Message对象，并存入数据库
		Message message=new Message();
		message.setContent(msg);
		message.setSender(chatFrame.myself.getQQNum());
		message.setReceiver(chatFrame.another.getQQNum());
		message.setSendTime(new Date());
		message.setState(1);
		//数据库插入
		MessageServiceImpl messageServiceImpl=new MessageServiceImpl();
		int key=messageServiceImpl.messageSend(message);
		message.setId(key);
		//启动线程，发送给对方
		new Thread(new ClientThread(message, chatFrame.another.getIp())).start();
		chatFrame.txtMsg.setText("");
		// 放置发送内容到多行文本框
		String content=chatFrame.txtList.getText();
		int size=chatFrame.txtList.getWidth()/3;
		int spaceSize=size-chatFrame.myself.getNickName().length()-msg.length()-1;
		if(spaceSize>0){
			for(int i=0;i<spaceSize;i++){
				content+=" ";
			}
		}
		content+=chatFrame.myself.getNickName()+":"+msg+"\n";
		chatFrame.txtList.setText(content);
	}
}
