package newtest;

import java.io.*;

public class ways {

	/*
	 * 目标：查询所有有不及格科目的学生姓名
	 * 
	 */
	public static void getLowAll(){
		BufferedReader br = null;
		try{
			br = new BufferedReader(new FileReader("e:/a.txt"));
			String line = br.readLine();
			while(line != null){
				String [] s = line.split(",");
				if(Integer.parseInt(s[2]) <60 || Integer.parseInt(s[3]) <60 || Integer.parseInt(s[4]) <60){
					System.out.println(s[1]);
				}
				line = br.readLine();
			}
			br.close();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(br != null){
				try{
					br.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
		
	}
	
	/*
	 * 目标：查询所有成绩在90分以上的的学生姓名
	 * 
	 */
	public static void getHeightAll(){
		BufferedReader br = null;
		
		try{
			br = new BufferedReader(new FileReader("e:/a.txt"));
			String line = br.readLine();
			while(line != null){
				String [] s = line.split(",");
				if(Integer.parseInt(s[2]) >90 && Integer.parseInt(s[3]) >90 && Integer.parseInt(s[4]) >90){
					System.out.println(s[1]);
				}
				line = br.readLine();
			}
			br.close();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(br != null){
				try{
					br.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
		
	}

	/*
	 * 目标：查询各班的数学平均分
	 * 
	 */
	public static int getAvgMathGrade(int id){
		BufferedReader br = null;
		try{
			int sum = 0;//数学总成绩
			int count = 0;//一个班的总人数
			br = new BufferedReader(new FileReader("e:/a.txt"));
			String line = br.readLine();
			while(line != null){
				String [] s = line.split(",");
				if(id == Integer.parseInt(s[5]) ){
					sum +=Integer.parseInt(s[3]);
					count++;
				}
				line = br.readLine();
			}
			br.close();
			return sum/count;
		}catch(Exception e){
			e.printStackTrace();
			return 0 ;
		}finally{
			if(br != null){
				try{
					br.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
		
	}
	
	
	public static void addNew(){
		
	}
	
	
}
