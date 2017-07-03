package com.GoChat.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import com.GoChat.entity.Message;

public class SerializableUtil {

	public static byte[] serializableMessage(Message message) throws Exception{//把Message对象转换成字节流数组
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();//字节数组的输出流
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);//序列化的输出流
		try{
			byteArrayOutputStream = new ByteArrayOutputStream();//没有对象，是低级流
			//以字节数组输出流为输出目的地，构造序列化流
			objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);//是高级流
			//将message对象序列化，输出到字节数组流
			objectOutputStream.writeObject(message);
			//得到字节数组流中的内容
			return byteArrayOutputStream.toByteArray();//message对象序列化之后的数组
		}finally{
			if(byteArrayOutputStream != null) {
				byteArrayOutputStream.close();
			}
			if(objectOutputStream != null) {
				objectOutputStream.close();
			}
		}
	}
	public static Message unSerializableMessage(byte[] cache) throws Exception{//反序列化,将字节数组转换成Message对象
		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(cache);//字节数组的输出流
		ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);//序列化的输出流
		try{
			byteArrayInputStream = new ByteArrayInputStream(cache);
			objectInputStream = new ObjectInputStream(byteArrayInputStream);
			return (Message)objectInputStream.readObject();
		}finally{
			if(byteArrayInputStream != null) {
				byteArrayInputStream.close();
			}
			if(objectInputStream != null) {
				objectInputStream.close();
			}
		}
	}
	
}
