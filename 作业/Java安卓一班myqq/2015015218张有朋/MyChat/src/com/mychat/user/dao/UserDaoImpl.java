package com.mychat.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mychat.yp.user;
import com.mychat.yp.user;
import com.mychat.util.ConnectionUtil;

public class UserDaoImpl {
	
	public user getUser(int chatNum){
		try{
			//获取数据库连接
			Connection con=ConnectionUtil.getCon();
			//创建statement
			PreparedStatement pstm=con.prepareStatement(
					"select * from users u where u.chatNum=?");
			//设置参数，针对？占位符
			pstm.setInt(1, chatNum);
			//执行sql语句
			ResultSet rs=pstm.executeQuery();
			user u=null;
			while(rs.next()){
				u=new user();
				u.setChatNum(rs.getInt(1));
				u.setNickName(rs.getString(2));
				u.setPw(rs.getString(3));
				u.setRegistTime(rs.getDate(4));
				u.setGender(rs.getString(5));
				u.setIntroduce(rs.getString(6));
				u.setIp(rs.getString(7));
			}
			//关闭连接
			ConnectionUtil.closeCon(rs, pstm, con);
			return u;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	public boolean saveUser(user u) throws SQLException{
		//2、获取数据库连接
		Connection con=ConnectionUtil.getCon();
		//3、创建statement
		//设置参数，针对？占位符
		PreparedStatement pstm = con.prepareStatement("insert into users(nickName,pw,registTime,gender,introduce,ip) values(?,?,?,?,?,?)");
		pstm.setString(1, u.getNickName());
		pstm.setString(2, u.getPw());
		pstm.setString(3, u.getRegistTime().toLocaleString());
		pstm.setString(4, u.getGender());
		pstm.setString(5, u.getIntroduce());
		pstm.setString(6, u.getIp());
		int count = pstm.executeUpdate();
		pstm.close();
		con.close();
		if(count > 0){
			return true;
		} else {
			return false;
		}
	}
	
	public user findByChatNumAndPassword(int chatNum, String pw){
		try{
			//获取数据库连接
			Connection con=ConnectionUtil.getCon();
			//创建statement
			PreparedStatement pstm=con.prepareStatement(
					"select * from users u where u.chatNum=? and u.pw=?");
			//设置参数，针对？占位符
			pstm.setInt(1, chatNum);
			pstm.setString(2, pw);
			//执行sql语句
			ResultSet rs=pstm.executeQuery();
			user u=null;
			while(rs.next()){
				u=new user();
				u.setChatNum(rs.getInt(1));
				u.setNickName(rs.getString(2));
				u.setPw(rs.getString(3));
				u.setRegistTime(rs.getDate(4));
				u.setGender(rs.getString(5));
				u.setIntroduce(rs.getString(6));
				u.setIp(rs.getString(7));
			}
			//关闭连接
			ConnectionUtil.closeCon(rs, pstm, con);
			return u;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	public List<user> findFriendByChatNum(int chatNum){
		Connection con=ConnectionUtil.getCon();
		PreparedStatement pstm=null;
		ResultSet rs = null;	
		try {
			
			List<user> list = new ArrayList<user>();
			pstm = con.prepareStatement("select * from users u where u.chatNum<>?");
			pstm.setInt(1, chatNum);
			rs = pstm.executeQuery();
			user u = null;
			while(rs.next()) {
				u = new user();
				u.setChatNum(rs.getInt(1));
				u.setNickName(rs.getString(2));
				u.setGender(rs.getString(3));
				u.setIntroduce(rs.getString(4));
				u.setIp(rs.getString(5));
				list.add(u);				
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			ConnectionUtil.closeCon(rs, pstm, con);
		}
	}
	
	public boolean updatePassword(int chatNum, String password){
		Connection con=null;
		PreparedStatement pstm=null;
		try{
			List<user> list=new ArrayList<user>();
			con=ConnectionUtil.getCon();
			pstm=con.prepareStatement(
					"update users set pw=? where chatNum=?");
			pstm.setString(1, password);
			pstm.setInt(2, chatNum);
			int count=pstm.executeUpdate();
			if(count>0)
				return true;
			else
				return false;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			ConnectionUtil.closeCon(null, pstm, con);
		}
	}
	public void updateIp(int chatNum, String ip){
		Connection con=null;
		PreparedStatement pstm=null;
		try{
			con=ConnectionUtil.getCon();
			pstm=con.prepareStatement(
					"update users set ip=? where chatNum=?");
			pstm.setString(1, ip);
			pstm.setInt(2, chatNum);
			pstm.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			ConnectionUtil.closeCon(null, pstm, con);
		}
	}
}
