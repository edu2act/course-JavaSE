package com.myqq.message.filetransfer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SendFileServer implements Runnable{
	// 服务器监听端口   
	private static final int MONITORPORT  = 12345;  
	private Socket s;      
	public SendFileServer(Socket s) {   
		super();   
		this.s = s;  
	}    
	public static void server()  {   
		try {    
			// 创建服务器socket     
			ServerSocket ss = new ServerSocket(MONITORPORT);
			while(true){     
				// 接收到一个客户端连接之后，创建一个新的线程进行服务     
				// 并将联通的socket传给该线程     
				Socket s = ss.accept();     
				new Thread(new SendFileServer(s)).start();    
			}
		}catch(IOException e) {    
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {   
		SendFileServer.server();  
	}
	
	public void run() {   
		byte[] buf = new byte[100];   
		OutputStream os=null;   
		FileInputStream fins=null;   
		try {    
			os = s.getOutputStream();    
			// 文件路径    
			String filePath = "E:a.txt";    
			// 文件名    
			String fileName = "a.txt";    
			System.out.println("将文件名:"+fileName+"传输过去");    
			//先将文件名传输过去     
			os.write(fileName.getBytes());     
			System.out.println("开始传输文件");    
			//将文件传输过去     
			// 获取文件     
			fins = new FileInputStream(filePath);    
			int data;        
			// 通过fins读取文件，并通过os将文件传输
			while(-1!=(data = fins.read())){     
				os.write(data);    
			}     
			System.out.println("文件传输结束");
		}catch (IOException e) {    
			e.printStackTrace();   
		}finally{    
			try {     
				if(fins!=null) 
					fins.close();     
				if(os!=null) 
					os.close();     
				this.s.close();    
			} catch (IOException e) {     
				e.printStackTrace();    
			}       
		}
	}
	
}

