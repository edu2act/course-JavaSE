package com.myqq.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.myqq.entity.Message;

public class SerializableUtil {
	
	public static byte[] serializableMessage(Message message){
		
		//	字节数组输出流，将Message对象存入这个输出流中
		ByteArrayOutputStream byteArrayOutputStream = null;
		//	序列化流
		ObjectOutputStream objectOutputStream = null;
		
		try{
			byteArrayOutputStream = new ByteArrayOutputStream();
			objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
			//	将message存储到字节流内
			objectOutputStream.writeObject(message);
			//	再将字节流内的message以字节的形式返回
			return byteArrayOutputStream.toByteArray();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally{
			if(byteArrayOutputStream != null){
				try {
					byteArrayOutputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(objectOutputStream!=null){
				try {
					objectOutputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public static Message unSerializableMessage(byte[] bytes){
		ObjectInputStream objectInputStream = null;
		ByteArrayInputStream byteArrayInputStream = null;
		try{
			byteArrayInputStream = new ByteArrayInputStream(bytes);
			objectInputStream = new ObjectInputStream(byteArrayInputStream);
			return (Message)objectInputStream.readObject();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		} finally{
			if(byteArrayInputStream != null){
				try {
					byteArrayInputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(objectInputStream != null){
				try {
					objectInputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
