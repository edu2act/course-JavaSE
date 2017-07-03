package com.myqq.file.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.myqq.entity.File;
import com.myqq.entity.Message;
import com.myqq.util.ConnectionUtil;

public class FileDaoImpl {
	
	public int saveFile(File file){
		Connection con=null;
		PreparedStatement pstm=null;
		try{
			con=ConnectionUtil.getCon();
			pstm=con.prepareStatement(
					"insert into file(content,sender,receiver,"
					+ "sendTime,state)values(?,?,?,?,?)",
					Statement.RETURN_GENERATED_KEYS);
			pstm.setString(1, file.getContent());
			pstm.setInt(2, file.getSender());
			pstm.setInt(3, file.getReceiver());
			pstm.setString(4, file.getSendTime().toLocaleString());
			pstm.setInt(5, file.getState());
			pstm.executeUpdate();
			//ResultSet rs=stmt.executeQuery(sql);
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
