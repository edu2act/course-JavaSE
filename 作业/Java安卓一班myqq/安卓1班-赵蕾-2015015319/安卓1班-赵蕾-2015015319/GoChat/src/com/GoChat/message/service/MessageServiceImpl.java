package com.GoChat.message.service;

import com.GoChat.entity.Message;
import com.GoChat.message.dao.MessageDaoImpl;
import com.GoChat.user.dao.UserDaoImpl;

public class MessageServiceImpl {

	MessageDaoImpl messageDaoImpl=new MessageDaoImpl();
	
	public int sendMessage(Message message){
		return messageDaoImpl.saveMessage(message);
	}

	public String getName(int qqNum){
		UserDaoImpl userDaoImpl=new UserDaoImpl();
		return userDaoImpl.getNameByQQnum(qqNum);
	}
	
	public String getContent(Message message){
		return messageDaoImpl.getNextContent(message);
	}
}
