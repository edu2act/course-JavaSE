package com.myqq.util;

import java.net.InetAddress;

public class IpUtil {

	/*
	 * 获取本机地址，
	 */
	public static String getLocalHostAddress() {
		String hostName;
		try {
			InetAddress addr = InetAddress.getLocalHost();
			hostName = addr.getHostAddress();
		} catch (Exception ex) {
			hostName = "";
		}
		return hostName;
	}

}
