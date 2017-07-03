package com.myqq.user.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.myqq.entity.Users;
import com.myqq.util.ConnectionUtil;


public class UserDaoImpl {
	
	//数据持有层
	
	public Users getUser(int qqNum){
		try{
			//获取数据库连接
			Connection con=ConnectionUtil.getCon();
			//创建statement
			PreparedStatement pstm=con.prepareStatement(
					"select * from users u where u.qqnum=?");
			//设置参数，针对？占位符
			pstm.setInt(1, qqNum);
			//执行sql语句
			ResultSet rs=pstm.executeQuery();
			Users u=null;
			while(rs.next()){
				u=new Users();
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
	public boolean saveUser(Users u) {

		try {
			//2、获取数据库连接
			Connection con=ConnectionUtil.getCon();
			//3、获取statement
			PreparedStatement pstm =  con.prepareStatement(
					"insert into users (nickname,password,registTime,gender,introduce,ip) values(?, ?, ?, ?, ?, ?)");
			//statement ？的占位符 穿餐
			pstm.setString(1, u.getNickName());
			pstm.setString(2, u.getPassword());
			pstm.setString(3, u.getRegistTime().toLocaleString());
			pstm.setString(4, u.getGender());
			pstm.setString(5, u.getIntroduce());
			pstm.setString(6, u.getIp());
			//执行SQL语句
			int count = pstm.executeUpdate();
			//4、关闭连接q
			ConnectionUtil.closeCon(null, pstm, con);
			if(count > 0) {
				return true;
			}else
				return false;	
					
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
				
	}
	
	
	/**
	 * 修改密码
	 * @param qqNum
	 * @param newPassword
	 * @return
	 */
	public boolean updatePassword(int qqNum,String password) {
		Connection con = null;
		PreparedStatement pstm = null;
		try {
			List<Users> list = new ArrayList<Users>();
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
		}catch(Exception e) {
			e.printStackTrace();
			return false;
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
	
	
	
	
	/**
	 * 登录
	 * @param qqNum qq号
	 * @param password 密码
	 * @return
	 */
	public Users findByQqNumAndPassword(int qqNum, String password) {
		try {
			//2、获取数据库连接
			Connection con= ConnectionUtil.getCon();
			//3、获取statement
			PreparedStatement pstm = con.prepareStatement(
					"select * from users u where u.qqnum=? and u.password=?");
			//statement ？的占位符 穿餐
			pstm.setInt(1, qqNum);
			pstm.setString(2, password);
			//执行SQL语句
			ResultSet rs=pstm.executeQuery();
			Users u=null;
			while(rs.next()){
				u=new Users();
				u.setQqnum(rs.getInt(1));
				u.setNickName(rs.getString(2));
				u.setPassword(rs.getString(3));
				u.setRegistTime(rs.getDate(4));
				u.setGender(rs.getString(5));
				u.setIntroduce(rs.getString(6));
				u.setIp(rs.getString(7));
			}
			//4、关闭连接
			ConnectionUtil.closeCon(null, pstm, con);
			return u;
					
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

	/**
	 * 查询好友，展示所有好友
	 * @param qqNum 本人的	QQ号
	 * @return 查询到的聚合
	 */
	
	public List<Users> finAllFriend(int qqNum) {
		Connection con=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		try{
			List<Users> list=new ArrayList<Users>();
			con=ConnectionUtil.getCon();
			pstm=con.prepareStatement(
					"select * from users u where u.qqnum<>?");
			pstm.setInt(1, qqNum);
			rs=pstm.executeQuery();
			while(rs.next()){
				Users u=new Users();
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
	
	/**
	 * 根据QQ号查询好友
	 * @param qqNum
	 * @return
	 */
	public List<Users> findFriendByQqNum(int qqNum){
		Connection con=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		try{
			List<Users> list=new ArrayList<Users>();
			con=ConnectionUtil.getCon();
			pstm=con.prepareStatement(
					"select * from users u where u.qqnum<>?");
			pstm.setInt(1, qqNum);
			rs=pstm.executeQuery();
			while(rs.next()){
				Users u=new Users();
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

