package com.MYQQ.message.service;
import com.MYQQ.entity.message;
import com.MYQQ.message.dao.MessageDaoImpl;
public class MessageServiceImpl {
	public int sendMessage(message message){
		MessageDaoImpl messageDaoImpl=new MessageDaoImpl();
		return messageDaoImpl.saveMessage(message);
	}
}
