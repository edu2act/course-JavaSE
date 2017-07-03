package com.myqq.message.service;

import com.myqq.entity.Message;
import com.myqq.message.dao.MessageDaoImpl;

public class MessageServiceImpl {
	/*
	 * 发送消息，并插入数据库中，
	 */
	public int sendMessage(Message message){
		MessageDaoImpl messageDaoImpl=new MessageDaoImpl();
		return messageDaoImpl.saveMessage(message);
	}
}
