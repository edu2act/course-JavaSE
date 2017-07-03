package com.MYQQ.user.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.MYQQ.entity.user;
import com.MYQQ.util.ConnectionUtil;

public class UserDaoImpl {
	public user getUser(int qqNum){
		//按qq号查询用户
		try{
			//加载驱动类
			Connection con=ConnectionUtil.getCon();
			//加载statement
			PreparedStatement pstm=con.prepareStatement(
					"select * from users u where u.qqnum=?");
			//设置问号数据
			pstm.setInt(1, qqNum);
			//执行sql语句
			ResultSet rs=pstm.executeQuery();
			user u=null;
			while(rs.next()){
				u=new user();
				u.setQqnum(rs.getInt(1));
				u.setName(rs.getString(2));
				u.setPassword(rs.getString(3));
				u.setTime(rs.getDate(4));
				u.setSex(rs.getString(5));
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
	public boolean saveUser(user u){
		try{
			//加载驱动类
			Connection con=ConnectionUtil.getCon();
			//获取statement
			PreparedStatement pstm=con.prepareStatement(
					"insert into users(nickName,password,registTime,"
					+ "gender,introduce,ip) values(?,?,?,?,?,?)");
			//设置问号数据
			pstm.setString(1, u.getName());
			pstm.setString(2, u.getPassword());
			pstm.setString(3, u.getTime().toLocaleString());
			pstm.setString(4, u.getSex());
			pstm.setString(5, u.getIntroduce());
			pstm.setString(6, u.getIp());
			//执行sql语句
			int count=pstm.executeUpdate();
			//关闭连接
			ConnectionUtil.closeCon(null, pstm, con);
			if(count>0)
				return true;
			else
				return false;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	//修改密码
	public boolean updatePassword(int qqNum,String password){
		Connection con=null;
		PreparedStatement pstm=null;
		try{
			
			con=ConnectionUtil.getCon();
			pstm=con.prepareStatement("update users set password=? where qqNum=?");
			pstm.setString(1,password);
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
	//登陆成功后，修改ip地址
	public void updateIp(int qqNum,String ip){
		Connection con=null;
		PreparedStatement pstm=null;
		try{
			
			con=ConnectionUtil.getCon();
			pstm=con.prepareStatement("update users set ip=? where qqNum=?");
			pstm.setString(1,ip);
			pstm.setInt(2, qqNum);
			int count=pstm.executeUpdate();

		}catch(Exception e){
			e.printStackTrace();
		
		}finally{
			ConnectionUtil.closeCon(null, pstm, con);
		}
	}
	//删除用户
	public boolean deletuser(int qqNum,String password){
		Connection con=null;
		PreparedStatement pstm=null;
		try{
			
			con=ConnectionUtil.getCon();
			pstm=con.prepareStatement("delet from users where qqNum=? and password=?");
			
			pstm.setString(2,password);
			pstm.setInt(1, qqNum);
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
	//用户登录
	//按用户qq好和密码查询用户
	public user findByQqNumAndPassword(int qqNum, String password){
		try{
			//加载驱动类
			Connection con=ConnectionUtil.getCon();
			//获得statement
			PreparedStatement pstm=con.prepareStatement(
					"select * from users u where u.qqnum=? and u.password=?");
			//设置问号数据
			pstm.setInt(1, qqNum);
			pstm.setString(2, password);
			//执行sql语句
			ResultSet rs=pstm.executeQuery();
			//用一个对象保存数据
			user u=null;
			while(rs.next()){
				u=new user();
				u.setQqnum(rs.getInt(1));
				u.setName(rs.getString(2));
				u.setPassword(rs.getString(3));
				u.setTime(rs.getDate(4));
				u.setSex(rs.getString(5));
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
	public List<user> findFriendByQqNum(int qqNum){
		Connection con=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		try{
			List<user> list=new ArrayList<user>();
			con=ConnectionUtil.getCon();
			pstm=con.prepareStatement("select * from users u where u.qqnum<>?");
			pstm.setInt(1, qqNum);
			rs=pstm.executeQuery();
			while(rs.next()){
				user u=new user();
				u.setQqnum(rs.getInt(1));
				u.setName(rs.getString(2));
				u.setPassword(rs.getString(3));
				u.setTime(rs.getDate(4));
				u.setSex(rs.getString(5));
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
