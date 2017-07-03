package com.mychat.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionUtil {
	static{
		//加载驱动类
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	
	public static Connection getCon(){
		//获取数据库连接
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyChat_db?useUnicode=true&characterEncoding=UTF-8","root","");
			return con;
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return null;
		}
	}
	
	public static void closeCon(ResultSet rs,PreparedStatement pstm,Connection con){
		//关闭数据库连接
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
