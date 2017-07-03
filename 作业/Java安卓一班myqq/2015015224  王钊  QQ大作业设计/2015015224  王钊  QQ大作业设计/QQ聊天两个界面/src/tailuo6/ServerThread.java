package tailuo6;

import java.io.InputStream;
import java.awt.*;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JLabel;

public class ServerThread implements Runnable{
	QQ1 qq1;
	public ServerThread(QQ1 qq1){
		this.qq1=qq1;
	}
	
	ServerSocket server=null;
	@Override
	public void run() {
		try{
			server=new ServerSocket(8114);
			while(true){
				Socket ss=server.accept();
				InputStream is=ss.getInputStream();
				byte[] temp=new byte[1024];
				is.read(temp);
			    String msg1=new String(temp);
			    
				
				String msg=qq1.txt.getText()+"奥特曼说的话为:\t"+msg1;
				qq1.txt.setText(msg+"\n"+"\n");
				ss.close();
				is.close();
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}
