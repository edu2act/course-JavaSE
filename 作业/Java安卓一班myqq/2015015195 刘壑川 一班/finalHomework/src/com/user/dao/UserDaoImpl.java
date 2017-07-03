package com.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.bean.User;
import com.util.DatabaseUtil;

public class UserDaoImpl {
	/** 查找用户 */
	public User getUser(int qqNum){
		Connection con = null;
		PreparedStatement s = null;
		User u = new User();
		ResultSet rs = null;
		try{
			
			con = DatabaseUtil.getConnection();
			String sql = "select * from user where qq_num=?";
			s = con.prepareStatement(sql);
			s.setInt(1,qqNum);
			rs = s.executeQuery();
			while(rs.next()){
				u = new User();
				u.setQQNum(rs.getInt(2));
				u.setPassword(rs.getString(3));			
				u.setNickName(rs.getString(4));
				u.setUserSex(rs.getString(5));
				u.setIp(rs.getString(6));
			}
			return u;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally{
			DatabaseUtil.close(rs,s,con);
		}
	}
	/** 查询所有好友 */
	public List<User> findAllFriends(int qqNum){
		Connection con = null;
		PreparedStatement s = null;
		ResultSet rs = null;
		User u = null;
		try{
			List<User> list = new ArrayList<User>();
			con = DatabaseUtil.getConnection();
			String sql = "select * from user where qq_num<>?";
			s = con.prepareStatement(sql);
			s.setInt(1,qqNum);
			rs = s.executeQuery();
			while(rs.next()){
				u = new User();
				u.setQQNum(rs.getInt(2));
				u.setPassword(rs.getString(3));			
				u.setNickName(rs.getString(4));
				u.setUserSex(rs.getString(5));
				u.setIp(rs.getString(6));
				list.add(u);
			}
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally{
			DatabaseUtil.close(rs,s,con);
		}
	}
	/** 根据账号密码查询用户 */
	public User findUserByQQNumAndPassword(int qqNum,String password){
		Connection con = null;
		PreparedStatement s = null;
		User u = new User();
		ResultSet rs = null;
		try{
			con = DatabaseUtil.getConnection();
			String sql = "select * from user where qq_num=? and user_password=?";
			s = con.prepareStatement(sql);
			s.setInt(1,qqNum);
			s.setString(2,password);
			rs = s.executeQuery();
			while(rs.next()){
				u = new User();
				u.setQQNum(rs.getInt(2));
				u.setPassword(rs.getString(3));			
				u.setNickName(rs.getString(4));
				u.setUserSex(rs.getString(5));
				u.setIp(rs.getString(6));
			}
			return u;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally{
			DatabaseUtil.close(rs,s,con);
		}
		
	}
	/** 注册用户 */
	public boolean saveUser(int qqNum,String password){
		Connection con = null;
		PreparedStatement s = null;
		try{
			con = DatabaseUtil.getConnection();
			String sql = "insert into user(qq_num,user_password) values(?,?)";
			s = con.prepareStatement(sql);
			s.setInt(1,qqNum);
			s.setString(2,password);
			int count = s.executeUpdate();
			if(count > 0){
				return true;
			}
			return false;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			DatabaseUtil.close(null,s,con);
		}
		
	}
	/** 改变某人IP地址 */
	public void updateIp(int qqNum, String ip){
		Connection con = null;
		PreparedStatement s = null;
		try{
			con = DatabaseUtil.getConnection();
			String sql = "update user set user_ip=? where qq_num=?";
			s = con.prepareStatement(sql);
			s.setString(1,ip);
			s.setInt(2, qqNum);
			s.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			DatabaseUtil.close(null,s,con);
		}
	}
	
}
