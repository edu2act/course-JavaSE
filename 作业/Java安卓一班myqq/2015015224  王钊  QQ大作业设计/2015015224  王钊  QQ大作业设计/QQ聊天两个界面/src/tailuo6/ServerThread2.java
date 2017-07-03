package tailuo6;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerThread2 implements Runnable{
	QQ1 qq1;
	public ServerThread2(QQ1 qq1){
		this.qq1=qq1;
	}
	
	ServerSocket server=null;
	@Override
	public void run() {
		try{
			server=new ServerSocket(8116);
			while(true){
				Socket ss=server.accept();
				InputStream is=ss.getInputStream();
				byte[] temp=new byte[1024];
				is.read(temp);
				String msg=qq1.txt.getText()+"\t\t\t我说的话为:\t"+new String(temp);
				qq1.txt.setText(msg+"\n"+"\n");
				ss.close();
				is.close();
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}

