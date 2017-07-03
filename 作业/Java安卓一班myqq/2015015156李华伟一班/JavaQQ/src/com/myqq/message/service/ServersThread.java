package com.myqq.message.service;

import com.myqq.Server;

public class ServersThread extends Thread{
	public void run(){
		new Server();
	}
}
