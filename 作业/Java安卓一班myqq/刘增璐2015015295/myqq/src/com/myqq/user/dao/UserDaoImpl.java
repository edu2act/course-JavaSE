package com.myqq.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

import com.myqq.entity.User;
import com.myqq.util.ConnectionUtil;

public class UserDaoImpl {
	/**
	 * 
	 * @param u 用户
	 * @return
	 */
	public boolean saveUser(User u){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myqq_db"
					+ "?useUnicode=true&characterEncoding=UTF-8","root","");
			PreparedStatement  pstm = con.prepareStatement("insert into user(nickName,password,"
					+ "registTime,gender,introduce,ip) "+ "value(?,?,?,?,?)");
			pstm.setString(1, u.getNickName());
			pstm.setString(2, u.getPassword());
			pstm.setString(3, u.getRegistTime().toLocaleString());
			pstm.setString(4, u.getGender());
			pstm.setString(5, u.getIntroduce());
			pstm.setString(6, u.getIp());
			int count = pstm.executeUpdate();
			pstm.close();
			con.close();
			if(count >0){
				return true;
			}else{
				return false;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
	
	

	public User findByQqNumAndPassword(int qqNum, String password){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myqq_db"
				+ "?useUnicode=true&characterEncoding=UTF-8","root","");
			PreparedStatement  pstm = con.prepareStatement("select * from user "
				+ "where u.qqNum = ? and u.password = ?");
			pstm.setInt(1, qqNum);
			pstm.setString(2, password);
		
			ResultSet count = pstm.executeQuery();
			User u  = null
			While(count.)
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
}
