package com.myqq.message.service;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.myqq.entity.Message;
import com.myqq.util.SerializableUtil;

public class ServerThread extends Thread {

	@Override
	public void run() {
		try{
			ServerSocket serverSocket=new ServerSocket(1234);
			while(true){
				Socket socket=serverSocket.accept();
				InputStream is=socket.getInputStream();
				byte cache[]=new byte[is.available()];
				is.read(cache);
				Message message=SerializableUtil.unSerializableMessage(cache);
				System.out.println(message.getSender());
				System.out.println(message.getContent());
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
