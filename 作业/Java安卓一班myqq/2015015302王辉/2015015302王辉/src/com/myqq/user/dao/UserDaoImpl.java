package com.myqq.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.myqq.entity.User;
import com.myqq.util.connectionUtil;

public class UserDaoImpl {
 
	public User getUser(int qqNum) {
		try {
			//获取数据库连接
			Connection con = connectionUtil.getCon();
			//创建statement
			PreparedStatement pstm = con.prepareStatement(
					"select *from users u where u.qqnum = ?");
			//设置参数，针对？占位符
			pstm.setInt(1, qqNum);
			//执行sql语句
			ResultSet rs = pstm.executeQuery();
			User u = null;
			while (rs.next()) {
				u = new User();
				u.setQqnum(rs.getInt(1));
				u.setNickName(rs.getString(2));
				u.setPassword(rs.getString(3));
				u.setRegistTime(rs.getDate(4));
				u.setGender(rs.getString(5));
				u.setIntroduces(rs.getString(6));
				u.setIp(rs.getString(7));
			}
			//关闭连接
			connectionUtil.closeCon(rs, pstm, con);
			return u;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public boolean saveUser(User u) {
		try {
			//2.获取数据库连接
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/myqq_db","root","");
			//3.获取statement
		PreparedStatement pstm = con.prepareStatement(
				"insert into users(nickName,password,registTime,gender,introduce,ip) values(?,?,?,?,?,?)");
		//4.给statment的？占位符，传参
		pstm.setString(1, u.getNickName());
		pstm.setString(2, u.getPassword());
		pstm.setString(3, u.getRegistTime().toLocaleString());
		pstm.setString(4, u.getGender());
		pstm.setString(5, u.getIntroduces());
		pstm.setString(6, u.getIp());
		//执行sql语句
		int count = pstm.executeUpdate();
		//ResultSet rs = pstm.getGeneratedKeys();
		//关闭连接
		connectionUtil.closeCon(null, pstm, con);
		if (count > 0) 
			return true;
		else
			return false;
		
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean updatePassword(int qqNum, String newPassword) {
		PreparedStatement pstm = null;
		Connection con = null;
		try {
			List<User> list = new ArrayList<User>();
			con = connectionUtil.getCon();
			pstm = con.prepareStatement(
					"update users set password = ? where qqNum = ?");
			pstm.setString(1, newPassword);
			pstm.setInt(2,qqNum);
			int count = pstm.executeUpdate();
			if (count > 0)
				return true;
			else
				return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			connectionUtil.closeCon(null, pstm, con);
		}
	}
	
	public void updateIp(int qqNum, String ip) {
		Connection con = null;
		PreparedStatement pstm = null;
		try {
			con = connectionUtil.getCon();
			pstm = con.prepareStatement(
					"update users set ip = ? where qqNum = ?");
			pstm.setString(1, ip);
			pstm.setInt(2,qqNum);
			pstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connectionUtil.closeCon(null, pstm, con);
		}
	}
	
	public User findByNumAndPassword (int qqNum, String password) {
		try {
			//2.获取数据库连接
			Connection con = connectionUtil.getCon();
			//3.获取statement
			PreparedStatement pstm = con.prepareStatement(
					"select * from users u where u.qqnum = ? and u.password = ?");
			//4.给statment的？占位符，传参
			pstm.setInt(1,qqNum);
			pstm.setString(2,password);
			//执行sql语句
			ResultSet rs = pstm.executeQuery();
			User u = null;
			while (rs.next()) {
				u = new User();
				u.setQqnum(rs.getInt(1));
				u.setNickName(rs.getString(2));
				u.setPassword(rs.getString(3));
				u.setRegistTime(rs.getDate(4));
				u.setGender(rs.getString(5));
				u.setIntroduces(rs.getString(6));
				u.setIp(rs.getString(7));
			}
			//关闭连接
			connectionUtil.closeCon(rs, pstm, con);
			return u;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public List<User> findAllFriend(int qqNum) {
		ResultSet rs = null;
		PreparedStatement pstm = null;
		Connection con = null;
		try {
			List<User> list = new ArrayList<User>();
			con = connectionUtil.getCon();
			pstm = con.prepareStatement(
					"select * from users u where u.qqNum != ?");
			pstm.setInt(1, qqNum);
			rs = pstm.executeQuery();
			while (rs.next()) {
				User u = new User();
				u.setQqnum(rs.getInt(1));
				u.setNickName(rs.getString(2));
				u.setPassword(rs.getString(3));
				u.setRegistTime(rs.getDate(4));
				u.setGender(rs.getString(5));
				u.setIntroduces(rs.getString(6));
				u.setIp(rs.getString(7));
				list.add(u);
			}
			return list;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			connectionUtil.closeCon(rs, pstm, con);
		}
	}
}
