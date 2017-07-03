package com.myqq.message.sevice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import com.myqq.entity.Message;
import com.myqq.message.view.ChatFrame;
import com.myqq.user.service.UserServiceImpl;
import com.myqq.util.SerializableUtil;


public class ServerThread implements Runnable {

    HashMap<Integer,ChatFrame> frames = new HashMap<Integer,ChatFrame>();
	
	HashMap<Integer,ChatFrame> fframes = new HashMap<Integer,ChatFrame>();

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
					// TODO 接受消息并放置到文本框中
					
				}
			}
				
		}catch(Exception e){
			e.printStackTrace();
		}
	}
public void addChatFrame(Message message){
			
		
		boolean isExit = false;
		Iterator i = frames.keySet().iterator();
		while(i.hasNext()){
			if(message.getSender() == Integer.parseInt(i.next().toString())){
				isExit = true;
			}
		}
		if(!isExit){
			ChatFrame chatFrame = new ChatFrame(new UserServiceImpl().listByQqNum(message.getReceiver()),
					new UserServiceImpl().listByQqNum(message.getSender()).getQqnum()+" "
					+new UserServiceImpl().listByQqNum(message.getSender()).getNickName());
			//	实现将对方发送的消息显示在界面上
			chatFrame.getTxtList().setText(new UserServiceImpl().listByQqNum(message.getSender()).getNickName()
					+":"+message.getContent()+'\n');
			frames.put(message.getSender(), chatFrame);
		}else{

			String content = frames.get(message.getSender()).getTxtList().getText();
			frames.get(message.getSender()).getTxtList().setText(content+new UserServiceImpl().listByQqNum(message.getSender()).getNickName()
					+":"+message.getContent()+'\n');
		}
		
}
}

