package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class ScoreUtil {
	/**
	 * 查询不及格的人数
	 * @return
	 */
	public static int downScore(){
			BufferedReader br=null;
			int count=0;
			try{
				br=new BufferedReader(new FileReader("d:/a.txt"));
				String line=br.readLine();
				while(line!=null){
					String[] s=line.split(",");
					if(Integer.parseInt(s[2])<60||Integer.parseInt(s[3])<60||Integer.parseInt(s[4])<60){
						count++;
					}
					line=br.readLine();
				}
				return count;
			}catch(Exception e){
				e.printStackTrace();
				return -1;
			}finally{
				if(br!=null)
					try {
						br.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
			}
		}
	/**
	 * 查询90分以上的人数
	 * @return
	 */
	public static int topScore(){
		BufferedReader br=null; 
		int count=0;
		try{
			br=new BufferedReader(new FileReader("d:/a.txt"));
			String line=br.readLine();
			while(line!=null){
				String[] s=line.split(",");
				if(Integer.parseInt(s[2])>90||Integer.parseInt(s[3])>90||Integer.parseInt(s[4])>90){
					count++;
				}
				line=br.readLine();
			}
			return count;
		}catch(Exception e){
			e.printStackTrace();
			return -1;
		}finally{
			if(br!=null)
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
	
	/**
	 * 查询各班的数学平均分的人数 末位写班级号
	 * @return
	 */
	public static int avgMathClass(int classno){
		BufferedReader br= null;
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		int avg=-1;
		int count=0;
		int sum=0;
		try{
			br=new BufferedReader(new FileReader("d:/a.txt"));
			String line=br.readLine();
			while(line!=null){
			String[] s=line.split(",");
			if(Integer.parseInt(s[5])==classno){
				sum+=Integer.parseInt(s[2]);
				count++;
				}
			line=br.readLine();
			}
			return sum/count;
		}catch(Exception e){
			e.printStackTrace();
			return -1;
		}finally{
			if(br!=null)
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
	
	/**
	 * 计算所有学生的平均成绩
	 * @return
	 */
	public static HashMap<Integer,Integer> avgStudentsScore(){
		BufferedReader br=null;
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		int avg=-1;
		try{
			br=new BufferedReader(new FileReader("d:/a.txt"));
			String line=br.readLine();
			while(line!=null){
				String[] s=line.split(",");
				avg=(Integer.parseInt(s[2])+Integer.parseInt(s[3])+Integer.parseInt(s[4]))/3;
				hm.put(Integer.parseInt(s[0]), avg);
				line=br.readLine();
			}
			return hm;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally{
			if(br!=null)
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
	
	/**
	 * 计算某同学3科平均分
	 * @param id	学生的学号
	 * @return	该生的平均分
	 */
	public static int avgStudentScore(int id){
		BufferedReader br=null;
		int avg=-1;
		try{
			br=new BufferedReader(new FileReader("d:/a.txt"));
			String line=br.readLine();
			while(line!=null){
				String[] s=line.split(",");
				if(id==Integer.parseInt(s[0])){
					avg=(Integer.parseInt(s[2])+Integer.parseInt(s[3])+Integer.parseInt(s[4]))/3;
					break;
				}
				line=br.readLine();
			}
			return avg;
		}catch(Exception e){
			e.printStackTrace();
			return -1;
		}finally{
			if(br!=null)
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
	
	/**
	 * 计算所有学生的数学平均分
	 * @return	平均分
	 */
	public static int avgMathScore(){
		BufferedReader br=null;
		int sum=0;
		int count=0;
		try{
			br=new BufferedReader(new FileReader("d:/a.txt"));
			String line=br.readLine();
			while(line!=null){
				String[] s=line.split(",");
				sum+=Integer.parseInt(s[2]);
				count++;
				line=br.readLine();
			}
			return sum/count;
		}catch(Exception e){
			e.printStackTrace();
			return -1;
		}finally{
			if(br!=null)
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
	
	public static void readFile(){
		try{
			FileReader fr=new FileReader("d:/a.txt");
			BufferedReader br=new BufferedReader(fr);
			String line=br.readLine();
			while(line!=null){
				System.out.println(line);
				line=br.readLine();
			}
			br.close();
			fr.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void writeFile(){
		try{
			BufferedWriter bw=new BufferedWriter(new FileWriter("d:/a.txt"));
			bw.write("helloworld");
			bw.newLine();
			bw.write("hi");
			bw.write("sayhi");
			bw.flush();
			bw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
//		ScoreUtil.writeFile();
//		int avg=ScoreUtil.avgMathScore();
//		System.out.println(avg);
//		System.out.println(ScoreUtil.avgStudentScore(1));
		System.out.println(ScoreUtil.topScore());
		System.out.println(ScoreUtil.avgMathClass(3)); 
//		HashMap<Integer,Integer> hm=ScoreUtil.avgStudentsScore();
//		Set<Integer> set=hm.keySet();
//		Iterator i=set.iterator();
//		while(i.hasNext()){
//			Integer key=(Integer)i.next();
//			Integer value=hm.get(key);
//			System.out.println("学号"+key+"平均分是"+value);
//		}
	}

}
