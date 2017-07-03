package com.myqq.file;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class Client extends JFrame implements ActionListener{ 
	private JButton open=new JButton("选择文件");
	private DatagramPacket dp;
	//数据报包
	private DatagramSocket ds;
	//数据报Socket
	private String filename;
	//保存选择的文件的名字
	private FileInputStream fis;
	//输入流，用来读取磁盘文件
	byte[]buf=new byte[10240]; 
	//字节数组，存放读取的文件的数据构造方法，构建界面
	public Client(){ 
//		this.setSize(200,100);
//		this.setTitle("发送文件"); 
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
//		this.setLayout(new FlowLayout());
//		this.add(open); 
//		open.addActionListener(this);
//		this.setVisible(true);
	} 
	public void start(){ 
		try{ 
			ds=new DatagramSocket(1234); 
			//首先启动Socket 
		}catch(SocketException e){ 
			e.printStackTrace();
		}
	} 
	public static void main(String[]args){ 
		new Client().start();
	} 
	//事件响应代码 
	public void actionPerformed(ActionEvent e){ 
		JFileChooser jfc=new JFileChooser(); 
		//文件选择器组件 
		jfc.showOpenDialog(this);
		//显示打开对话框
		filename=jfc.getSelectedFile().getPath(); 
		//获得选中文件路径和名字 
		try{ 
			fis=new FileInputStream(filename);
			int c; 
			while((c=fis.read(buf))!=-1){
				//读文件，数据 
				//存入buf字节数组 
				//利用buf做数据报包
				dp=new DatagramPacket(buf,c,new InetSocketAddress("127.0.0.1",8888));
				ds.send(dp);
				//发送出去
			} 
			fis.close(); 
		}catch(IOException e2){ 
			e2.printStackTrace();
		}
	}
}