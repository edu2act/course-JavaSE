package test;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class D{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			BufferedWriter bw=new BufferedWriter(new FileWriter("d:/a.txt"));
			bw.write("姓名 数学 语文 英语");
			bw.newLine();
			bw.write("张三 90 86 40");
			bw.flush();
			bw.close();
			String r=Student.bujige();
			System.out.println(r);
			String m=Student.youxiu();
			System.out.println(m);
			int n=Student.avgMath();
			System.out.println(n);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
