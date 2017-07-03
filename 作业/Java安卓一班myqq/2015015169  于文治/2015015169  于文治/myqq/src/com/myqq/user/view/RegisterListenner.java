package com.myqq.user.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterListenner implements ActionListener{

	RegisterFrame registerFrame;
	LoginFrame loginFrame;
	public RegisterListenner(LoginFrame loginFrame){
		this.loginFrame=loginFrame;
	}
	public void actionPerformed(ActionEvent e){
		loginFrame.dispose();
		loginFrame=null;
		registerFrame=new RegisterFrame();
	}
}

