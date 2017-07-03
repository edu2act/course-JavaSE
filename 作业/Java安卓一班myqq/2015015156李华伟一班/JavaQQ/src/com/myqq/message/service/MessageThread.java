package com.myqq.message.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;

import javax.swing.JTextArea;

public class MessageThread extends Thread {
	private BufferedReader reader;
	private JTextArea con;
	private ServerSocket serverSocket;
	public MessageThread(JTextArea con){
		this.con=con;
	}
	
	public void run(){
		String message=null;
		try {
			 serverSocket=new ServerSocket(667);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		while(true){
			try {
				Socket socket=serverSocket.accept();
				reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
				message=reader.readLine();
				con.append(message+"\r\n");
			} catch (IOException e){
				e.printStackTrace();
			}
		}
	}
}
