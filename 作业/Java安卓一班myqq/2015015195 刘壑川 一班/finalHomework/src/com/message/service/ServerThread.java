package com.message.service;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;

import com.bean.*;
import com.message.view.ChatFrame;
import com.user.service.UserServiceImpl;
import com.user.view.MainFrame;
import com.util.SerializableUtil;

public class ServerThread implements Runnable{
	
	private UserServiceImpl userServiceImpl;
	private MainFrame mainFrame;
	public ServerThread(MainFrame mainFrame){
		this.mainFrame = mainFrame;
	}
	public void run(){
		try{
			ServerSocket serverSocket = new ServerSocket(9999);
			while(true){
				userServiceImpl = new UserServiceImpl();
				Socket socket = serverSocket.accept();//监听
				InputStream is = socket.getInputStream();
				if(is.available() > 0){
					byte[] cache = new byte[is.available()];
					is.read(cache);
					Message message = SerializableUtil.unserializableMessage(cache);
					System.out.println("对方已收到");
					//接收消息并放到文本框中
					Iterator i = mainFrame.chatingFrames.keySet().iterator();
					boolean isExist = false;
					while(i.hasNext()){
						int key = Integer.parseInt(i.next().toString());
						if(message.getSender() == key){
							ChatFrame chatFrame=mainFrame.chatingFrames.get(key);
							String content=chatFrame.txtList.getText();
							chatFrame.txtList.setText(content+chatFrame.another.getNickName()+":"+message.getContent());
							isExist=true;
							break;
						}
					}
					if(!isExist){
						ChatFrame chatFrame=new ChatFrame(mainFrame.myself,userServiceImpl.findUserByQQNum(message.getSender()).getQQNum()+" "+userServiceImpl.findUserByQQNum(message.getSender()).getNickName());
						mainFrame.chatingFrames.put(message.getSender(), chatFrame);
					}
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
