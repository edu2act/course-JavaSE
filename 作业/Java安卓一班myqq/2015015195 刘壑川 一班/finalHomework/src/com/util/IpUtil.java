package com.util;

import java.net.InetAddress;

public class IpUtil {
	public static String getLocalHostAddress() {
		String hostName;
		try {
			InetAddress address = InetAddress.getLocalHost();
			hostName = address.getHostAddress();
		} catch (Exception e) {
			hostName = "";
		}
		return hostName;
	}
}
