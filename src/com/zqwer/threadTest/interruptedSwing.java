package com.zqwer.threadTest;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.lang.reflect.Array;

import javax.swing.*;


import com.sun.org.apache.xml.internal.security.Init;

public class interruptedSwing extends JFrame{
	Thread thread;
	
	public static void main(String[] args) {
		Init(new interruptedSwing(),100,100);
	}
	private static void Init(Frame frame, int width, int height) {
		frame.setSize(width, height);
		frame.setVisible(true);
		((JFrame) frame).setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public interruptedSwing() {
		super();
		final JProgressBar progressBar=new JProgressBar();
		getContentPane().add(progressBar, BorderLayout.NORTH);
		progressBar.setStringPainted(true);
		thread=new Thread(new Runnable() {
			
			//使用数组与线程睡眠时间实现进度条
			int count[]=new int[]{10,20,31,43,55,67,79,90,100};
			public void run() {
				while(true) {
						for (int i = 0; i < count.length; i++) {
							try {
								progressBar.setValue(count[i]);
								Thread.sleep(200);
								
								
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
						break;		
				}
				/**
				 * 此处可以添加进度条完成后加载出的画面之类	
				 */
			}

		});
		
		thread.start();
		
		
	}
	
	
}
