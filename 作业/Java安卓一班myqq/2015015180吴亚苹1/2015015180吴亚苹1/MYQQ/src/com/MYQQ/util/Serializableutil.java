package com.MYQQ.util;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.MYQQ.entity.message;
public class Serializableutil {
	public static byte[] serializableMessage(message message1) throws Exception{
		ByteArrayOutputStream byteArrayOutputStream=null;
		ObjectOutputStream  objectOutputStream=null;
		try{
			byteArrayOutputStream=new ByteArrayOutputStream();
			//以字节数组输出流为输出目的地，构造序列化流
			objectOutputStream =new ObjectOutputStream(byteArrayOutputStream);
			//将message对象序列化，输出到字节数组流
			objectOutputStream.writeObject(message1);
			//得到字节数组流中的内容
			return byteArrayOutputStream.toByteArray();
		}finally{
			if(byteArrayOutputStream !=null){
				byteArrayOutputStream.close();
			}
			if (objectOutputStream != null) {
                objectOutputStream.close();
            }
		}
	}
	//反序列化
	public static message unSeralizableMessage(byte[] cache)throws Exception{
		ByteArrayInputStream byteArrayInputStream=null;
		ObjectInputStream  objectInputStream=null;
		try{
			byteArrayInputStream=new ByteArrayInputStream(cache);
			objectInputStream=new ObjectInputStream(byteArrayInputStream);
			return (message)objectInputStream.readObject();
		}finally{
			if(byteArrayInputStream !=null){
				
				byteArrayInputStream.close();
			}
			if(objectInputStream!=null){
				objectInputStream.close();
			}
		}
		
	}
}
