package com.myqq.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionUtil {
	//	加载驱动类
	//	记得要导入老师给的外包类 我就忘记了然后报错
	//	点击Project-Properties中的Java Build Path
	static{
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	//	获取数据库连接
	public static Connection getConnection(){
		try{
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/myqq?Unicode=true&characterEncoding=UTF-8","root","");
			return con;
					
		}catch(SQLException e){
			e.printStackTrace();
			return null;
		}
	}

	//	关闭数据连接
	public static void closeConnection(ResultSet rs,PreparedStatement pstm,Connection con){
		try{
			if(rs!=null){
				rs.close();
			}
			if(pstm!=null){
				pstm.close();
			}
			if(con!=null){
				con.close();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
