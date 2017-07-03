package com.MYQQ.message.service;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.MYQQ.entity.message;
import com.MYQQ.message.vew.ChatFrame;

import com.MYQQ.util.Serializableutil;

public class ServerThread implements Runnable{
private ChatFrame chatFrame;
	public ServerThread(){}
	public ServerThread(ChatFrame ChatFrame){
		this.chatFrame=ChatFrame;
	}

	
	@Override
	public void run() {
		try{
			ServerSocket ss=new ServerSocket(8888);
			while(true){
				Socket s=ss.accept();
				InputStream is=s.getInputStream();
				if(is.available()>0){
				byte[] temp=new byte[is.available()];
				is.read(temp);
				message message=Serializableutil.unSeralizableMessage(temp);
				System.out.println(message.getSender());
				System.out.println(message.getReceiver());
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
