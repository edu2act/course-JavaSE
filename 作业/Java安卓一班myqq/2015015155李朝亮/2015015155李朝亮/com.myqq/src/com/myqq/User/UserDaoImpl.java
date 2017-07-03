package com.myqq.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import user.User;

public class UserDaoImpl {
	public boolean saveUser(User u){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myqq_db");
			PreparedStatement pstm=con.prepareStatement
					("insert into users(nickName,passWord,registTime,"+"gender,introduce,) values(?,?,?,?,?)");
			//给占位符传参
			pstm.setString(1,u.getNickName());
			pstm.setString(2,u.getPassWord());
			pstm.setString(3,u.getRegistTime().toLocaleString());//吧时间改成中国格式
			pstm.setString(4,u.getGender());
			pstm.setString(5,u.getIntroduce());
			//执行sql语句
			int count=pstm.executeUpdate();
			pstm.close();
			con.close();
			if(count>0){
				return true;
			}else{
				return false;
			}
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	public User findNameAndPassword(int qqNum,String passWord){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myqq_db");
			PreparedStatement pstm=con.prepareStatement
					("select *from user u where u.qqnum=? and u.password=?");
			//给占位符传参
			pstm.setInt(1,qqNum);
			pstm.setString(2,passWord);
			//执行sql语句
			ResultSet rs=pstm.executeQuery();
			
			User u=new User();
			while(rs.next()){
				u.setqqNum(rs.getInt(1));
				u.setPassWord(rs.getString(3));
				u.setNickName(rs.getNString(2));
				u.setRegistTime(rs.getDate(4));
				u.setGender(rs.getString(5));
				u.setIntroduce(rs.getString(6));
			}
			pstm.close();
			con.close();
			return u;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
}
