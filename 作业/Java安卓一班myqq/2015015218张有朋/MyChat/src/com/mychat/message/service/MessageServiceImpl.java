package com.mychat.message.service;

import com.mychat.yp.message;
import com.mychat.message.dao.MessageDaoImpl;

public class MessageServiceImpl {
	public int sendMessage(message message){
		MessageDaoImpl messageDaoImpl=new MessageDaoImpl();
		return messageDaoImpl.saveMessage(message);
	}
}
