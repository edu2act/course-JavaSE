package com.myqq.user.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import com.myqq.entity.User;
import com.myqq.user.dao.UserDaoImpl;
import com.myqq.user.service.UserServiceImpl;

public class SignListener implements ActionListener {
	RegisterFrame registerFrame;
	public SignListener(RegisterFrame registerFrame) {
		this.registerFrame=registerFrame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String nickName=registerFrame.txtName.getText();
		String password=registerFrame.txtPassword.getText();
		String gender=registerFrame.txtgender.getText();
		String introduce=registerFrame.txtintroduce.getText();
		User user=new User();
		user.setNickName(nickName);
		user.setPassword(password);
		user.setIntroduce(introduce);
		user.setGender(gender);
		user.setRegistTime(new Date());
		UserServiceImpl userservicelmpl=new UserServiceImpl();
		registerFrame.qqNum.setText("你的QQ号是："+userservicelmpl.saveUsers(user));
	}

}
