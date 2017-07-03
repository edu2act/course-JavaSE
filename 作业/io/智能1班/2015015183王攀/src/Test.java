

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test {
	/*
	 * 计算每个学生的平均成绩,将成绩存入哈希表；
	 * @param id 学生学号
	 * @return 学生平均成绩的哈希表
	 * */
	
	public  static HashMap<Integer,Integer> GetAvgscore() throws IOException{
		BufferedReader br=null;
		try {
			HashMap<Integer,Integer> avgScore=new HashMap<Integer,Integer>();
			
			br=new BufferedReader(new FileReader("d:/Java/java/2015015183王攀/src/a.txt"));
			String list=br.readLine();
			while(list!=null) {
				int sum=0;
				String[] s = list.split(",");
				sum+=Integer.parseInt(s[2]);
				sum+=Integer.parseInt(s[3]);
				sum+=Integer.parseInt(s[4]);
				list = br.readLine();
				avgScore.put(Integer.parseInt(s[0]), sum/3);
			}
			
			return avgScore;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} finally{
			if(br!=null)
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

		
	}
	/*
	 * 计算某个学生id，求出平均成绩
	 * @param id 学号
	 * @return id学生的平均成绩
	 */
	public static int getavgStudent(int id) {
		BufferedReader br =null;
		try {
			int sum=0;
			br=new BufferedReader (new FileReader("d:/Java/java/2015015183王攀/src/a.txt"));
			String line=br.readLine();
			while(line!=null) {
				String[] s=line.split(",");
				if(id==Integer.parseInt(s[0])) {
					sum+=Integer.parseInt(s[2]);
					sum+=Integer.parseInt(s[3]);
					sum+=Integer.parseInt(s[4]);
					break;
				}
				line=br.readLine();
			}
			return sum/3;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}finally{
			if(br!=null)
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
	}
	
	/*
	 * 计算数学学科的平均分
	 * @return 平均分
	 */
	public static int GetAvgMath() {
		
		try {
			BufferedReader br=new BufferedReader(new FileReader("d:/Java/java/2015015183王攀/src/a.txt"));
			int sum=0;
			int count=0;
			String list=br.readLine();
			while(list!=null) {
				String[] s=list.split(",");
				sum+=Integer.parseInt(s[2]);
				count++;
				list=br.readLine();
			}
			br.close();
			return sum/count;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		
		
	}
	/*
	 * 计算英语学科的平均分
	 * @return 平均分
	 */
	public static int GetAvgEeglish() {
		
		try {
			BufferedReader br=new BufferedReader(new FileReader("d:/Java/java/2015015183王攀/src/a.txt"));
			int sum=0;
			int count=0;
			String list=br.readLine();
			while(list!=null) {
				String[] s=list.split(",");
				sum+=Integer.parseInt(s[4]);
				count++;
				list=br.readLine();
			}
			br.close();
			return sum/count;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		
		
	}
	/*
	 * 计算语文学科的平均分
	 * @return 平均分
	 */
	public static int GetAvgVerbal() {
		
		try {
			BufferedReader br=new BufferedReader(new FileReader("d:/Java/java/2015015183王攀/src/a.txt"));
			int sum=0;
			int count=0;
			String list=br.readLine();
			while(list!=null) {
				String[] s=list.split(",");
				sum+=Integer.parseInt(s[3]);
				count++;
				list=br.readLine();
			}
			br.close();
			return sum/count;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		
		
	}
	/*
	 * 求出班级数学学科的平均分
	 * @param d 班级号
	 * @return 班级数学平均分；
	 */
	public static int getAvgMathScore(int id) throws IOException {
		try {
			BufferedReader br=new BufferedReader(new FileReader("d:/Java/java/2015015183王攀/src/a.txt"));
			int sum=0;
			int count=0; 
			String line=br.readLine();
			while(line!=null) {
				String[] s=line.split(",");
				if(Integer.parseInt(s[5])==id) {
					sum+=Integer.parseInt(s[2]);
					count++;
				}
				line=br.readLine();
			}
			br.close();
			return sum/count;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	public static void FullStudent() throws IOException {
		try {
			BufferedWriter bw=new BufferedWriter(new FileWriter("d:/Java/java/2015015183王攀/src/a.txt"));
			bw.write("01,zhaoyun,92,95,60,02");
			bw.newLine();
			bw.write("02,zhangfei,85,10,59,02");
			bw.newLine();
			bw.write("03,liubei,69,20,80,39");
			bw.flush();
			bw.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		try {
			FullStudent();
			//输出各学科的平均成绩；
			System.out.println("英语:"+GetAvgEeglish());
			System.out.println("数学:"+GetAvgMath());
			System.out.println("语文:"+GetAvgVerbal());
			//输出二班的班级数学平均分；
			System.out.println("班级数学平均分："+getAvgMathScore(2));
			//输出各个学生的平均成绩；
			HashMap<Integer,Integer> hm=Test.GetAvgscore();
			Set<Integer> keys=hm.keySet();
			Iterator<Integer> i= keys.iterator();
			while(i.hasNext()) {
				Integer key=i.next();
				Integer value=hm.get(key);
				System.out.println("学号："+key+"平均成绩："+value);
			}
			//输出学号为03的学生的成绩；
			System.out.println("学号02平均成绩："+Test.getavgStudent(3));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

