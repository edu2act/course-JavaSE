package com.myqq.message.view;

import java.io.OutputStream;
import java.net.Socket;

public class ClientThread implements Runnable {
	private String msg;
	public ClientThread(String msg){
		this.msg=msg;
	}
	
	Socket s=null;
	public void run() {
		try{
			s=new Socket("127.0.0.1", 8888);
			OutputStream os=s.getOutputStream();
			os.write(msg.getBytes());
			os.flush();
			os.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
