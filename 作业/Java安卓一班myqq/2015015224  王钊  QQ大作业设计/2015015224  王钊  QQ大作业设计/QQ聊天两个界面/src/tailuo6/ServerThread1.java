package tailuo6;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerThread1 implements Runnable{
	QQ2 qq2;
	public ServerThread1(QQ2 qq2){
		this.qq2=qq2;
	}
	
	ServerSocket server=null;
	@Override
	public void run() {
		try{
			server=new ServerSocket(8115);
			while(true){
				Socket ss=server.accept();
				InputStream is=ss.getInputStream();
				byte[] temp=new byte[1024];
				is.read(temp);
				String msg=qq2.txt.getText()+"人类说的话为:\t"+new String(temp);
				qq2.txt.setText(msg+"\n"+"\n");
				ss.close();
				is.close();
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}

