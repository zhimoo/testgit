package com.zqwer.threadTest;

public class runTest extends Thread{
	Thread thread;
	
	public void run() {
		
		String[]count=new String[]{"你还好吗","zqwer","我还好啊","nice to meet you ","thanks"};
		for (int i = 0; i < count.length; i++) {
			try {
				
				System.out.println(count[i]);
				thread.sleep(300);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		//直接new一个类对象就OK复写run在run内些业务
		new runTest().start();
	}
}
