package tailuo6;

import java.awt.color.*; 
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class QQ1 extends JFrame{

	
		JTextArea txt=null;
		JTextField txtmag=null;
		JButton btn=null;
		
		
		public QQ1(){
			
			JPanel panel=new JPanel();
			this.getContentPane().add(panel);
			panel.setLayout(new BorderLayout());
			txt=new JTextArea(5,20);
			panel.add(txt,BorderLayout.CENTER);
			
			JPanel txtpanel=new JPanel();
			txtmag=new JTextField(10);
			btn=new JButton("发送");
			
			btn.addActionListener(new BtnListener(this));
			btn.setBackground(Color.green);
			txtpanel.add(txtmag);
			txtpanel.add(btn);
			txtpanel.setBackground(Color.red);
			panel.add(txtpanel,BorderLayout.SOUTH);
			
			this.setSize(450,550);
			this.setVisible(true);
			
			new Thread(new ServerThread(this)).start();
			new Thread(new ServerThread2(this)).start();
		}

	   
		   
	   

}
