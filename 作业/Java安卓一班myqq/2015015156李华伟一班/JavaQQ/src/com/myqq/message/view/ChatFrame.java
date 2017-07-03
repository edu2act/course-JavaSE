package com.myqq.message.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.myqq.entity.Message;
import com.myqq.entity.User;
import com.myqq.message.service.MessageThread;
import com.myqq.user.dao.MessageDaoImpl;
import com.myqq.user.service.UserServiceImpl;
import com.myqq.util.IpUtil;

public class ChatFrame extends JFrame{
	User myself;
	User another;
	
	public JTextArea txtList=null;
	public JTextField txtMsg=null;
	public JButton btn=null;
	
	private Socket socket;
	private PrintWriter writer;
	private BufferedReader reader;
	private ServerSocket serverSocket;
	
	public ChatFrame(User myself, String other) throws IOException{
		this.myself=myself;
		String temp[]=other.split(" ");
		UserServiceImpl userServiceImpl=new UserServiceImpl();
		another=userServiceImpl.listByQqNum(Integer.parseInt(temp[0]));
		JPanel panel=new JPanel();
		this.getContentPane().add(panel);
		panel.setLayout(new BorderLayout());
		
		txtList=new JTextArea(5, 20);
		panel.add(txtList, BorderLayout.CENTER);
		
		JPanel txtPanel=new JPanel();
		txtMsg=new JTextField(10);
		btn=new JButton("发送");
		txtPanel.add(txtMsg);
		txtPanel.add(btn);
		panel.add(txtPanel, BorderLayout.SOUTH);
		
		this.setTitle(temp[1]);
		this.setSize(400,300);
		this.setVisible(true);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				send();
			}
		});
		
		MessageThread mess=new MessageThread(txtList);
		mess.start();
		
	}
	public void send(){
		MessageDaoImpl mess=new MessageDaoImpl();
		String msg=this.txtMsg.getText().trim();
		Message message=new Message();
		message.setContent(msg);
		message.setSender(this.myself.getQqnum());
		message.setReceiver(this.another.getQqnum());
		message.setSendTime(new Date());
		message.setReceiveTime(new Date());
		message.setState(1);
		mess.saveMessage(message);
		this.txtMsg.setText(""); 
        String hostIp=IpUtil.getLocalHostAddress();
		try {
			socket=new Socket(hostIp,666);
			writer=new PrintWriter(socket.getOutputStream());
			reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			writer.println(myself.getQqnum()+ "@" +this.another.getQqnum()+ "@" + "ALL" + "@" + msg);
			writer.flush();
		} catch (UnknownHostException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
}
