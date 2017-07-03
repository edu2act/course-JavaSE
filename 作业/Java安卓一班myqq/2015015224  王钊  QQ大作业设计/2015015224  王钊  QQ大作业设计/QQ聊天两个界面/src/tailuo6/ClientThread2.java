package tailuo6;


import java.io.OutputStream;
import java.net.Socket;

public class ClientThread2 implements Runnable{
	private String msg;
	public ClientThread2(String msg){
		this.msg=msg;
	}
	
	Socket socket1=null;
	@Override
	public void run() {
		try{
			socket1=new Socket("127.0.0.1",8116);
			OutputStream out1=socket1.getOutputStream();
			out1.write(msg.getBytes());
			out1.flush();
			out1.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	
	
}


