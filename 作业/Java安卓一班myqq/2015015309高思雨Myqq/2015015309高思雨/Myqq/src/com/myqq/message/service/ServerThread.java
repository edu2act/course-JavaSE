package com.myqq.message.service;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;

import com.myqq.entity.Message;
import com.myqq.entity.User;
import com.myqq.message.view.ChatFrame;
import com.myqq.user.service.UserServiceImpl;
import com.myqq.user.view.MainFrame;
import com.myqq.util.SerializableUtil;

public class ServerThread implements Runnable{

	HashMap<Integer,ChatFrame> frames = new HashMap<Integer,ChatFrame>();
	
	MainFrame a;
	public ServerThread(MainFrame mainFrame){
		this.a = mainFrame;
	}
	
	public void run(){
		try{
			ServerSocket serverSocket = new ServerSocket(8888);
			while(true){
				Socket socket = serverSocket.accept();
				InputStream is = socket.getInputStream();
				byte[] cache = new byte[1024];	
				is.read(cache);
				Message message = SerializableUtil.unSerializableMessage(cache);
				
				boolean isExit = false;
				
				int a = 0;
				for(int i=0;i<SStaic.fuck.size();i++){
					if(SStaic.fuck.get(i).getMyself().getQqNum() == message.getReceiver()
							&& SStaic.fuck.get(i).getAnother().getQqNum() == message.getSender()){
						isExit = true;
						a = i;
					}
						
				}
				if(!isExit){
					ChatFrame chatFrame = new ChatFrame(new UserServiceImpl().listByQqNum(message.getReceiver()),
							new UserServiceImpl().listByQqNum(message.getSender()).getQqNum()+" "
							+new UserServiceImpl().listByQqNum(message.getSender()).getNickName());
					//	实现将对方发送的消息显示在界面上
					chatFrame.getTxtList().setText(new UserServiceImpl().listByQqNum(message.getSender()).getNickName()
							+":"+message.getContent()+'\n');
					SStaic.fuck.add(chatFrame);
				}else{
					String content = SStaic.fuck.get(a).getTxtList().getText();
					SStaic.fuck.get(a).getTxtList().setText(content+new UserServiceImpl().listByQqNum(message.getSender()).getNickName()
							+":"+message.getContent()+'\n');
				}
				is.close();
				
				
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	

	
}