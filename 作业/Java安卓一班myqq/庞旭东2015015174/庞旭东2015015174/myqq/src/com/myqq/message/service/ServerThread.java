package com.myqq.message.service;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.myqq.entity.Message;
import com.myqq.message.view.ChatFrame;
import com.myqq.util.SerializableUtil;

public class ServerThread implements Runnable {
	private ChatFrame chatFrame;
	
	public ServerThread(){
		this.chatFrame=chatFrame;
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
					System.out.println(message.getSender());
					System.out.println(message.getContent());
					// 接受消息并放置到文本框中
					String hisname=chatFrame.getName();
					String msg=new String(cache);
					ChatFrame.txtList.setText(hisname+":"+msg);
				
					is.close();
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
