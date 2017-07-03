package student;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//存入数据
		BufferedWriter bw = new BufferedWriter(new FileWriter("e:/stu.txt"));

		Student.instu(bw, "1" , "zhao", "90", "100");
		Student.instu(bw, "1" , "qian", "80", "90");
		Student.instu(bw, "1" , "sun", "40", "70");
		Student.instu(bw, "1" , "li", "90", "90");
		Student.instu(bw, "1" , "zhou", "76", "55");
		Student.instu(bw, "2" , "wu", "98", "40");
		Student.instu(bw, "2" , "zheng", "70", "56");
		Student.instu(bw, "2" , "wang", "98", "85");
		Student.instu(bw, "3" , "feng", "90", "80");
		
		bw.close();
		
			
		//输出数据
		BufferedReader br = new BufferedReader(new FileReader("e:/stu.txt"));
		Student.outstu(br);
		br.close();
		
		
		//查询所有有不及格科目的学生姓名
		BufferedReader failbr = new BufferedReader(new FileReader("e:/stu.txt"));
		System.out.println("不及格学生名单：");
		Student.failstu(failbr);
		failbr.close();
		
		//查询所有90分以上学生姓名
		BufferedReader goodbr = new BufferedReader(new FileReader("e:/stu.txt"));
		System.out.println("90分以上学生名单：");
		Student.goodstu(goodbr);
		goodbr.close();

		//查询各班数学平均分
		System.out.println("各班数学平均成绩：");
		for(int i = 1;i <= 3;i ++) {
			BufferedReader avgbr = new BufferedReader(new FileReader("e:/stu.txt"));
			Student.mathavg(i,avgbr);
			avgbr.close();
		}
		
		

		
	}
		

}
