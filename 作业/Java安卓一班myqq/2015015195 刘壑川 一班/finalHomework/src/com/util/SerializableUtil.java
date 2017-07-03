package com.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.bean.Message;


public class SerializableUtil {
	//序列化
	public static byte[] serializableMessage(Message message) throws Exception{
		ByteArrayOutputStream byteArrayOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		try{
			//以字节数组构造序列化流
			byteArrayOutputStream = new ByteArrayOutputStream();
			//将序列化流转为输出流
			objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
			//得到输出流写入
			objectOutputStream.writeObject(message);
			
			return byteArrayOutputStream.toByteArray();
			
		}finally{
			if(byteArrayOutputStream != null){
				byteArrayOutputStream.close();
			}
			if(objectOutputStream != null){
				objectOutputStream.close();
			}
			
		}
	}
	//反序列化
	public static Message unserializableMessage(byte[] cache) throws Exception{
		ByteArrayInputStream byteArrayInputStream = null;
		ObjectInputStream objectInputStream = null;
		try{
			byteArrayInputStream = new ByteArrayInputStream(cache);
			objectInputStream = new ObjectInputStream(byteArrayInputStream);
			
			return (Message)objectInputStream.readObject();
			
		}finally{
			if(byteArrayInputStream != null){
				byteArrayInputStream.close();
			}
			if(objectInputStream != null){
				objectInputStream.close();
			}
			
		}
	}
	
}
