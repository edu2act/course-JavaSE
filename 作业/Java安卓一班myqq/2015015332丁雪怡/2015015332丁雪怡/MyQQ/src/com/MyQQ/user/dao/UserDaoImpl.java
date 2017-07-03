package com.MyQQ.user.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.MyQQ.entity.User;
import com.MyQQ.util.ConnectionUtil;

public class UserDaoImpl {
	//用户持久对象的实现类
	
//	
//	public User getUser(int qqNum){
//		try{
//			//获取数据库连接
//			Connection con=ConnectionUtil.getCon();
//			//创建statement
//			PreparedStatement pstm=con.prepareStatement(
//					"select * from user u where u.qqnum=?");
//			//设置参数，针对？占位符
//			pstm.setInt(1, qqNum);
//			//执行sql语句
//			ResultSet rs=pstm.executeQuery();
//			User u=null;
//			while(rs.next()){
//				u=new User();
//				u.setQqNum(rs.getInt(1));
//				u.setNickName(rs.getString(2));
//				u.setPassword(rs.getString(3));
//				u.setRegitstTime(rs.getDate(4));
//				u.setGender(rs.getString(5));
//				u.setIntroduce(rs.getString(6));
//				u.setIP(rs.getString(7));
//			}
//			//关闭连接
//			ConnectionUtil.closeCon(rs, pstm, con);
//			return u;
//		}catch(Exception e){
//			e.printStackTrace();
//			return null;
//		}
//	}
//	//新增用户功能
//	public boolean saveUser(User u){ //表示注册失败或成功 
//		try 
//		{
//			//1、加载驱动类
//			Class.forName("com.mysql.jdbc.Driver");
//			//2、获取数据库连接
//			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/chat_db?useUnicode=true&characterEncoding=UTF-8","root","");
//			//3、获取statement
//			PreparedStatement pstm=con.prepareStatement("insert into user(nickName,password,sex,"
//					+ "introduce,ip) values(?,?,?,?,?)"); 
//			//问号作为占位符，几个字符几个问号，给statement传参
//			pstm.setString(1,u.getNickName());
//			pstm.setString(2,u.getPassword());
//			pstm.setString(3,u.getGender());
//			pstm.setString(4,u.getIntroduce());
//			pstm.setString(5,u.getip());
//			//执行sql语句
//			int count=pstm.executeUpdate(); 
//			//只有查询是executeQuery(),其他都是executeUpdate()，表示执行的sql语句影响的行数
//			pstm.close();
//			con.close();
//			if(count>0){
//				return true;
//			}
//			else{
//				return false;
//			}
//			
//		}catch(Exception e){
//			e.printStackTrace();
//			return false;
//		}
//	}
//	
//	//查询功能
//	public User findByNameAndPassword(String qqNum,String password){
//		try{
//		//1、加载驱动类
//		Class.forName("com.mysql.jdbc.Driver");
//		//2、获取数据库连接
//		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/chat_db?useUnicode=true&characterEncoding=UTF-8","root","");
//		//3、获取statement
//		PreparedStatement pstm=con.prepareStatement("select * from user u where u.qqNum=? and u.password=?"); 
//		//问号作为占位符，几个字符几个问号，给statement传参
//		pstm.setString(1,qqNum);
//		pstm.setString(2,password);
//		//执行sql语句
//		ResultSet rs=pstm.executeQuery(); 
//		User u=new User();
//		while(rs.next()){
//			u.setQqNum(rs.getInt(1));//拿到它的第一个字段是qq号所以是int
//			u.setNickName(rs.getString(2));//因为是昵称所以是string
//			u.setPassword(rs.getString(3));
//			u.setGender(rs.getString(4));
//			u.setIntroduce(rs.getString(5));
//			u.setIP(rs.getString(6));
//		}
//		pstm.close();
//		con.close();
//		return u;
//		}catch(Exception e){
//			e.printStackTrace();
//			return null;
//		}
//	}
//	public List<User> findaAllFriend(int qqNum){
//		ResultSet rs=null;
//		PreparedStatement pstm=null;
//		Connection con=null;
//		
//		try{
//			List<User> list=new ArrayList<User>();
//			con=ConnectionUtil.getCon();
//			pstm=con.prepareStatement("select * from user u where u.qqNum<>?");
//			pstm.setInt(1, qqNum);
//			rs=pstm.executeQuery();
//			while(rs.next()){
//				User u=new User();
//				//User的实例化应该放在循环里，放在外面数据都属于最后一个user
//				u.setQqNum(rs.getInt(1));
//				u.setNickName(rs.getString(2));
//				u.setPassword(rs.getString(3));
//				u.setGender(rs.getString(4));
//				u.setIntroduce(rs.getString(5));
//				u.setIP(rs.getString(6));
//				list.add(u);
//			}
//		}catch(Exception e){
//			e.printStackTrace();
//			return null;
//		}finally{
//			ConnectionUtil.closeCon(rs,pstm,con);
//		}
//		return null;
//		
//	}
//	
//	public boolean updatePassword(int qqNum,String newPassword){
//		ResultSet rs=null;
//		PreparedStatement pstm=null;
//		Connection con=null;
//		try{
//			con=ConnectionUtil.getCon();
//			pstm=con.prepareStatement("update user set password=? where qqNum=?");
//			pstm.setString(1, newPassword);
//			int count =pstm.executeUpdate();
//			if(count>0){
//				return true;
//			}
//		}catch(Exception e){
//			e.printStackTrace();
//			return false;
//		}finally{
//			ConnectionUtil.closeCon(rs,pstm,con);
//		}
//		return false;
//		
//	}
//	public void updateIp(String qqNum, String ip){
//		Connection con=null;
//		PreparedStatement pstm=null;
//		try{
//			con=ConnectionUtil.getCon();
//			pstm=con.prepareStatement(
//					"update user set ip=? where qqNum=?");
//			pstm.setString(1, ip);
//			pstm.setString(2, qqNum);
//			pstm.executeUpdate();
//		}catch(Exception e){
//			e.printStackTrace();
//		}finally{
//			ConnectionUtil.closeCon(null, pstm, con);
//		}
//	}
//	
//	/**
//	 * 按用户qq号和密码查询用户
//	 * @param qqNum
//	 * @param password
//	 * @return
//	 */
//	public User findByQqNumAndPassword(int qqNum, String password){
//		try{
//			//获取数据库连接
//			Connection con=ConnectionUtil.getCon();
//			//创建statement
//			PreparedStatement pstm=con.prepareStatement(
//					"select * from user u where u.qqnum=? and u.password=?");
//			//设置参数，针对？占位符
//			pstm.setInt(1, qqNum);
//			pstm.setString(2, password);
//			//执行sql语句
//			ResultSet rs=pstm.executeQuery();
//			User u=null;
//			while(rs.next()){
//				u=new User();
//				u.setQqNum(rs.getInt(1));
//				u.setNickName(rs.getString(2));
//				u.setPassword(rs.getString(3));
//				u.setRegitstTime(rs.getDate(4));
//				u.setGender(rs.getString(5));
//				u.setIntroduce(rs.getString(6));
//				u.setIP(rs.getString(7));
//			}
//			//关闭连接
//			ConnectionUtil.closeCon(rs, pstm, con);
//			return u;
//		}catch(Exception e){
//			e.printStackTrace();
//			return null;
//		}
//	}
//	
//	public List<User> findFriendByQqNum(int qqNum){
//		Connection con=null;
//		PreparedStatement pstm=null;
//		ResultSet rs=null;
//		try{
//			List<User> list=new ArrayList<User>();
//			con=ConnectionUtil.getCon();
//			pstm=con.prepareStatement(
//					"select * from user u where u.qqnum<>?");
//			pstm.setInt(1, qqNum);
//			rs=pstm.executeQuery();
//			while(rs.next()){
//				User u=new User();
//				u.setQqNum(rs.getInt(1));
//				u.setNickName(rs.getString(2));
//				u.setPassword(rs.getString(3));
//				u.setRegitstTime(rs.getDate(4));
//				u.setGender(rs.getString(5));
//				u.setIntroduce(rs.getString(6));
//				u.setIP(rs.getString(7));
//				list.add(u);
//			}
//			return list;
//		}catch(Exception e){
//			e.printStackTrace();
//			return null;
//		}finally{
//			ConnectionUtil.closeCon(rs, pstm, con);
//		}
//		
//	}
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
				u.setQqNum(rs.getInt(1));
				u.setNickName(rs.getString(2));
				u.setPassword(rs.getString(3));
				u.setGender(rs.getString(4));
				u.setIntroduce(rs.getString(5));
				u.setIP(rs.getString(6));
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
			pstm.setString(2, u.getPassword());
			pstm.setString(3, u.getGender());
			pstm.setString(4, u.getIntroduce());
			pstm.setString(5, u.getip());
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
				u.setQqNum(rs.getInt(1));
				u.setNickName(rs.getString(2));
				u.setPassword(rs.getString(3));
				u.setGender(rs.getString(4));
				u.setIntroduce(rs.getString(5));
				u.setIP(rs.getString(6));
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
				u.setQqNum(rs.getInt(1));
				u.setNickName(rs.getString(2));
				u.setPassword(rs.getString(3));
				u.setGender(rs.getString(4));
				u.setIntroduce(rs.getString(5));
				u.setIP(rs.getString(6));
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
				u.setQqNum(rs.getInt(1));
				u.setNickName(rs.getString(2));
				u.setPassword(rs.getString(3));
				u.setGender(rs.getString(4));
				u.setIntroduce(rs.getString(5));
				u.setIP(rs.getString(6));
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
	public String findName(int qqNum){
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
				u.setQqNum(rs.getInt(1));
				u.setNickName(rs.getString(2));
				u.setPassword(rs.getString(3));
				u.setGender(rs.getString(4));
				u.setIntroduce(rs.getString(5));
				u.setIP(rs.getString(6));
			}
			//关闭连接
			ConnectionUtil.closeCon(rs, pstm, con);
			String name= " ";
			name = u.getNickName();
			return name;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
	}
}
