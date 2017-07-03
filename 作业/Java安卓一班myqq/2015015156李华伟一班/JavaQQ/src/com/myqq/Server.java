package com.myqq;
import java.awt.BorderLayout;  
import java.awt.Color;  
import java.awt.GridLayout;  
import java.awt.Toolkit;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  
import java.awt.event.WindowAdapter;  
import java.awt.event.WindowEvent;  
import java.awt.event.WindowListener;
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.io.OutputStream;
import java.io.PrintWriter;  
import java.net.BindException;  
import java.net.ServerSocket;  
import java.net.Socket;  
import java.net.UnknownHostException;
import java.util.ArrayList;  
import java.util.StringTokenizer;  
  
import javax.swing.DefaultListModel;  
import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JList;  
import javax.swing.JOptionPane;  
import javax.swing.JPanel;  
import javax.swing.JScrollPane;  
import javax.swing.JSplitPane;  
import javax.swing.JTextArea;  
import javax.swing.JTextField;  
import javax.swing.border.TitledBorder; 
import javax.swing.plaf.synth.ColorType;

import com.myqq.entity.User;
import com.myqq.user.dao.UserDaoImpl;


public class Server {
	private JFrame frame;  
    private JTextArea contentArea;  
    private JTextField txt_message;//消息框  
    private JTextField txt_max;  
    private JTextField txt_port;  
    private JButton btn_start;  
    private JButton btn_stop;  
    private JButton btn_send;  
    private JPanel northPanel;  
    private JPanel southPanel;  
    private JScrollPane rightPanel;  
    private JScrollPane leftPanel;  
    private JSplitPane centerSplit;  
    private JList userList;  
    private DefaultListModel listModel;
    private ServerSocket serverSocket;
    private ServerThread serverThread; 
    private ArrayList<ClientThread> clients;
    private Socket socket;
	private PrintWriter writer;
	private BufferedReader reader;
    private boolean isStart = false;//判断连接是否开始  
    public void send(){
    	if (!isStart) {  
            JOptionPane.showMessageDialog(frame, "服务器还未启动,不能发送消息！", "错误",  
                    JOptionPane.ERROR_MESSAGE); //弹出提示框 
            return;  
        }  
        if (clients.size() == 0) {  
            JOptionPane.showMessageDialog(frame, "没有用户在线,不能发送消息！", "错误",  
                    JOptionPane.ERROR_MESSAGE);  
            return;  
        }  
        String message = txt_message.getText().trim();//.trim方法去掉字符串前后的空格  
        if (message == null || message.equals("")) {  
            JOptionPane.showMessageDialog(frame, "消息不能为空！", "错误",  
                    JOptionPane.ERROR_MESSAGE);  
            return;  
        }  
//        sendServerMessage(message);// 群发服务器消息  
        contentArea.append("服务器说：" + txt_message.getText() + "\r\n");  
        txt_message.setText(null);
    }
    //启动服务器
    
	// 构造放法  
    public Server() {  
        frame = new JFrame("服务器");  
        // 更改JFrame的图标：  
        //服务器头像，不解释  
        frame.setIconImage(Toolkit.getDefaultToolkit().createImage(Server.class.getResource("qq.png")));
        //消息显示区
        contentArea = new JTextArea();  
        contentArea.setEditable(false);  
        contentArea.setForeground(Color.blue);//字体为蓝色
        txt_message = new JTextField(); //发送消息框 
        txt_max = new JTextField("30"); //显示最多在线人数 
        txt_port = new JTextField("666");//显示端口号  
        btn_start = new JButton("启动");//启动按钮  
        btn_stop = new JButton("停止");//停止按钮  
        btn_send = new JButton("发送");//发送按钮  
        btn_stop.setEnabled(false);//设置空间是否可用  
        listModel = new DefaultListModel();//列表的可选项是动态改变的  
        userList = new JList(listModel);//存放实体对象  
  
        southPanel = new JPanel(new BorderLayout());//向下的JPanel  
        southPanel.setBorder(new TitledBorder("写消息"));  
        southPanel.add(txt_message, "Center");  
        southPanel.add(btn_send, "East"); //按钮放右边 ,East是指右边
        
        leftPanel = new JScrollPane(userList);  
        leftPanel.setBorder(new TitledBorder("在线用户"));  
  
        rightPanel = new JScrollPane(contentArea);  
        rightPanel.setBorder(new TitledBorder("消息"));  
  
        centerSplit = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, rightPanel,  
                leftPanel);  
        centerSplit.setDividerLocation(450);//设置分隔条的位置 
        northPanel = new JPanel();  
        northPanel.setLayout(new GridLayout(1, 6));//网格布局 1行6列
        northPanel.add(new JLabel("人数上限"));  
        northPanel.add(txt_max);  
        northPanel.add(new JLabel("端口"));  
        northPanel.add(txt_port);  
        northPanel.add(btn_start);  
        northPanel.add(btn_stop);  
        northPanel.setBorder(new TitledBorder("服务器信息"));  
  
        frame.setLayout(new BorderLayout());  
        frame.add(northPanel, "North");  
        frame.add(centerSplit, "Center");  
        frame.add(southPanel, "South");  
        frame.setSize(600, 400);  
        //frame.setSize(Toolkit.getDefaultToolkit().getScreenSize());//设置全屏  
        int screen_width = Toolkit.getDefaultToolkit().getScreenSize().width;  
        int screen_height = Toolkit.getDefaultToolkit().getScreenSize().height;  
        frame.setLocation((screen_width - frame.getWidth()) / 2,  
                (screen_height - frame.getHeight()) / 2);  
        frame.setVisible(true);  
        //关闭窗口
        frame.addWindowListener(new WindowAdapter() {
        	public void windowClosing(WindowEvent e){
        		if(isStart){
        			closeServer();
        		}
        		System.exit(0);
        	}
		});
        // 文本框按回车键时事件  
        txt_message.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent e) {  
                send();  
            }  
        });  
  
        // 单击发送按钮时事件  
        btn_send.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent arg0) {  
                send();  
            }  
        });
        //为启动按钮添加事件
        btn_start.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int max;
				int port;
				if (isStart) {  
                    JOptionPane.showMessageDialog(frame, "服务器已处于启动状态，不要重复启动！",  
                            "错误", JOptionPane.ERROR_MESSAGE);  
                    return;  
                }
				try {
					try {  
                        max = Integer.parseInt(txt_max.getText());  
                    } catch (Exception e1) {  
                        throw new Exception("人数上限为正整数！");  
                    }
                    if (max <= 0) {  
                        throw new Exception("人数上限为正整数！");  
                    }  
                    try {  
                        port = Integer.parseInt(txt_port.getText());  
                    } catch (Exception e1) {  
                        throw new Exception("端口号为正整数！");  
                    }  
                    if (port <= 0) {  
                        throw new Exception("端口号 为正整数！");  
                    }
					StartUp(max,port);
					contentArea.append("服务器已成功启动!人数上限：" + max + ",端口：" + port  
	                         + "\r\n");
					JOptionPane.showMessageDialog(frame, "服务器成功启动!");
					btn_start.setEnabled(false);  
	                txt_max.setEnabled(false);  
	                txt_port.setEnabled(false);  
	                btn_stop.setEnabled(true);
				} catch (Exception exc) {
					JOptionPane.showMessageDialog(frame, exc.getMessage(),  
                            "错误", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
        //单击停止按钮事件
        btn_stop.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!isStart){
					JOptionPane.showMessageDialog(frame, "服务器还未启动，无需停止！", "错误",  
                            JOptionPane.ERROR_MESSAGE);  
                    return;
				}
				try {
					closeServer();
					btn_start.setEnabled(true);  
	                txt_max.setEnabled(true);  
	                txt_port.setEnabled(true);  
	                btn_stop.setEnabled(false);  
	                contentArea.append("服务器成功停止!\r\n");
	                JOptionPane.showMessageDialog(frame, "服务器成功停止！");
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(frame, "停止服务器发生异常！", "错误",  
                            JOptionPane.ERROR_MESSAGE);
				}
			}
		});
    }
    //启动服务器
	public void StartUp(int max,int port) throws java.net.BindException {
		 try {  
	            clients = new ArrayList<ClientThread>();  
	            serverSocket = new ServerSocket(port);  
	            serverThread = new ServerThread(serverSocket, max);  
	            serverThread.start();  
	            isStart = true;  
	        } catch (BindException e){  
	            isStart = false;  
	            throw new BindException("端口号已被占用，请换一个！");  
	        } catch (Exception e1) {  
	            e1.printStackTrace();  
	            isStart = false;  
	            throw new BindException("启动服务器异常！");  
	        } 
	}
    //关闭服务器
	@SuppressWarnings("deprecation")
	private void closeServer() {
		
		try {
			if(serverThread!=null){
				serverThread.stop();
			}
			for (int i = clients.size() - 1; i >= 0; i--) {  
                // 给所有在线用户发送关闭命令  
                clients.get(i).getWriter().println("CLOSE");  
                clients.get(i).getWriter().flush();  
                // 释放资源  
                clients.get(i).stop();// 停止此条为客户端服务的线程  
                clients.get(i).reader.close();  
                clients.get(i).writer.close();  
                clients.get(i).socket.close();  
                clients.remove(i);  
            }
			if(serverSocket!=null){
				serverSocket.close();
			}
			listModel.removeAllElements();// 清空用户列表  
            isStart = false;
		} catch (IOException e) {
			e.printStackTrace();
			isStart=true;
		}
		
	}

	//定义用户列表线程
	class ServerThread extends Thread{
		private ServerSocket serverSocket;
		private int max;
		public ServerThread(ServerSocket serverSocket,int max){
			this.serverSocket=serverSocket;
			this.max=max;
		}
		
		public void run(){
			while(true){		
				try {
					Socket socket=serverSocket.accept();
					ClientThread client=new ClientThread(socket);
					client.start();
					clients.add(client);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	class ClientThread extends Thread{
		private Socket socket;
		private BufferedReader reader;
		private User user;
		private PrintWriter writer;
		private String ortherName;
		public BufferedReader getReader() {
			return reader;
		}
		public User getUser() {
			return user;
		}
		public PrintWriter getWriter() {
			return writer;
		}
		public ClientThread(Socket socket){
			this.socket=socket;
			try {
				reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
				writer=new PrintWriter(socket.getOutputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		@SuppressWarnings("deprecation")
		public void run(){
			String message=null;
			while(true){
				try {
					message=reader.readLine();
					StringTokenizer stringTokenizer = new StringTokenizer(message,"@");
					String name = stringTokenizer.nextToken();
					ortherName=stringTokenizer.nextToken();
					String owner= stringTokenizer.nextToken();
					String content=stringTokenizer.nextToken();
					if(owner.equals("ALL")){
						message = name + "对"+ortherName+"说：" + content;  
				        contentArea.append(message + "\r\n"); 
				        sendServerMessages(ortherName,content);
					}else if(owner.equals("hh")){
						 contentArea.append(name+"已上线" + "\r\n"); 
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		 public void sendServerMessages(String ortherName,String content) {  
	    	try {
	    		UserDaoImpl dao=new UserDaoImpl();
	    		int ip=Integer.parseInt(ortherName);
	    		String Ip=dao.findIp(ip);
				Socket socket=new Socket(Ip,667);
				writer=new PrintWriter(socket.getOutputStream());
				reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
				writer.println(content);
				writer.flush();
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	    }
		
	}
}

