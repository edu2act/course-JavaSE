package com.myqq.message;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import org.omg.CORBA.portable.OutputStream;

import com.myqq.entity.Message;
import com.myqq.util.SerializableUtil;

public class MessageSend implements Runnable  {

	Message msg;
	String ip;
	public MessageSend(Message msg,String ip) {
		this.msg = msg;
		this.ip = ip;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Socket socket = new Socket(ip,8888);
			OutputStream os = (OutputStream) socket.getOutputStream();
			os.write(SerializableUtil.serializableMessage(msg));
			os.close();
			socket.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
