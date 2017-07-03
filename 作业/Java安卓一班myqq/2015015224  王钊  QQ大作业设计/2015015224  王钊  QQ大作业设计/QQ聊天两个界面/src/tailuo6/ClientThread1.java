package tailuo6;


import java.io.OutputStream;
import java.net.Socket;

public class ClientThread1 implements Runnable{
	private String msg;
	public ClientThread1(String msg){
		this.msg=msg;
	}
	
	Socket socket=null;
	@Override
	public void run() {
		try{
			socket=new Socket("127.0.0.1",8114);
			OutputStream out=socket.getOutputStream();
			out.write(msg.getBytes());
			out.flush();
			out.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	
	
}

