package com.myqq.message;

import java.io.OutputStream;
import java.net.Socket;

import com.myqq.entity.Message;
import com.myqq.util.SerializableUtil;

public class MessageSend implements Runnable {

	Message msg;
	String ip;

	public MessageSend(Message msg, String ip) {
		this.msg = msg;
		this.ip = ip;
	}

	@Override
	public void run() {
		try {
			Socket socket = new Socket(ip, 8888);
			OutputStream os = socket.getOutputStream();
			os.write(SerializableUtil.serializableMessage(msg));
			os.close();
			socket.close();
			// TODO sdlfjsldkjf
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
