package com.myqq.user.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterListener implements ActionListener {
	RegisterFrame registerFrame;
	LoginFrame loginFrame;
	public RegisterListener(LoginFrame loginFrame) {
		this.loginFrame=loginFrame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		loginFrame.dispose();
		loginFrame=null;
		registerFrame=new RegisterFrame();
	}

}
