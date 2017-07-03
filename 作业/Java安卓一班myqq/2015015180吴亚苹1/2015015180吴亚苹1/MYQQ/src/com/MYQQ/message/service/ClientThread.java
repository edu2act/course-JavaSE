package com.MYQQ.message.service;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import com.MYQQ.entity.message;
import com.MYQQ.util.Serializableutil;
public class ClientThread implements Runnable{
	message message;
	String ip;
	public ClientThread(message message, String ip) {
		this.message=message;
		this.ip=ip;
	}
	
	@Override
	public void run() {
		try {
			Socket socket=new Socket(ip, 8888);
			OutputStream os=socket.getOutputStream();
			byte cache[]=Serializableutil.serializableMessage(message);
			os.write(cache);
			os.flush();
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
