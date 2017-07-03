package com;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Reader {
	public static void main(String[] args) throws IOException{
		//存入数据
		BufferedWriter bw = new BufferedWriter(new FileWriter("f:/a.txt"));

		Writer.student(bw, "1" , "赵一", "97", "86");
		Writer.student(bw, "1" , "钱二", "64", "65");
		Writer.student(bw, "1" , "孙三", "54", "71");
		Writer.student(bw, "2" , "李四", "78", "90");
		Writer.student(bw, "2" , "周五", "91", "55");
		Writer.student(bw, "3" , "武六", "87", "76");
		Writer.student(bw, "3" , "郑七", "90", "85");
		Writer.student(bw, "3" , "王八", "92", "80");
		
		bw.close();
		BufferedReader stu = new BufferedReader(new FileReader("H:/JAVA/a.txt"));
		System.out.println("不及格学生的名单：");
		Writer.faliStudent(stu);
		System.out.println("90分以上学生名单：");
		Writer.goodStudent(stu);
		stu.close();
		System.out.println("各班数学平均成绩：");
		for(int i = 1;i <= 3;i ++) {
			BufferedReader avgbr = new BufferedReader(new FileReader("H:/JAVA/a.txt"));
			Writer.mathAvg(i,avgbr);
			avgbr.close();
		}
		

	}
	
	

}
