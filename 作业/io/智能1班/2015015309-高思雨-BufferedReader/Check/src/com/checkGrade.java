package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class checkGrade {
	//查找有不及格的学生姓名
	public static String getFailStudent(){
		BufferedReader br=null;
		try{
			br=new BufferedReader(new FileReader("d:/a/a.txt"));
			String line=br.readLine();
			while(line!=null){
				String []s=line.split(",");
				if(Integer.parseInt(s[2])<60 || Integer.parseInt(s[3])<60 ||Integer.parseInt(s[4])<60){
					return s[1];
				}
				line=br.readLine();
			}
		}catch(Exception e){
			e.printStackTrace();
			return "";
		}finally{
			if(br!=null){
				try{
					br.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
		return null;
	}
	//查询所有90分以上学生姓名
	public static String getGoodStudent(){
		BufferedReader br=null;
		try{
			br=new BufferedReader(new FileReader("d:/a/a.txt"));
			String line=br.readLine();
			while(line!=null){
				String []s=line.split(",");
				if(Integer.parseInt(s[2])>=90 && Integer.parseInt(s[3])>=90 && Integer.parseInt(s[4])>=90){
					return s[1];
				}
				line=br.readLine();
			}
		}catch(Exception e){
			e.printStackTrace();
			return "";
		}finally{
			if(br!=null){
				try{
					br.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
		return null;
	}
	//查询各班数学平均分
	public static int getMathAvg(){
		int sum=0;
		int count=0;
		BufferedReader br=null;
		try{
			br=new BufferedReader(new FileReader("d:/a/a.txt"));
			String line=br.readLine();
			while(line!=null){
				String []s=line.split(",");
				sum+=Integer.parseInt(s[2]);
				count++;
				line=br.readLine();
			}
			return sum/count;
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}finally{
			if(br!=null){
				try{
					br.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		String a1=checkGrade.getFailStudent();
		System.out.println(a1);
		
		String a2=checkGrade.getGoodStudent();
		System.out.println(a2);
		
		int a3=checkGrade.getMathAvg();
		System.out.println(a3);
		
		
		
	}
}
