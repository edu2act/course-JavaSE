package com.MYQQ.message;

import java.io.OutputStream;
import java.net.Socket;

import com.MYQQ.entity.message;
import com.MYQQ.util.Serializableutil;

public class messageSend implements Runnable{

	message msg;
	String ip;
	public messageSend(message msg,String ip){
		this.msg=msg;
		this.ip=ip;
	}
	
	@Override
	public void run() {
		try{
			Socket socket =new Socket(ip,8888);
			OutputStream os=socket.getOutputStream();
			os.write(Serializableutil.serializableMessage(msg));
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
