package com.myqq.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.myqq.entity.User;
import com.myqq.util.ConnectionUtil;

public class UserDaoImpl {
	
	public User getUser(int qqNum){
		try{
			Connection con=ConnectionUtil.getCon();
			PreparedStatement pstm=con.prepareStatement(
					"select * from users u where u.qqnum=?");
			pstm.setInt(1, qqNum);
			ResultSet rs=pstm.executeQuery();
			User u=null;
			while(rs.next()){
				u=new User();
				u.setQqnum(rs.getInt(1));
				u.setNickName(rs.getString(2));
				u.setPassword(rs.getString(3));
				u.setRegistTime(rs.getDate(4));
				u.setGender(rs.getString(5));
				u.setIntroduce(rs.getString(6));
				u.setIp(rs.getString(7));
			}
			ConnectionUtil.closeCon(rs, pstm, con);
			return u;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	public boolean saveUser(User u){
		try{
			Connection con=ConnectionUtil.getCon();
			PreparedStatement pstm=con.prepareStatement(
					"insert into users(nickName,password,registTime,"
					+ "gender,introduce,ip) values(?,?,?,?,?,?)",
					Statement.RETURN_GENERATED_KEYS);
			pstm.setString(1, u.getNickName());
			pstm.setString(2, u.getPassword());
			pstm.setString(3, u.getRegistTime().toLocaleString());
			pstm.setString(4, u.getGender());
			pstm.setString(5, u.getIntroduce());
			pstm.setString(6, u.getIp());
			int count=pstm.executeUpdate();
			ResultSet rs=pstm.getGeneratedKeys();
			if(rs.next())
				System.out.println(rs.getInt(1));
			ConnectionUtil.closeCon(rs, pstm, con);
			if(count>0)
				return true;
			else
				return false;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	public boolean updatePassword(int qqNum, String password){
		Connection con=null;
		PreparedStatement pstm=null;
		try{
			List<User> list=new ArrayList<User>();
			con=ConnectionUtil.getCon();
			pstm=con.prepareStatement(
					"update users set password=? where qqNum=?");
			pstm.setString(1, password);
			pstm.setInt(2, qqNum);
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
	public void updateIp(int qqNum, String ip){
		Connection con=null;
		PreparedStatement pstm=null;
		try{
			con=ConnectionUtil.getCon();
			pstm=con.prepareStatement(
					"update users set ip=? where qqNum=?");
			pstm.setString(1, ip);
			pstm.setInt(2, qqNum);
			pstm.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			ConnectionUtil.closeCon(null, pstm, con);
		}
	}
	public User findByQqNumAndPassword(int qqNum, String password){
		try{
			Connection con=ConnectionUtil.getCon();
			PreparedStatement pstm=con.prepareStatement(
					"select * from users u where u.qqnum=? and u.password=?");
			pstm.setInt(1, qqNum);
			pstm.setString(2, password);
			ResultSet rs=pstm.executeQuery();
			User u=null;
			while(rs.next()){
				u=new User();
				u.setQqnum(rs.getInt(1));
				u.setNickName(rs.getString(2));
				u.setPassword(rs.getString(3));
				u.setRegistTime(rs.getDate(4));
				u.setGender(rs.getString(5));
				u.setIntroduce(rs.getString(6));
				u.setIp(rs.getString(7));
			}
			ConnectionUtil.closeCon(rs, pstm, con);
			return u;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	public List<User> findFriendByQqNum(int qqNum){
		Connection con=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		try{
			List<User> list=new ArrayList<User>();
			con=ConnectionUtil.getCon();
			pstm=con.prepareStatement(
					"select * from users u where u.qqnum<>?");
			pstm.setInt(1, qqNum);
			rs=pstm.executeQuery();
			while(rs.next()){
				User u=new User();
				u.setQqnum(rs.getInt(1));
				u.setNickName(rs.getString(2));
				u.setPassword(rs.getString(3));
				u.setRegistTime(rs.getDate(4));
				u.setGender(rs.getString(5));
				u.setIntroduce(rs.getString(6));
				u.setIp(rs.getString(7));
				list.add(u);
			}
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally{
			ConnectionUtil.closeCon(rs, pstm, con);
		}
		
	}
}
