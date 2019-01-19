package com.zqwer.test;

import com.zqwer.threadTest.runTest;

public class doubleNode {
	public static void main(String[] args) {
		int i=febonacci(6);
		System.out.println(i);
	
	}
	public  static void print( int i) {
		//递归
		if (i>0) {
			System.out.println(i);
			print(i-1);
			
		}
		
	}
	public  static int febonacci(int i) {
		/**
		 * 斐波那数列递归
		 */
		if (i==1||i==2) {
			return 1;
		}else {
			return febonacci(i-1)+febonacci(i-2);
		}
	}
	
}
