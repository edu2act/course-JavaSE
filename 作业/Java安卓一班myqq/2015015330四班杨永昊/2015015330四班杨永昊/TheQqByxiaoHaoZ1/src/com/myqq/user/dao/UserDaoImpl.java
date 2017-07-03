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
	
	//	根据传入的QQ号获取该完整的User对象
	public User getUser(int qqNum){
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		try{
			con = ConnectionUtil.getConnection();
			pstm = con.prepareStatement("select * from users u where u.qqNum = ?");
			//	设置占位符的参数
			pstm.setInt(1, qqNum);
			
			//	查询要用executeQuery()方法
			rs = pstm.executeQuery();
			User u = null;
			while(rs.next()){
				u = new User();
				u.setQqNum(rs.getInt(1));
				u.setNickName(rs.getString(2));
				u.setPassword(rs.getString(3));
				u.setRegistTime(rs.getDate(4));
				u.setGender(rs.getString(5));
				u.setIntrouduce(rs.getString(6));
				u.setIp(rs.getString(7));
			}
			
			//	关闭连接
			ConnectionUtil.closeConnection(rs, pstm, con);
			return u;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	//	新增用户信息
	public boolean saveUser(User u){
		Connection con = null;
		PreparedStatement pstm = null;
		
		try{
			con = ConnectionUtil.getConnection();
			pstm = con.prepareStatement("insert into users(nickName,password,registTime,"
					+ "gender,introduce,ip)values (?,?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
			
			pstm.setString(1, u.getNickName());
			pstm.setString(2, u.getPassword());
			pstm.setString(3, u.getRegistTime().toLocaleString());
			pstm.setString(4, u.getGender());
			pstm.setString(5, u.getIntrouduce());
			pstm.setString(6, u.getIp());
			
			int count = pstm.executeUpdate();
			
			ConnectionUtil.closeConnection(null, pstm, con);
			if(count>0){
				return true;
			}else
				return false;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	//	更新密码
	public boolean updatePassword(int qqNum,String password){
		Connection con=null;
		PreparedStatement pstm=null;
		try{
			con=ConnectionUtil.getConnection();
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
			ConnectionUtil.closeConnection(null, pstm, con);
		}
	}
	
	//	按照QQ号和密码进行用户查找
	public User findByQqNumAndPassword(int qqNum, String password){
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		User u = null;
		
		try{
			con = ConnectionUtil.getConnection();
			pstm = con.prepareStatement(
					"select * from users u where u.qqNum = ? and u.password = ?");
			pstm.setInt(1, qqNum);
			pstm.setString(2, password);
			
			rs = pstm.executeQuery();
			//	如果查找到的话，从数据库取出数据实例化User对象并返回该对象
			//	找不到的话，直接GG
			while(rs.next()){
				u=new User();
				u.setQqNum(rs.getInt(1));
				u.setNickName(rs.getString(2));
				u.setPassword(rs.getString(3));
				u.setRegistTime(rs.getDate(4));
				u.setGender(rs.getString(5));
				u.setIntrouduce(rs.getString(6));
				u.setIp(rs.getString(7));
			}
			
			ConnectionUtil.closeConnection(rs, pstm, con);
			return u;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	//	查找当前QQ号的好友
	public List<User> findFriendByQqNum(int qqNum){
		Connection con=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		try{
			List<User> list=new ArrayList<User>();
			con=ConnectionUtil.getConnection();
			pstm=con.prepareStatement(
					"select * from users u where u.qqnum<>?");
			pstm.setInt(1, qqNum);
			rs=pstm.executeQuery();
			while(rs.next()){
				User u=new User();
				u.setQqNum(rs.getInt(1));
				u.setNickName(rs.getString(2));
				u.setPassword(rs.getString(3));
				u.setRegistTime(rs.getDate(4));
				u.setGender(rs.getString(5));
				u.setIntrouduce(rs.getString(6));
				u.setIp(rs.getString(7));
				list.add(u);
			}
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally{
			ConnectionUtil.closeConnection(rs, pstm, con);
		}
		
	}
	
	//	更新ip地址
	public void updateIp(int qqNum,String ip){
		Connection con=null;
		PreparedStatement pstm=null;
		try{
			con=ConnectionUtil.getConnection();
			pstm=con.prepareStatement(
					"update users set ip=? where qqNum=?");
			pstm.setString(1, ip);
			pstm.setInt(2, qqNum);
			pstm.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			ConnectionUtil.closeConnection(null, pstm, con);
		}
	}
}
