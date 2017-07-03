package com.myqq.message.view;

import com.myqq.message.service.ServersThread;

public class ServerMain {
	public static void main(String[] args) {
		ServersThread ser=new ServersThread();
		ser.run();
	}
	
}
