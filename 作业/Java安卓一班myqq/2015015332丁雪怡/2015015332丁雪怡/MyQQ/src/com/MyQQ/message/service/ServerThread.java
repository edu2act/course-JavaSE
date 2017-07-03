package com.MyQQ.message.service;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;

import com.MyQQ.entity.Message;
import com.MyQQ.message.view.ChatFrame;
import com.MyQQ.user.dao.UserDaoImpl;
import com.MyQQ.user.view.MainFrame;
import com.MyQQ.util.SerializableUtil;

public class ServerThread implements Runnable {
	MainFrame mainFrame;
	public ServerThread(MainFrame mainFrame) {
		this.mainFrame=mainFrame;
	}

	@Override
	public void run() {
		try{
			System.out.println("hh");
			ServerSocket serverSocket=new ServerSocket(8888);
			while(true){
				Socket socket=serverSocket.accept();
				InputStream is=socket.getInputStream();
				if(is.available()>0){
					byte cache[]=new byte[is.available()];
					is.read(cache);
					Message message=SerializableUtil.UnSerializableMessage(cache);
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

