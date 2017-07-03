package com.sumson;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Son {

	
	private static final File File = null;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		File file = new File("E:\\eclipse-java-neon-2-win32-x86_64\\sumson\\studentgrade.txt");//查找文件
		File file1 = new File("E:\\eclipse-java-neon-2-win32-x86_64\\sumson\\studentgrade_copy.txt");//创建新的文件
		try {
			//定义一个BufferedReader类
			FileReader fr = new FileReader(file); 
			BufferedReader bf = new BufferedReader(fr);
			//定义一个BufferedWriter类
			FileWriter wr = new FileWriter(file1);
			BufferedWriter bw = new BufferedWriter(wr);
			//逐行遍历bf文件 打印学生信息
			String str = bf.readLine();
			String lName;
			String name;
			//打印各班的数学平均分
			int mgradeAvg;
			
			while(str != null){
			lName = StudentNotSucess(str);
			if(lName != ""){
				bw.write(lName + "不及格");
			}
			name = StudentPerfect(str);
			if(name != null ){
				bw.write(name + "成绩大于90分");
			}
				str = bf.readLine();
			}
			mgradeAvg = getMathAvg(file);
			bw.write("数学平均成绩是" + mgradeAvg );
			bf.close();
			bw.flush();
			bw.close();
			fr.close();
			wr.close();
			mgradeAvg = getMathAvg(File);
			
			
		} catch(FileNotFoundException ex){
			ex.printStackTrace();
			System.out.println("找不到该文件！");
		}catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			System.out.println("文件有错误");
	}

}
	
	public static int getMathAvg(File file) {
		// TODO 自动生成的方法存根
		FileReader fr;
		int sum = 0;
		ArrayList array = new ArrayList();
		try{
			fr  = new FileReader(file);
			BufferedReader sr = new BufferedReader(fr);
			String str = sr.readLine();
			while(str != null){
				String[] list = str.split(",");
				array.add(Integer.parseInt(list[3]));
				str = sr.readLine();
			}
			for(int i = 0;i < array.size();i++){
				sum += (Integer)array.get(i);
			}
		}catch(FileNotFoundException ex){
			ex.printStackTrace();
			
		}catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			
	}
		return sum/array.size();
	}
	//查找成绩在90分以上的同学姓名
     public static String StudentPerfect(String str) {
		// TODO 自动生成的方法存根
    	 String name = "";
    	 String[] list = str.split(",");
    	 for(int i = 2;i < list.length;i++ ){
    		 if(Integer.parseInt(list[1]) > 90){
    			 name = list[1];
    			 
    		 }
    	 }
		return name;
	}
	//查询不及格学生的姓名
	public static String StudentNotSucess(String str) {
		// TODO 自动生成的方法存根
		String name = "";
		String[] list = str.split(",");
		for(int i = 2;i < list.length;i++){
			if(Integer.parseInt(list[i]) < 60){
				name = list[1];
			}
		}
		
		return name;
	}
}
