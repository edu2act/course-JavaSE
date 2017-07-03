package com.mychat.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.mychat.yp.message;

public class SerializableUtil {
	public static byte[] serializableMessage(message message) throws Exception{
		ByteArrayOutputStream byteArrayOutputStream = null; //字节数组输出流		
		ObjectOutputStream objectOutputStream = null; //序列化流
		try {
			
			byteArrayOutputStream = new ByteArrayOutputStream(); //以字节数组输出流为输出目的地，构造序列化流
			objectOutputStream = new ObjectOutputStream(byteArrayOutputStream); //将message对象序列化，输出到字节数组流
			objectOutputStream.writeObject(message);//得到字节数组流中的内容
			
			return byteArrayOutputStream.toByteArray();
		} finally {
			if(byteArrayOutputStream != null){
				byteArrayOutputStream.close();
			}
			if(objectOutputStream != null){
				objectOutputStream.close();
			}
		}
	}
	
	public static message unSerializableMessage(byte[] cache) throws Exception{
		ByteArrayInputStream byteArrayInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            byteArrayInputStream = new ByteArrayInputStream(cache);
            objectInputStream = new ObjectInputStream(byteArrayInputStream);
            return (message)objectInputStream.readObject();
        } finally {
            if (byteArrayInputStream != null)
                byteArrayInputStream.close();
            if (objectInputStream != null)
                objectInputStream.close();
        }
	}
}


