package com.myqq.message.service;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.myqq.entity.Message;
import com.myqq.util.SerializableUtil;

public class ServerThread implements Runnable {

	@Override
	public void run() {
		try{
			ServerSocket serverSocket=new ServerSocket(8886);
			while(true){
				Socket socket=serverSocket.accept();
				InputStream is=socket.getInputStream();
				if(is.available()>0){
					byte cache[]=new byte[is.available()];
					is.read(cache);
					Message message=SerializableUtil.unSerializableMessage(cache);
					System.out.println(message.getSender());
					System.out.println(message.getContent());
					// TODO 接受消息并放置到文本框中
					
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
