package com.MyQQ.message.service;

import com.MyQQ.entity.Message;
import com.MyQQ.message.dao.MessageDaoImpl;

public class MessageSericeImpl {

	public int sendMessage(Message message){
		MessageDaoImpl messageDaoImpl=new MessageDaoImpl();
		return messageDaoImpl.saveMessage(message);
	}
}