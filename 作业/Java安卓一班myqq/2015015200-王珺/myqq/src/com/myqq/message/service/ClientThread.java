package com.myqq.message.service;

import java.io.OutputStream;
import java.net.Socket;

import com.myqq.entity.Message;
import com.myqq.util.SerializableUtil;

public class ClientThread implements Runnable {

	Message message;
	String ip;
	public ClientThread(Message message, String ip) {
		this.message=message;
		this.ip=ip;
	}
	
	public void run() {
		try{
			Socket socket=new Socket("127.0.0.1", 8888);
			OutputStream os=socket.getOutputStream();
			os.write(SerializableUtil.serializableMessage(message));
			os.flush();
			os.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		

	}
	
	
}




