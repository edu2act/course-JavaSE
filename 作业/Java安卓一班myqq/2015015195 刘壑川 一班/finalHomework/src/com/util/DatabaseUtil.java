package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseUtil {
	private static final String DBORIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/javafinalwork";	//连接字符串
	private static final String USER = "root";	//用户名
	private static final String PASSWORD = "";	//密码
	/** 打开数据库  */
	 static{
		try {
			/*1.加载驱动类 */
			Class.forName(DBORIVER);
		}catch(Exception e){
			e.printStackTrace();
		}
	 }
	 /** 得到连接 */
	public static Connection getConnection(){
		/*2. 实例化数据库连接对象 */
		Connection con = null;
		try {
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			return con;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		/*3.  获取Statement 实例化数据库操作对象 */
	} 
	/** 关闭数据库 */
	public static void close(ResultSet rs,PreparedStatement pstm,Connection con){
		try{
			if(rs!=null)
				rs.close();
			if(pstm!=null)
				pstm.close();
			if(con!=null)
				con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
