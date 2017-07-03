package com.message.service;

import com.bean.Message;
import com.message.dao.MessageDaoImpl;

public class MessageServiceImpl {
	public int messageSend(Message message){
		MessageDaoImpl messageDaoImpl = new MessageDaoImpl();
		return messageDaoImpl.saveMessage(message);
	}
}
