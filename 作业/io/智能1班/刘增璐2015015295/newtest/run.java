package newtest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

import java.util.Scanner;
public class run {

	//
	// public void showFile(File file){
	// if(file.isFile()){
	// System.out.println("文件："+file.getName());
	// }else if(file.isDirectory()){
	// System.out.println("目录"+file.getName());
	// File [] fs = file.listFiles();
	// for(File temp :fs){
	// showFile(temp);
	// }
	// }
	// }
//	public static HashMap<Integer, Integer> getAvgScore() {
//		BufferedReader BR = null;
//		try {
//			HashMap hm = new HashMap();
//			int count = 0;
//			BR = new BufferedReader(new FileReader("e:/a.txt"));
//			String line = BR.readLine();
//			while (line != null) {
//				int sum = 0;
//				String[] s = line.split(",");
//				sum += Integer.parseInt(s[2]);
//				sum += Integer.parseInt(s[4]);
//				sum += Integer.parseInt(s[3]);
//				line = BR.readLine();
//				hm.put(Integer.parseInt(s[0]), sum/3);
//			}
//			return hm;
//		} catch (Exception e) {
//			e.printStackTrace();
//			return null;
//		} finally {
//			if (BR != null)
//				try {
//					BR.close();
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//		}
//	}
//
//	public static int getStudentScore(int id) {
//		BufferedReader BR = null;
//		try {
//			int sum = 0;
//			int count = 0;
//			BR = new BufferedReader(new FileReader("e:/a.txt"));
//			String line = BR.readLine();
//			while (line != null) {
//				String[] s = line.split(",");
//				if (id == Integer.parseInt(s[0])) {
//					sum += Integer.parseInt(s[2]);
//					sum += Integer.parseInt(s[4]);
//					sum += Integer.parseInt(s[3]);
//					break;
//				}
//				count++;
//				line = BR.readLine();
//			}
//			BR.close();
//			return sum / 3;
//		} catch (Exception e) {
//			e.printStackTrace();
//			return 0;
//		} finally {
//			if (BR != null)
//				try {
//					BR.close();
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//		}
//	}
//
//	public static int avgMath() {
//		try {
//			int sum = 0;
//			int count = 0;
//			BufferedReader BR = new BufferedReader(new FileReader("e:/a.txt"));
//			String line = BR.readLine();
//			while (line != null) {
//				String[] s = line.split(",");
//				sum += Integer.parseInt(s[2]);
//				count++;
//				line = BR.readLine();
//			}
//			BR.close();
//			return sum / count;
//		} catch (Exception e) {
//			e.printStackTrace();
//			return 0;
//		}
//	}
/*
 * 文件的数据依次表示为：编号，姓名，语文成绩，数学成绩，英语成绩
 * 中间用逗号隔开
 */
	public static void main(String[] args) {
		
		ways w = new ways();
		w.getLowAll();//查询所有有不及格科目的学生姓名
		w.getHeightAll();//查询所有成绩在90分以上的的学生姓名
		System.out.println("请输入共有几个班级：");
		Scanner scs = new Scanner(System.in);
		int ids = scs.nextInt();
		
		for(int i = 0;i < ids;i++){
			System.out.println("请输入是几班的：");
			Scanner sc = new Scanner(System.in);
			int id = sc.nextInt();
			System.out.println(id+"班的数学平均成绩为："+w.getAvgMathGrade(id));
		}
		
		
		
		//File f = new File("e:/f.txt");
//		int avg = run.avgMath();
//		System.out.println(avg);
//		int avg2 = run.getStudentScore(2);
//		System.out.println(avg2);
		
		
		
		
		
		
		/*
		 * 异常处理：
		 * 		try catch finally throws throw
		 * java集合框架
		 * 				collection :
		 * 							list set hashset
		 * 							map
		 * java 日期字符串
		 * 				data
		 * java流
		 * 			file io stream
		 * 
		 * 
		 * 
		 */
		// try {
		//
		// BufferedReader BR = new BufferedReader(new FileReader("e:/a.txt"));
		// String line = BR.readLine();
		// while (line != null) {
		// System.out.println(line);
		// line = BR.readLine();
		// }
		// BR.close();
		// // BufferedWriter bw = new BufferedWriter(new
		// // FileWriter("e:/a.txt"));
		// // bw.write("hello world");
		// // bw.newLine();
		// // bw.write("hi");
		// // bw.flush();
		// // bw.close();
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		// run t = new run();
		// t.showFile(new File("F:/"));
		//
		// // TODO Auto-generated method stub
		// File file = new File("f:/a");
		// if(!file.exists()){
		// file.mkdirs();
		// }
		//
		// //============================
		// File f = new File("f:/a/a.txt");
		// if(!f.exists()){
		// try{
		// f.createNewFile();
		// }
		// catch(IOException e){
		// e.printStackTrace();
		// }
		// }
		// //================================

	}

}
