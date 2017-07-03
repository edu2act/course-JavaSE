package com.myqq.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.myqq.entity.Message;

public class SerializableUtil {

	public static byte[] serializableMessage(Message message) throws IOException {
		//字节数组输出流
		ByteArrayOutputStream byteArrayOutputStream = null;
		//序列化流
		ObjectOutputStream objectOutputStream = null;
		try {
			
			byteArrayOutputStream = new ByteArrayOutputStream();
			//以字节数组输出流为输出目的，构造序列化流
			objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
			//将message 对象序列化，输出到字节数组流
			objectOutputStream.writeObject(message);
			//得到字节数组流中的内容
			return byteArrayOutputStream.toByteArray();
		} finally {
			if(byteArrayOutputStream != null) {
				byteArrayOutputStream.close();
			}
			if(objectOutputStream != null) {
				objectOutputStream.close();
			}
		}
	}
	
	public static Message UnserializableMessage(byte[] cache) throws IOException, ClassNotFoundException  {
		//字节数组输出流
		ByteArrayInputStream byteArrayInputStream = null;
		ObjectInputStream objectInputStream = null;
		try {
			byteArrayInputStream = new ByteArrayInputStream(cache);
			objectInputStream = new ObjectInputStream(byteArrayInputStream);
			return (Message)objectInputStream.readObject();
		} finally {
			if(byteArrayInputStream != null) {
				byteArrayInputStream.close();
			}
			if(objectInputStream != null) {
				objectInputStream.close();
			}
		}
	}
	
}
