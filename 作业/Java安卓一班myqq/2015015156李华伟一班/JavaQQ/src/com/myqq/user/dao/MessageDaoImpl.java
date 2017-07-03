package com.myqq.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.myqq.entity.Message;
import com.myqq.entity.User;
import com.myqq.util.ConnectionUtil;

public class MessageDaoImpl {
	public Message getMessage(int id){
		try{
			//获取数据库连接
			Connection con=ConnectionUtil.getCon();
			//创建statement
			PreparedStatement pstm=con.prepareStatement(
					"select * from message u where u.id=?");
			//设置参数，针对？占位符
			pstm.setInt(1, id);
			//执行sql语句
			ResultSet rs=pstm.executeQuery();
			Message u=null;
			while(rs.next()){
				u=new Message();
				u.setId(rs.getInt(1));
				u.setContent(rs.getString(2));
				u.setSender(rs.getInt(3));
				u.setReceiver(rs.getInt(4));
				u.setSendTime(rs.getDate(5));
				u.setReceiveTime(rs.getDate(6));
				u.setState(rs.getInt(7));
			}
			//关闭连接
			ConnectionUtil.closeCon(rs, pstm, con);
			return u;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	public boolean saveMessage(Message u){
		try{
			//获取数据库连接
			Connection con=ConnectionUtil.getCon();
			//创建statement
			PreparedStatement pstm=con.prepareStatement(
					"insert into message(id,content,sender,"
					+ "receiver,sendTime,receiveTime,state) values(?,?,?,?,?,?,?)",
					Statement.RETURN_GENERATED_KEYS);
			//设置参数，针对？占位符
			pstm.setInt(1, u.getId());
			pstm.setString(2, u.getContent());
			pstm.setInt(3,u.getSender()); 
			pstm.setInt(4, u.getReceiver());
			pstm.setString(5, u.getSendTime().toLocaleString());
			pstm.setString(6, u.getReceiveTime().toLocaleString());
			pstm.setInt(7, u.getState());
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
}
