package com.MyQQ.message.service;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import com.MyQQ.entity.Message;
import com.MyQQ.util.SerializableUtil;

public class ClientThread implements Runnable {
	
	Message message;
	String ip;
	public ClientThread(Message message, String ip) {
		this.message=message;
		this.ip=ip;
	}
	
	
	@Override
	public void run() {
		try {
			Socket socket=new Socket(ip, 8888);
			OutputStream os=socket.getOutputStream();
			byte cache[]=SerializableUtil.SerializableMessage(message);
			os.write(cache);
			os.flush();
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
