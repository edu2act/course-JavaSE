package com.mychat.message.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mychat.entity.Message;
import com.mychat.util.ConnectionUtil;



public class MessageDaoImpl {
	
	public int saveMessage(Message message){
		Connection con = null;
		PreparedStatement pstm = null;
		try{
			con = ConnectionUtil.getConnection();
			pstm = con.prepareStatement("insert into message(content,sender,receiver,"
					+ "sendTime,state)values(?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
			pstm.setString(1, message.getContent());
			pstm.setInt(2, message.getSender());
			pstm.setInt(3, message.getReceiver());
			pstm.setString(4, message.getSendTime().toLocaleString());
			pstm.setInt(5, message.getState());
			pstm.executeUpdate();
			
			ResultSet rs = pstm.getGeneratedKeys();
			// 检索自动生成的键 这里是id主键
			int key = 0;
			if(rs.next()){
				key = rs.getInt(1);
			}
			return key;
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}finally{
			ConnectionUtil.closeConnection(null, pstm, con);
		}
	}
	
	public void addChatFrameToMySql(Message message){
		Connection con = null;
		PreparedStatement pstm = null;
		try{
			con = ConnectionUtil.getConnection();
			pstm = con.prepareStatement("insert into chatFrame(sender,receiver)"
					+ "values(?,?)");
			pstm.setInt(1, message.getSender());
			pstm.setInt(2, message.getReceiver());
			
			int count = pstm.executeUpdate();
			ConnectionUtil.closeConnection(null, pstm, con);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public int[] checkIsExistsInChatFrame(Message message){
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try{
			con = ConnectionUtil.getConnection();
			pstm = con.prepareStatement("select * from chatFrame u where u.sender = ? and u.receiver = ?");
			pstm.setInt(1, message.getSender());
			pstm.setInt(2,message.getReceiver());
			
			int[] arr = new int[2];
			
			rs = pstm.executeQuery();
			while(rs.next()){
				arr[0] = rs.getInt(1);
				arr[1] = rs.getInt(2);
			}
			return arr;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
}
