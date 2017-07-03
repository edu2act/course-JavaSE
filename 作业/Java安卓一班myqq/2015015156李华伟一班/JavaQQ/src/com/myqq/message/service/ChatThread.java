package com.myqq.message.service;

import java.io.IOException;

import com.myqq.entity.User;
import com.myqq.message.view.ChatFrame;
import com.myqq.util.IpUtil;

public class ChatThread extends Thread{
	private User u;
	private String s;
	public ChatThread(User u,String s){
		this.s=s;
		this.u=u;
	}
	public void run(){
		try {
			ChatFrame chatFrame=new ChatFrame(u,s);
		} catch (IOException e) {
			e.printStackTrace();
		}
		//启动线程
		
	}
}
