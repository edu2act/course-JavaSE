package student;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Arrays;

public class Student {


	/**
	 * 
	 * @param bw Buffer Writer 文件名
	 * @param classno 班级
	 * @param name 姓名
	 * @param math 数学成绩
	 * @param eng 英语成绩
	 * @throws IOException
	 */
	public static void instu(BufferedWriter bw,String classno , String name,String math,
			String eng) throws IOException {
		bw.write(classno);
		bw.write(",");
		bw.write(name);
		bw.write(",");
		bw.write(math);
		bw.write(",");
		bw.write(eng);
		bw.newLine();
	}
	
	/**
	 * 
	 * @param br 访问的问件
	 * @throws IOException
	 */
	public static void outstu(BufferedReader br) throws IOException {
		String outline=br.readLine();
		while(outline!=null){
			String [] s=outline.split(",");
			System.out.println(Arrays.toString(s));
			outline=br.readLine();
		}
	}
	
	/**
	 * 
	 * @param br 访问的问件
	 * @throws IOException
	 */
	public static void failstu(BufferedReader br) throws IOException {
		String failline=br.readLine();
		while(failline!=null){
			String[] s=failline.split(",");			
			for(int i = 2; i < s.length;i ++) {
				int j = Integer.parseInt(s[i]);
				if(j < 60) {				
					System.out.println(s[1]);
					break;
				}
			}
			
			failline=br.readLine();
		}
	}
	
	/**
	 * 
	 * @param br 访问的问件
	 * @throws IOException
	 */
	public static void goodstu(BufferedReader br) throws IOException {
		String goodline = br.readLine();
		while(goodline != null) {
			String[] goods = goodline.split(",");
			for(int i = 2; i < goods.length; i ++) {
				if( Integer.parseInt(goods[i]) >= 90) {
					System.out.println(goods[1]);
					break;
				}
			}
			
			goodline = br.readLine();
		}
	}
	
	
	
/**
 * 	
 * @param i班级
 * @param brr 文件
 * @throws IOException
 */
	public static void mathavg(int i, BufferedReader brr) throws IOException {
		String mathline = brr.readLine();
		int sum = 0;
		int count= 0;
		while(mathline != null) {
			String[] maths = mathline.split(",");
			if( Integer.parseInt(maths[0]) == i ) {
				sum += Integer.parseInt(maths[2]);
				count ++;
			}
			mathline = brr.readLine();
		}
		try{
			int avg = sum/count;
			System.out.println( i + "班数学 平均分为：" + avg);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	
	
	
	
}
	
