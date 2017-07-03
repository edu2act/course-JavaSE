package com.myqq.file.service;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import com.myqq.entity.File;
import com.myqq.entity.Message;
import com.myqq.util.SerializableUtil;

public class ClientThread implements Runnable {
	
	File file;
	String ip;
	public ClientThread(File file, String ip) {
		this.file=file;
		this.ip=ip;
	}
	
	@Override
	public void run() {
		try {
			Socket socket=new Socket(ip, 8888);
			OutputStream os=socket.getOutputStream();
			byte cache[]=SerializableUtil.serializableFile(file);
			os.write(cache);
			os.flush();
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
