package com.message.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bean.Message;
import com.util.DatabaseUtil;

public class MessageDaoImpl {
	public int saveMessage(Message message){
		Connection con = null;
		PreparedStatement s = null;
		int key = 0;
		try{
			con = DatabaseUtil.getConnection();
			String sql = "insert into message (content,sender,receiver,sendTime,state) values(?,?,?,?,?)";
			s = con.prepareStatement(sql);
			s.setString(1,message.getContent());
			s.setInt(2,message.getSender());
			s.setInt(3,message.getReceiver());
			s.setString(4, message.getSendTime().toLocaleString());
			s.setInt(5,message.getState());
			s.executeUpdate();
			ResultSet rs = s.getGeneratedKeys();
			if(rs.next()){
				key = rs.getInt(1);
			}
			return key;
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}finally{
			DatabaseUtil.close(null, s, con);
		}
		
	}
}
