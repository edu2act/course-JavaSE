package com.myqq.user.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterListener implements ActionListener {
	registerFrame registerFrame;
	public void BtnListener(registerFrame registerFrame) {
		this.registerFrame=registerFrame;
	}
LoginFrame loginFrame;
	
	public void BtnListener(LoginFrame loginFrame){
		this.loginFrame=loginFrame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		registerFrame rf=new registerFrame();
		loginFrame.dispose();
		loginFrame=null;
	}

}
