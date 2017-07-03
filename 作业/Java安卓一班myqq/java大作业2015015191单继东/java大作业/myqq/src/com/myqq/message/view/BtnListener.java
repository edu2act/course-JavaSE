package com.myqq.message.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import com.myqq.entity.Message;
import com.myqq.message.service.ClientThread;
import com.myqq.message.service.MessageServiceImpl;

public class BtnListener implements ActionListener{

	ChatFrame chatFrame;
	public BtnListener(ChatFrame chatFrame) {
		this.chatFrame=chatFrame;
	}
	public void actionPerformed(ActionEvent e) {
		String msg=chatFrame.txtMsg.getText();
		Message message=new Message();
		message.setContent(msg);
		message.setSender(chatFrame.myself.getQqnum());
		message.setReceiver(chatFrame.another.getQqnum());
		message.setSendTime(new Date());
		message.setState(1);
		MessageServiceImpl messageServiceImpl=new MessageServiceImpl();
		int key=messageServiceImpl.sendMessage(message);
		message.setId(key);
		new Thread(new ClientThread(message, chatFrame.another.getIp())).start();
		chatFrame.txtMsg.setText("");
		String content = chatFrame.txtList.getText();
        int size = chatFrame.txtList.getWidth()/3;
        int spaceSize = size-chatFrame.myself.getNickName().length()-msg.length()-1;
        if(spaceSize>0){
        	 for(int i =0;i<spaceSize;i++){
        		 content += " ";
        		 
        	 }
        }
        content+=chatFrame.myself.getNickName()+":"+msg+"\n";
        chatFrame.txtList.setText(content);
	}

}
