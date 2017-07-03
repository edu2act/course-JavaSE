package com.myqq.message.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.StringTokenizer;

import javax.swing.JTextArea;

import com.myqq.util.IpUtil;

public class ClientThread extends Thread {
	private BufferedReader reader;
	private JTextArea c;
	private String qqnum;
	public Socket socket;
	private PrintWriter writer;
	private boolean isCon=false;
	public ClientThread(String qqnum){
		
		this.qqnum=qqnum;
	}
	public void run(){
		IpUtil Ip=new IpUtil(); 
        String hostIp=Ip.getLocalHostAddress(); 
        boolean flag = connectServer(666, hostIp, qqnum);//连接服务器  
	}
	//发送消息
	public void sendMessage(String message) {  
        writer.println(message);  
        writer.flush();  
    }
	//连接服务器
	public boolean connectServer(int port,String hostIp,String qqnum){
		try {
			socket=new Socket(hostIp,port);
			writer=new PrintWriter(socket.getOutputStream());
			reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			sendMessage(qqnum + "@"+"111"+ "@" +"hh"+"@"+ socket.getLocalAddress().toString());
			isCon=true;
			return isCon;
			
		} catch (UnknownHostException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
}
