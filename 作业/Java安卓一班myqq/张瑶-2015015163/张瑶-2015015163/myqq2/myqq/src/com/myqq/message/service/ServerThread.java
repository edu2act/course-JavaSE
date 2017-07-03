package com.myqq.message.service;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;


import com.myqq.entity.Message;
import com.myqq.message.view.ChatFrame;
import com.myqq.user.view.MainFrame;
import com.myqq.util.SerializableUtil;


public class ServerThread implements Runnable {
	
	public MainFrame mainFrame;
	public ServerThread(MainFrame mainFrame){
		this.mainFrame = mainFrame;
	}
	@Override
	public void run() {
		try{
			ServerSocket serverSocket=new ServerSocket(8888);
			while(true){
				Socket socket=serverSocket.accept();
				InputStream is=socket.getInputStream();
				if(is.available()>0){
					byte cache[]=new byte[is.available()];
					is.read(cache);
					Message message=SerializableUtil.unSerializableMessage(cache);
					
				// 接收消息并放置到文本框中
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
