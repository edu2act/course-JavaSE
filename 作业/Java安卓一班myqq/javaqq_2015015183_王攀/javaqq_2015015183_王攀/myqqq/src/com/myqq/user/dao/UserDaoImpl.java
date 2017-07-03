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
			//获取数据库连接
			Connection con=ConnectionUtil.getCon();
			//创建statement
			PreparedStatement pstm=con.prepareStatement(
					"select * from user u where u.qqnum=?");
			//设置参数，针对？占位符
			pstm.setInt(1, qqNum);
			//执行sql语句
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
			//关闭连接
			ConnectionUtil.closeCon(rs, pstm, con);
			return u;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	/**
	 * 新增用户信息
	 * @param u
	 * @return
	 */
	public boolean saveUser(User u){
		try{
			//获取数据库连接
			Connection con=ConnectionUtil.getCon();
			//创建statement
			PreparedStatement pstm=con.prepareStatement(
					"insert into user(nickName,password,registTime,"
					+ "gender,introduce,ip) values(?,?,?,?,?,?)",
					Statement.RETURN_GENERATED_KEYS);
			//设置参数，针对？占位符
			pstm.setString(1, u.getNickName());
			pstm.setString(2, u.getPassword());
			pstm.setString(3, u.getRegistTime().toLocaleString());
			pstm.setString(4, u.getGender());
			pstm.setString(5, u.getIntroduce());
			pstm.setString(6, u.getIp());
			//执行sql语句
			int count=pstm.executeUpdate();
			ResultSet rs=pstm.getGeneratedKeys();
			if(rs.next())
				System.out.println(rs.getInt(1));
			//关闭连接
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
					"update user set password=? where qqNum=?");
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
					"update user set ip=? where qqNum=?");
			pstm.setString(1, ip);
			pstm.setInt(2, qqNum);
			pstm.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			ConnectionUtil.closeCon(null, pstm, con);
		}
	}
	
	/**
	 * 按用户qq号和密码查询用户
	 * @param qqNum
	 * @param password
	 * @return
	 */
	public User findByQqNumAndPassword(int qqNum, String password){
		try{
			//获取数据库连接
			Connection con=ConnectionUtil.getCon();
			//创建statement
			PreparedStatement pstm=con.prepareStatement(
					"select * from user u where u.qqnum=? and u.password=?");
			//设置参数，针对？占位符
			pstm.setInt(1, qqNum);
			pstm.setString(2, password);
			//执行sql语句
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
			//关闭连接
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
					"select * from user u where u.qqnum<>?");
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
