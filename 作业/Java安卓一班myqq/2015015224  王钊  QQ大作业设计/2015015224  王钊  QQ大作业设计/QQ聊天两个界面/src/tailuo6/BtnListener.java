package tailuo6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnListener implements ActionListener{
	QQ1 qq;
	QQ2 qq2;
	public BtnListener(QQ1 qq1){
		this.qq=qq1;
	}
	
	public void actionPerformed(ActionEvent e){
		String msg=qq.txtmag.getText();
		new Thread(new ClientThread(msg)).start();
		new Thread(new ClientThread2(msg)).start();
		qq.txtmag.setText("");
		
		
		
	}
	
}
