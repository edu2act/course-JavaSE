package com.GoChat.message.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.GoChat.entity.Message;
import com.GoChat.util.ConnectionUtil;

public class MessageDaoImpl {
	//将信息保存到数据库中
	public int saveMessage(Message message){
		Connection con=null;
		PreparedStatement pstm=null;
		try{
			con=ConnectionUtil.getCon();
			pstm=con.prepareStatement(
					"insert into message(content,sender,receiver,"
					+ "sendTime,state)values(?,?,?,?,?)",
					Statement.RETURN_GENERATED_KEYS);
			pstm.setString(1, message.getContent());
			pstm.setInt(2, message.getSender());
			pstm.setInt(3, message.getRecevier());
			pstm.setString(4, message.getSendTime().toLocaleString());
			pstm.setInt(5, message.getState());
			pstm.executeUpdate();
			ResultSet rs=pstm.getGeneratedKeys();
			int key=0;
			if(rs.next())
				key=rs.getInt(1);
			return key;
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}finally{
			ConnectionUtil.closeCon(null, pstm, con);
		}
	}

}
