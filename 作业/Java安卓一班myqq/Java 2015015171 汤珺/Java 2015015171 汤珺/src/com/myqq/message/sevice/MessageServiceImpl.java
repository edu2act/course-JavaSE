package com.myqq.message.sevice;

import com.myqq.entity.Message;
import com.myqq.message.dao.MessageDaoImpl;

public class MessageServiceImpl {

	public int sendMessage(Message message){
		MessageDaoImpl messageDaoImpl=new MessageDaoImpl();
		return messageDaoImpl.saveMessage(message);
	}
}

