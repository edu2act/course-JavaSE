package com.myqq.util;

import java.net.InetAddress;

public class IpUtil {

	public static  String getLocalHostAddress() {
		String hostName;
		try {
			InetAddress addr = InetAddress.getLocalHost();
			hostName = addr.getHostAddress();
		} catch (Exception ex) {
			hostName = "";
		}
		return hostName;
	}
//	public static void main(String[] args) {
//		IpUtil ip=new IpUtil();
//		System.out.println(ip.getLocalHostAddress());
//	}

}
