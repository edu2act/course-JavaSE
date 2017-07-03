package com.mychat.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mychat.entity.User;
import com.mychat.util.ConnectionUtil;

public class UserDaoImpl {
	
	public User getUser(int mychatNum){
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try{
			//1.获取数据库连接
			 con=ConnectionUtil.getConnection();
			
			//2.创建statement
			 pstm=con.prepareStatement(
					"select * from users u where u.mychatnum=?");
			
			//3.设置参数，针对？占位符
			pstm.setInt(1, mychatNum);
			
			//4.执行sql语句
			 rs=pstm.executeQuery();
			User u=null;
			while(rs.next()){
				u=new User();
				u.setMyChatNum(rs.getInt(1));
				u.setNickName(rs.getString(2));
				u.setPassword(rs.getString(3));
				u.setRegistTime(rs.getDate(4));
				u.setGender(rs.getString(5));
				u.setIntroduce(rs.getString(6));
				u.setIp(rs.getString(7));
			}
			
			//5.关闭连接
			ConnectionUtil.closeConnection(rs, pstm, con);
			return u;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	public boolean saveUser(User u){
		Connection con = null;
		PreparedStatement pstm = null;
		
		try{
			//1.获取数据库连接
			con=ConnectionUtil.getConnection();
			
			//2.创建statement
			 pstm=con.prepareStatement(
					"insert into users(nickName,password,registTime,"
					+ "gender,introduce,ip) values(?,?,?,?,?,?)",
					Statement.RETURN_GENERATED_KEYS);
			
			//3.设置参数，针对？占位符
			pstm.setString(1, u.getNickName());
			pstm.setString(2, u.getPassword());
			pstm.setString(3, u.getRegistTime().toLocaleString());
			pstm.setString(4, u.getGender());
			pstm.setString(5, u.getIntroduce());
			pstm.setString(6, u.getIp());
			
			//4.执行sql语句
			int count=pstm.executeUpdate();
			ResultSet rs=pstm.getGeneratedKeys();
			if(rs.next())
				System.out.println(rs.getInt(1));
			
			//5.关闭连接
			ConnectionUtil.closeConnection(rs, pstm, con);
			if(count>0)
				return true;
			else
				return false;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean updatePassword(int mychatNum, String password){
		Connection con=null;
		PreparedStatement pstm=null;
		try{
			List<User> list=new ArrayList<User>();
			con=ConnectionUtil.getConnection();
			pstm=con.prepareStatement(
					"update users set password=? where mychatnum=?");
			pstm.setString(1, password);
			pstm.setInt(2, mychatNum);
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
	public void updateIp(int mychatNum, String ip){
		Connection con=null;
		PreparedStatement pstm=null;
		try{
			con=ConnectionUtil.getConnection();
			pstm=con.prepareStatement(
					"update users set ip=? where mychatnum=?");
			pstm.setString(1, ip);
			pstm.setInt(2, mychatNum);
			pstm.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			ConnectionUtil.closeConnection(null, pstm, con);
		}
	}
	
	
	 //按用户mychat号和密码查询用户
		public User findByChatNumAndPassword(int chatNum, String password){
			Connection con = null;
			PreparedStatement pstm = null;
			ResultSet rs = null;
			
			
			try{
				//1.获取数据库连接
				 con=ConnectionUtil.getConnection();
			
				//2.创建statement
				 pstm=con.prepareStatement(
						"select * from users u where u.mychatnum=? and u.password=?");
			
				//3.设置参数，针对？占位符
				pstm.setInt(1, chatNum);
				pstm.setString(2, password);
			
				//4.执行sql语句
				 rs=pstm.executeQuery();
				User u=null;
				while(rs.next()){
					u=new User();
					u.setMyChatNum(rs.getInt(1));
					u.setNickName(rs.getString(2));
					u.setPassword(rs.getString(3));
					u.setRegistTime(rs.getDate(4));
					u.setGender(rs.getString(5));
					u.setIntroduce(rs.getString(6));
					u.setIp(rs.getString(7));
				}
			
				//5.关闭连接
				ConnectionUtil.closeConnection(rs, pstm, con);
					return u;
			}catch(Exception e){
				e.printStackTrace();
				return null;
			}
	}
	
		public List<User> findFriendByChatNum(int chatNum){
			Connection con=null;
			PreparedStatement pstm=null;
			ResultSet rs=null;
			try{
				List<User> list=new ArrayList<User>();
				con=ConnectionUtil.getConnection();
				pstm=con.prepareStatement(
						"select * from users u where u.mychatnum<>?");
				pstm.setInt(1, chatNum);
				rs=pstm.executeQuery();
				while(rs.next()){
					User u=new User();
					u.setMyChatNum(rs.getInt(1));
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
			ConnectionUtil.closeConnection(rs, pstm, con);
		}
		
	}
	
	
}
