package com.myqq.message.Service;

import com.myqq.entity.Message;
import com.myqq.message.Dao.MessageDaoImpl;

public class MessageServiceImpl {

	public int sendMessage (Message message) {
		MessageDaoImpl messageDaoImpl = new MessageDaoImpl();
		return messageDaoImpl.saveMessage(message);
	}
}
