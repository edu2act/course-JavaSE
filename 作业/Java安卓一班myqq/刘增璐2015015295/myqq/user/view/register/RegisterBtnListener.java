package com.myqq.user.view.register;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import com.myqq.entity.User;
import com.myqq.user.service.UserServiceImpl;
import com.myqq.util.IpUtil;

public class RegisterBtnListener implements ActionListener {
	RegisterFrame registerFrame;
	User u = null;
	public RegisterBtnListener(RegisterFrame registerFrame) {
		this.registerFrame = registerFrame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		u = new User();
		u.setNickName(registerFrame.txtName.getText());
		u.setPassword(new String (registerFrame.txtPassword.getPassword()));
		u.setRegistTime(new Date());
		u.setGender(registerFrame.txtGender.getText());
		u.setIntroduce(registerFrame.txtName.getText());
		u.setIp(IpUtil.getLocalHostAddress());
		UserServiceImpl userServiceImpl = new UserServiceImpl();
		boolean register = userServiceImpl.regist(u);//往数据库里存信息
		if(register){
			System.out.println("注册成功");
			registerFrame.dispose();
			registerFrame=null;
			RegisterSucceedFrame registerSucceedFrame = new RegisterSucceedFrame();
		}
	}

}