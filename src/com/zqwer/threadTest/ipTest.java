package com.zqwer.threadTest;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ipTest {
	public static void main(String[] args) {
		InetAddress ip;
		
		try {
			ip=InetAddress.getLocalHost();
			String localname=ip.getHostName();
			String localip=ip.getHostAddress();
			System.out.println(localname);
			System.out.println(localip);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
