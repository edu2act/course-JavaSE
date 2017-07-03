package com.mychat.message.service;

import java.io.OutputStream;
import java.net.Socket;

import com.mychat.entity.Message;
import com.mychat.util.SerializableUtil;

public class ClientThread implements Runnable {

	private Message message;
	private String ip;
	
	public ClientThread(Message message,String ip){
		this.message = message;
		this.ip = ip;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			Socket socket = new Socket(ip,8888);
			OutputStream os = socket.getOutputStream();
			byte[] cache = SerializableUtil.serializableMessage(message);
			os.write(cache);
			os.flush();
			os.close();
//			socket.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
