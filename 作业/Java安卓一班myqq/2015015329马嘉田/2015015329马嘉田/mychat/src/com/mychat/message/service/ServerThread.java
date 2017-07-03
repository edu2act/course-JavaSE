package com.mychat.message.service;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;

import com.mychat.entity.Message;
import com.mychat.util.SerializableUtil;
import com.mychat.message.service.SStaic;
import com.mychat.user.view.MainFrame;
import com.mychat.user.service.UserServiceImpl;
import com.mychat.message.view.ChatFrame;

public class ServerThread implements Runnable {
	
	MainFrame mainFrame;
	public ServerThread(MainFrame mainFrame) {
		this.mainFrame=mainFrame;
	}
	

	HashMap<Integer,ChatFrame> frames = new HashMap<Integer,ChatFrame>();

	
	
public void addChatFrame(Message message){
			
		
		boolean isExit = false;
		Iterator i = frames.keySet().iterator();
		while(i.hasNext()){
			if(message.getSender() == Integer.parseInt(i.next().toString())){
				isExit = true;
			}
		}
		if(!isExit){
			ChatFrame chatFrame = new ChatFrame(new UserServiceImpl().listByChatNum(message.getReceiver()),
					new UserServiceImpl().listByChatNum(message.getSender()).getMyChatNum()+" "
					+new UserServiceImpl().listByChatNum(message.getSender()).getNickName());
			//	实现将对方发送的消息显示在界面上
			chatFrame.getTxtList().setText(new UserServiceImpl().listByChatNum(message.getSender()).getNickName()
					+":"+message.getContent()+'\n');
			frames.put(message.getSender(), chatFrame);
		}else{

			String content = frames.get(message.getSender()).getTxtList().getText();
			frames.get(message.getSender()).getTxtList().setText(content+new UserServiceImpl().listByChatNum(message.getSender()).getNickName()
					+":"+message.getContent()+'\n');
		}
		
		
		
	}
	
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		
		
		
		
		
		try {
			ServerSocket serverSocket = new ServerSocket(8888);
			while(true){
				Socket socket = serverSocket.accept();
				InputStream is = socket.getInputStream();
				byte cache[] = new byte[1024];
				is.read(cache);
				
				Message message = new Message();
				try {
					message = SerializableUtil.unSerializableMessage(cache);
					addChatFrame(message);
					System.out.println(message.getSender());
					System.out.println(message.getContent());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				boolean isExit = false;
				
				int a = 0;
				for(int i=0;i<SStaic.fframe.size();i++){
					if(SStaic.fframe.get(i).getMyself().getMyChatNum() == message.getReceiver()
							&& SStaic.fframe.get(i).getAnother().getMyChatNum() == message.getSender()){
						isExit = true;
						a = i;
					}
						
				}
				if(!isExit){
					ChatFrame chatFrame = new ChatFrame(new UserServiceImpl().listByChatNum(message.getReceiver()),
							new UserServiceImpl().listByChatNum(message.getSender()).getMyChatNum()+" "
							+new UserServiceImpl().listByChatNum(message.getSender()).getNickName());
					//	实现将对方发送的消息显示在界面上
					chatFrame.getTxtList().setText(new UserServiceImpl().listByChatNum(message.getSender()).getNickName()
							+":"+message.getContent()+'\n');
					SStaic.fframe.add(chatFrame);
				}else{
					String content = SStaic.fframe.get(a).getTxtList().getText();
					SStaic.fframe.get(a).getTxtList().setText(content+new UserServiceImpl().listByChatNum(message.getSender()).getNickName()
							+":"+message.getContent()+'\n');
				}
				is.close();

				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}
