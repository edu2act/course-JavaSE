package com.myqq.message.service;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

import com.myqq.entity.Message;
import com.myqq.message.view.ChatFrame;
import com.myqq.user.service.UserServiceImpl;
import com.myqq.user.view.MainFrame;
import com.myqq.util.SerializableUtil;

public class ServerThread implements Runnable {
	//	这个HashMap仅仅是为了实现对二号发送第二个消息时弹出两个界面的问题。
	//	现在不需要了，有了静态类SStaic，都实现了。
	HashMap<Integer,ChatFrame> frames = new HashMap<Integer,ChatFrame>();
	
	
	MainFrame a;
	public ServerThread(MainFrame mainFrame){
		this.a = mainFrame;
	}
	
	public void run(){
		try{
			ServerSocket serverSocket = new ServerSocket(8888);
			while(true){
				//	开始监听
				Socket socket = serverSocket.accept();
				InputStream is = socket.getInputStream();
				byte[] cache = new byte[1024];	//	不再考虑接受数组的大小，只要小于1024个字节
				//	将读取到的字节存储到cache字节数组中
				is.read(cache);
				//	反序列化得到发送的message对象
				Message message = null;
				try {
					message = SerializableUtil.unSerializableMessage(cache);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//	TODO接收消息并放置到文本框中
				//	由于是在主界面接收到的消息，所以要新建一个聊天窗口并且显示消息
				
				boolean isExit = false;
				
				int a = 0;
				for(int i=0;i<SStatic.chat.size();i++){
					if(SStatic.chat.get(i).getMyself().getQqnum() == message.getReceiver()
							&& SStatic.chat.get(i).getAnother().getQqnum() == message.getSender()){
						isExit = true;
						a = i;
					}
						
				}
				if(!isExit){
					ChatFrame chatFrame = new ChatFrame(new UserServiceImpl().listByQqNum(message.getReceiver()),
							new UserServiceImpl().listByQqNum(message.getSender()).getQqnum()+" "
							+new UserServiceImpl().listByQqNum(message.getSender()).getNickName());
					//	实现将对方发送的消息显示在界面上
					chatFrame.getTxtList().setText(new UserServiceImpl().listByQqNum(message.getSender()).getNickName()
							+":"+message.getContent()+'\n');
					SStatic.chat.add(chatFrame);
				}else{
					String content = SStatic.chat.get(a).getTxtList().getText();
					SStatic.chat.get(a).getTxtList().setText(content+new UserServiceImpl().listByQqNum(message.getSender()).getNickName()
							+":"+message.getContent()+'\n');
				}
				is.close();
				
				
//				if(is.available()>0){
//					//	available()方法返回此输入流在不受阻塞情况下能读取的字节数。
//					//	网络socket流在读取时如果没有内容read()方法是会受阻的
//					byte[] cache = new byte[is.available()];
//					//	将读取到的字节存储到cache字节数组中
//					is.read(cache);
//					//	再将反序列化得到message
//					Message message = SerializableUtil.unSerializableMessage(cache);
//					
//					
//					//	TODO接收消息并放置到文本框中
//					//	由于是在主界面接收到的消息，所以要新建一个聊天窗口并且显示消息			
//					
//				}
				
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		try{
//			ServerSocket serverSocket=new ServerSocket(8888);
//			while(true){
//				Socket socket=serverSocket.accept();
//				InputStream is=socket.getInputStream();
//				if(is.available()>0){
//					byte cache[]=new byte[is.available()];
//					is.read(cache);
//					Message message=SerializableUtil.unSerializableMessage(cache);
////					System.out.println(message.getSender());
////					System.out.println(message.getContent());
//					// TODO 接受消息并放置到文本框中
//					addChatFrame(message);
//					is.close();
//					
//				}
//			}
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//
//	}
//	public void addChatFrame(Message message){
//			
//		
//		//	这里参考树控件的方法来令聊天窗口只存在一个
//		boolean isExit = false;
//		Iterator i = frames.keySet().iterator();
//		while(i.hasNext()){
//			if(message.getSender() == Integer.parseInt(i.next().toString())){
//				isExit = true;
//			}
//		}
//		if(!isExit){
//			ChatFrame chatFrame = new ChatFrame(new UserServiceImpl().listByQqNum(message.getReceiver()),
//					new UserServiceImpl().listByQqNum(message.getSender()).getQqnum()+" "
//					+new UserServiceImpl().listByQqNum(message.getSender()).getNickName());
//			//	实现将对方发送的消息显示在界面上
//			chatFrame.getTxtList().setText(new UserServiceImpl().listByQqNum(message.getSender()).getNickName()
//					+":"+message.getContent()+'\n');
//			frames.put(message.getSender(), chatFrame);
//		}else{
//			//	存在这个界面的话，还要更新聊天界面的内容。
//			//	难点是怎样获得这个界面
//			String content = frames.get(message.getSender()).getTxtList().getText();
//			frames.get(message.getSender()).getTxtList().setText(content+new UserServiceImpl().listByQqNum(message.getSender()).getNickName()
//					+":"+message.getContent()+'\n');
//		}


