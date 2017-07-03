package com.GoChat.user.dao;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.GoChat.entity.User;
import com.GoChat.util.ConnectionUtil;

public class UserDaoImpl {

	//一般含有dao数据持久对象
	//impl用户持久对象的实现类
	//更加贴近底层数据库
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
				u.setQQnum(rs.getInt(1));
				u.setNickName(rs.getString(2));
				u.setPassWord(rs.getString(3));
				u.setGender(rs.getString(4));
				u.setDescription(rs.getString(5));
				u.setIp(rs.getString(6));
			}
			//关闭连接
			ConnectionUtil.closeCon(rs, pstm, con);
			return u;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	//新增用户的功能
	public boolean saveUser(User u){//新增一般使用save命名
		try{
			//获取数据库连接
			Connection con=ConnectionUtil.getCon();
			//创建statement
			PreparedStatement pstm=con.prepareStatement(
					"insert into user(nickName,passWord,"
					+ "gender,description,ip) values(?,?,?,?,?)",
					Statement.RETURN_GENERATED_KEYS);
			//设置参数，针对？占位符
			pstm.setString(1, u.getNickName());
			pstm.setString(2, u.getPassWord());
			pstm.setString(3, u.getGender());
			pstm.setString(4, u.getDescription());
			pstm.setString(5, u.getIp());
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
	
	//修改密码
	public boolean updatePassword(int qqNum,String newPassword){
		PreparedStatement ps=null;
		Connection con=null;
		try{
			List<User> list=new ArrayList<User>();
			con=ConnectionUtil.getCon();
			ps=con.prepareStatement(
					"update user set password=? where qqNum=?");
			ps.setString(1, newPassword);
			ps.setInt(2, qqNum);
			int count=ps.executeUpdate();
			if(count>0)
				return true;
			else
				return false;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			ConnectionUtil.closeCon(null, ps, con);
		}
	}
	//修改IP地址
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
	//通过qq号和密码查询用户
	public User fingQQNumAndPassword(int QQnum,String password){
		//查询所有就是findAll
		try{
			//获取数据库连接
			Connection con=ConnectionUtil.getCon();
			//获取statement
			PreparedStatement ps = con.prepareStatement(
					"select * from user u where u.QQnum=? and u.password=?");
			//?用作占位符,避免最简单的站位注入
			ps.setInt(1,QQnum);
			ps.setString(2,password);
			ResultSet rs = ps.executeQuery();
			User u = new User();
			while(rs.next()){
				//结果集
				//rs.getInt(1)或者使用rs.getInt("QQnum");
				u.setQQnum(rs.getInt(1));
				u.setNickName(rs.getString(2));
				u.setPassWord(rs.getString(3));
				u.setGender(rs.getString(4));
				u.setDescription(rs.getString(5));
				u.setIp(rs.getString(6));
			}
			//关闭连接
			ConnectionUtil.closeCon(rs, ps, con);
			return u;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	//找出所有的好友
	public List<User> findAllFriend(int QQnum) {
		ResultSet rs=null;
		//结果集主要用于查询
		PreparedStatement ps=null;
		Connection con=null;
		try{
			List<User> list = new ArrayList<User>();
			con=ConnectionUtil.getCon();
			ps=con.prepareStatement(
					"select * from user u where u.QQnum<>?");
			ps.setInt(1, QQnum);
			rs=ps.executeQuery();
			while(rs.next()){
				User u=new User();
				//User的实例化应该放在循环的里面
				//放在外面就所有的数据都属于最后一个User
				u.setQQnum(rs.getInt(1));
				u.setNickName(rs.getString(2));
				u.setPassWord(rs.getString(3));
				u.setGender(rs.getString(4));
				u.setDescription(rs.getString(5));
				u.setIp(rs.getString(6));
				list.add(u);
			}
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally{
			ConnectionUtil.closeCon(rs,ps,con);
		}
	}
	public List<User> findFriendByQQNum(int qqNum) {
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
				u.setQQnum(rs.getInt(1));
				u.setNickName(rs.getString(2));
				u.setPassWord(rs.getString(3));
				u.setGender(rs.getString(4));
				u.setDescription(rs.getString(5));
				u.setIp(rs.getString(6));
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

	//通过QQ号查找用户名
	public String getNameByQQnum(int qqNum){
		Connection con=ConnectionUtil.getCon();
		//创建statement
		PreparedStatement pstm;
		try {
			pstm = con.prepareStatement(
					"select * from user u where u.qqnum=?");
			//设置参数，针对？占位符
			pstm.setInt(1, qqNum);
			//执行sql语句
			ResultSet rs=pstm.executeQuery();
			User u=null;
			while(rs.next()){
				u=new User();
				u.setQQnum(rs.getInt(1));
				u.setNickName(rs.getString(2));
				u.setPassWord(rs.getString(3));
				u.setGender(rs.getString(4));
				u.setDescription(rs.getString(5));
				u.setIp(rs.getString(6));
			}
			//关闭连接
			ConnectionUtil.closeCon(rs, pstm, con);
			String name= " ";
			name = u.getNickName();
			return name;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
	}
}
