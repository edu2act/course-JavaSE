package com.myqq.message.view;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.sun.corba.se.spi.orbutil.fsm.Input;

public class ServerThread implements Runnable{
	
	private ChatFrame chatFrame;
	
	public ServerThread(ChatFrame chatFrame){
		this.chatFrame=chatFrame;
	}

	ServerSocket ss=null;
	@Override
	public void run() {
		try{
			ss=new ServerSocket(8888);
			while(true){
				Socket s=ss.accept();
				InputStream is=s.getInputStream();
				byte[] temp=new byte[1024];
				is.read(temp);
				String msg=chatFrame.txtList.getText()+new String(temp);
				chatFrame.txtList.setText(msg);
				is.close();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
