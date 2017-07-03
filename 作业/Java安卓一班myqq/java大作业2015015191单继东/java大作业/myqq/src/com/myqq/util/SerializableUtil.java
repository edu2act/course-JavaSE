package com.myqq.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.myqq.entity.Message;

public class SerializableUtil {
	
	public static byte[] serializableMessage(Message message) throws Exception{
		ByteArrayOutputStream byteArrayOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(message);
            return byteArrayOutputStream.toByteArray();
        } finally {
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
            if (objectOutputStream != null) {
                objectOutputStream.close();
            }

        }
	}
	public static Message unSerializableMessage(byte[] cache) throws Exception{
		ByteArrayInputStream byteArrayInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            byteArrayInputStream = new ByteArrayInputStream(cache);
            objectInputStream = new ObjectInputStream(byteArrayInputStream);
            return (Message)objectInputStream.readObject();
        } finally {
            if (byteArrayInputStream != null)
                byteArrayInputStream.close();
            if (objectInputStream != null)
                objectInputStream.close();
        }
	}
}
