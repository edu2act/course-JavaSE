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
				Message message = SerializableUtil.unSerializableMessage(cache);
				//	TODO接收消息并放置到文本框中
				//	由于是在主界面接收到的消息，所以要新建一个聊天窗口并且显示消息
				
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
	
//	//	先判断是不是存在跟对方的聊天界面
//	//	TODO添加了聊天界面之后，还需要将对方发送的消息显示在界面上
//	public void addChatFrame(Message message){
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
//					new UserServiceImpl().listByQqNum(message.getSender()).getQqNum()+" "
//					+new UserServiceImpl().listByQqNum(message.getSender()).getNickName());
//			//	实现将对方发送的消息显示在界面上
//			chatFrame.getTxtList().setText(new UserServiceImpl().listByQqNum(message.getSender()).getNickName()
//					+":"+message.getContent()+'\n');
//			frames.put(message.getSender(), chatFrame);
//			SStaic.fuck.add(chatFrame);
//		}else{
//			//	存在这个界面的话，还要更新聊天界面的内容。
//			//	难点是怎样获得这个界面
//			String content = frames.get(message.getSender()).getTxtList().getText();
//			frames.get(message.getSender()).getTxtList().setText(content+new UserServiceImpl().listByQqNum(message.getSender()).getNickName()
//					+":"+message.getContent()+'\n');
//		}
		
		//	TODO解决当在主界面开启对二号的聊天界面时，二号发送消息仍然弹出新窗口的问题。
		//	是不是可以在接受线程内解决，当接受到消息的时候，判断是不是在主界面的chatFrames中存在，因为当
		//	点击的时候就会在chatFrames中进行更新
		//	只能收到对方发来的消息。跟mainFrame没有联系啊  不会呢。。。 
		//	我尝试了使用创建新的关系来chatFrame，里面两个属性存放发送者和接收者，这样就不会出现重复，但是仍然有
		//	问题，一是：数据库每次测试都要将数据全删除，二是仍然无法获取第一次双击出现的聊天界面
		//	我想到了使用静态类SStaic，定义ArrayList来存放ChatFrame，这样我就能获取到双击出现的聊天界面而且
		// 	还可以轻松地做出是否存在的判断。至此，QQ程序设计完毕。大规模注释的是不再需要的代码，保存是为了表现我
		//	确实是有敲过的。
		
		
//	}
	
}