package com.myqq.user.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

import javax.swing.JOptionPane;

import com.myqq.entity.User;
import com.myqq.util.ConnectionUtil;
import com.myqq.user.dao.UserDaoImpl;
import com.myqq.user.service.UserServiceImpl;
import com.myqq.user.view.RegistFrame;

public class UserRegis implements ActionListener {
	//注册方法
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		if(e.getActionCommand()=="返回")	{ 
			RegistFrame registFrame=new RegistFrame();
			registFrame.dispose(); 
			LoginFrame loginFrame=new LoginFrame(); 
		}else if(e.getActionCommand()=="注册") { 
			try{
			//获取数据库连接
			Connection con=ConnectionUtil.getCon();
			//创建statement
			RegistFrame registFrame=new RegistFrame();
			PreparedStatement pstm=con.prepareStatement(
					"insert into users(nickNames,password,registTime,"
					+ "gender,introduce,ip) values(?,?,?,?,?,?)",
					Statement.RETURN_GENERATED_KEYS);
			
	
			//设置参数，针对？占位符
	
			pstm.setString(1, registFrame.txtName.getText());
			String password=new String(registFrame.txtPassword2.getPassword());
			pstm.setString(2, password);
			pstm.setString(3, new Date().toLocaleString());
			pstm.setString(4, registFrame.txtGender.getText());
			pstm.setString(5, registFrame.txtIn.getText());
			pstm.setString(6, registFrame.txtIp.getText());
			//执行sql语句
			int count=pstm.executeUpdate();
			ResultSet rs=pstm.getGeneratedKeys();
			int qqnum=0;
			if(rs.next()){
				qqnum=rs.getInt(1);
				System.out.println(qqnum);
			}
			String qqNum=registFrame.txtQqNum.getText();
			User u=new User();
			u.setQqnum(qqnum);
			u.setNickName(registFrame.txtName.getText());
			u.setPassword(password);
			u.setGender(registFrame.txtGender.getText());
			u.setIntroduce(registFrame.txtIn.getText());
			u.setIp(registFrame.txtIp.getText());
			u.setRegistTime(null);
			MainFrame mf=new MainFrame(u);
			//UserServiceImpl userServiceImpl=new UserServiceImpl();
//			User u=userServiceImpl.login(Integer.parseInt(qqNum), password);
//			if(u!=null){
//				MainFrame mf=new MainFrame(u);
//				registFrame.dispose();
//				registFrame=null;
//			}
			//关闭连接
			ConnectionUtil.closeCon(rs, pstm, con);
		}
		catch(Exception a){
			a.printStackTrace();
		}
			
	}
	}
}
			