package com.GoChat.message.service;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;

import com.GoChat.entity.Message;
import com.GoChat.message.view.ChatFrame;
import com.GoChat.util.SerializableUtil;
import com.GoChat.user.view.MainFrame;

public class ServerThread implements Runnable {

	MainFrame mainFrame;
	public void run() {
		try{

			System.out.println("hh");
			ServerSocket serverSocket=new ServerSocket(9999);
			while(true){
				Socket socket=serverSocket.accept();
				InputStream is=socket.getInputStream();
				if(is.available()>0){
					byte cache[]=new byte[is.available()];
					is.read(cache);
					Message message=SerializableUtil.unSerializableMessage(cache);
					System.out.println(message.getSender());
					System.out.println(message.getContent());
					//接受消息并放置到文本框中
					Iterator i=mainFrame.chatingFrames.keySet().iterator();
					boolean isExist=false;
					while(i.hasNext()){
						int key=Integer.parseInt(i.next().toString());
						if(message.getSender()==key){
							ChatFrame chatFrame=mainFrame.chatingFrames.get(key);
							String content=chatFrame.txtList.getText();
							chatFrame.txtList.setText(content+chatFrame.another.getNickName()+":"+message.getContent());
							isExist=true;
							break;
						}
					}
					if(!isExist){
						ChatFrame chatFrame=new ChatFrame(mainFrame.myself,message.getSender()+" jlk");
						mainFrame.chatingFrames.put(message.getSender(), chatFrame);
					}
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
