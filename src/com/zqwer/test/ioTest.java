package com.zqwer.test;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
public class ioTest {	
	public static void main(String[] args) {
		String content[]= {"好久不见","你还好吗.","zqwer"};
		File file=new java.io.File("word.txt");
		try {
			FileWriter fw=new FileWriter(file);
			BufferedWriter bufr=new BufferedWriter(fw);
			for (int k = 0; k < content.length; k++) {
				bufr.write(content[k]);
				bufr.newLine();
				
			}
			bufr.write("你还记得我吗？");
			bufr.close();
			fw.close();
			} catch (Exception e) {
				e.printStackTrace();
			
			}
		try {
			FileReader fR=new FileReader(file);
			BufferedReader bReader=new BufferedReader(fR);
			String string=null;
			int i=0;
			while((string=bReader.readLine())!=null) {
				i++;
				System.out.println("第"+i+"行:"+string);
			}
			bReader.close();
			fR.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
