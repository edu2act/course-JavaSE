package tailuo6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnListener1 implements ActionListener{
	QQ2 qq2;
	public BtnListener1(QQ2 qq2){
		this.qq2=qq2;
	}
	
	public void actionPerformed(ActionEvent e){
		String msg=qq2.txtmag.getText();
		new Thread(new ClientThread1(msg)).start();
		
		new Thread(new ClientThread3(msg)).start();
		qq2.txtmag.setText("");
	}
	
}

