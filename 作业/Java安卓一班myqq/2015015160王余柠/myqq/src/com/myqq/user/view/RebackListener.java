package com.myqq.user.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RebackListener implements ActionListener{
	RegisterFrame registerFrame;
	public RebackListener(RegisterFrame registerFrame) {
		this.registerFrame=registerFrame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		registerFrame.dispose();
		LoginFrame lo=new LoginFrame();
		
	}

}
