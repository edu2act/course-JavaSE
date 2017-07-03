package chat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnListener implements ActionListener{

	ChatFrame chatFrame;
	public BtnListener(ChatFrame chatFrame) {
		this.chatFrame=chatFrame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String msg=chatFrame.txtMsg.getText();
		new Thread(new ClientThread(msg)).start();
		chatFrame.txtMsg.setText("");
	}

}
