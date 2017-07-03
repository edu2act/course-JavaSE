package com.MyQQ.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import com.MyQQ.entity.Message;


public class SerializableUtil {

	public static byte[] SerializableMessage(Message message) throws Exception{
		//字节数组输出流
		ByteArrayOutputStream byteArrayOutputStream = null;
		//序列化流
		ObjectOutputStream objectOutputStream = null;
		try{
			byteArrayOutputStream = new ByteArrayOutputStream();//没有对象，是低级流，因为没有对象当做参数
			//以字节数组输出流为输出目的地，构造序列化流
			objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
			//将message对象序列化，输出到字节数组
			objectOutputStream.writeObject(message);
			//得到字节数组流中的内容
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
	
	
	public static Message UnSerializableMessage(byte [] cache) throws Exception{
		ByteArrayInputStream byteArrayOutputStream = null;
		ObjectInputStream objectOutputStream = null;
		try{
			byteArrayOutputStream = new ByteArrayInputStream(cache);
			objectOutputStream = new ObjectInputStream(byteArrayOutputStream);
			return (Message)objectOutputStream.readObject();
		}finally{
			if(byteArrayOutputStream != null){
				byteArrayOutputStream.close();
			}
			if(objectOutputStream != null){
				objectOutputStream.close();
			}
			
		}
	}
		
}
