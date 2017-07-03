package com.mychat.message;

import java.io.OutputStream;
import java.net.Socket;

import com.mychat.util.SerializableUtil;
import com.mychat.yp.message;

public class MessageSend {
	public class MessageSendThread implements Runnable {
		message msg;
		String ip;
		
		public MessageSendThread(message msg, String ip) {
			super();
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
			} catch(Exception e) {
				e.printStackTrace();
			} 
			
		}
	}
}
