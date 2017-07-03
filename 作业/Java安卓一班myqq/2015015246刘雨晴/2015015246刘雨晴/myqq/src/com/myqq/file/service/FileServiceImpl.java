package com.myqq.file.service;

import com.myqq.entity.File;
import com.myqq.entity.Message;
import com.myqq.file.dao.FileDaoImpl;
import com.myqq.message.dao.MessageDaoImpl;

public class FileServiceImpl {

	public int sendFile(File file){
		FileDaoImpl fileDaoImpl=new FileDaoImpl();
		return fileDaoImpl.saveFile(file);
	}
}
