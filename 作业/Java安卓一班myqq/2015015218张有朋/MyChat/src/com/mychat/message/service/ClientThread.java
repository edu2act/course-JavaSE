package com.mychat.message.service;

import java.io.OutputStream;
import java.net.Socket;

import com.mychat.yp.message;
import com.mychat.util.SerializableUtil;

public class ClientThread implements Runnable {
	message message;
	String ip;
	public ClientThread(message message, String ip) {
		this.message=message;
		this.ip=ip;
	}
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		try {
			Socket socket=new Socket(ip, 8888);
			OutputStream os=socket.getOutputStream();
			byte cache[]=SerializableUtil.serializableMessage(message);
			os.write(cache);
			os.flush();
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
