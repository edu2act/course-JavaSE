package com.myqq.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.myqq.entity.User;
import com.myqq.util.ConnectionUtil;

public class UserDaoImpl {
	public boolean updatePassword(int qqNum, String password){
		Connection con=null;
		PreparedStatement pstm=null;
		try{
			List<User> list=new ArrayList<User>();
			con=ConnectionUtil.getCon();
			pstm=con.prepareStatement(
					"update qq set password=? where qqNum=?");
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
					"update qq set ip=? where qqNum=?");
			pstm.setString(1, ip);
			pstm.setInt(2, qqNum);
			pstm.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			ConnectionUtil.closeCon(null, pstm, con);
		}
	}
	public User getUser(int qqNum){
		try{
			//获取数据库连接
			Connection con=ConnectionUtil.getCon();
			//创建statement
			PreparedStatement pstm=con.prepareStatement(
					"select * from qq u where u.qqnum=?");
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
				u.setGenDer(rs.getString(5));
				u.setIntorduce(rs.getString(6));
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
	public boolean saveUser(User U){
		try{
			//加载驱动类
		Connection con=ConnectionUtil.getCon();
			//获取statement
			PreparedStatement pstm=con.prepareStatement("insert into qq(nickname,password,registTime,gender,introduce,ip) values(?,?,?,?,?,?)");
			pstm.setString(1, U.getNickName());
			pstm.setString(2, U.getPassword());
			pstm.setString(3, U.getRegistTime().toLocaleString());//将时间转化为STRING类型
			pstm.setString(4, U.getGender());
			pstm.setString(5, U.getIntorduce());
			pstm.setString(6, U.getIp());
			int count=pstm.executeUpdate();//发送sql并执行返回记录的条数
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
	public User findByNumberAndPassword(int qqNum,String password){
		try{
		    Connection con= ConnectionUtil.getCon();
			//获取statement
			PreparedStatement pstm=con.prepareStatement("select * from qq u where u.qqnum=? and u.password=? ");
			pstm.setInt(1, qqNum);
			pstm.setString(2, password);
			ResultSet rs=pstm.executeQuery();//结果集
			User u=new User();
			while(rs.next()){
				u.setQqnum(rs.getInt(1));
				u.setNickName(rs.getString(2));
				u.setPassword(rs.getString(3));
				u.setRegistTime(rs.getDate(4));
				u.setGenDer(rs.getString(5));
				u.setIntorduce(rs.getString(6));
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
			con=ConnectionUtil.getCon();
			pstm=con.prepareStatement("select * from qq u where u.qqNum<>? ");
			List<User> list= new ArrayList<User>();
			pstm.setInt(1, qqNum);
			rs=pstm.executeQuery();
			while(rs.next()){
				User u= new User();
				u.setQqnum(rs.getInt(1));
				u.setNickName(rs.getString(2));
				u.setPassword(rs.getString(3));
				u.setRegistTime(rs.getDate(4));
				u.setGenDer(rs.getString(5));
				u.setIntorduce(rs.getString(6));
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
