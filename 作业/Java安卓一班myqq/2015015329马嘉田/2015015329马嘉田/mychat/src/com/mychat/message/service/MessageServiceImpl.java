package com.mychat.message.service;

import com.mychat.entity.Message;
import com.mychat.message.dao.MessageDaoImpl;

public class MessageServiceImpl {
	public int sendMessage(Message message){
		MessageDaoImpl messageDaoImpl = new MessageDaoImpl();
		return messageDaoImpl.saveMessage(message);
	}
	
	public void saveChatFrame(Message message){
		MessageDaoImpl messageDaoImpl = new MessageDaoImpl();
		messageDaoImpl.addChatFrameToMySql(message);
	}
	
	public int[] checkChatFrame(Message message){
		MessageDaoImpl messageDaoImpl = new MessageDaoImpl();
		return messageDaoImpl.checkIsExistsInChatFrame(message);
	}
}
