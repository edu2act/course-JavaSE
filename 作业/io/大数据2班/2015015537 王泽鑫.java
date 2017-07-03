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

public class File {
	public static void readFile(){
		try {
			FileReader fr = new FileReader("e://io.txt");
			BufferedReader br = new BufferedReader(new FileReader("e://io.txt"));
			String line = br.readLine();
			while(line!=null){
				System.out.println(line);
				line = br.readLine();
			}
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
	}
	
	public static void avgMathScore(){
		BufferedReader br = null;
		int count1 = 0;
		int count2 = 0;
		int mathscore1 = 0;
		int mathscore2 = 0;
		try {
			br = new BufferedReader(new FileReader("e:/io.txt"));
			String line = br.readLine();
			while(line!=null){
				String[] s = line.split(",");
				if(Integer.parseInt(s[0])==1){
					mathscore1 += Integer.parseInt(s[4]);
					count1+=1;
					line = br.readLine();
					continue;
				}else if(Integer.parseInt(s[0])==2){
					mathscore2 += Integer.parseInt(s[4]);
					count2+=1;
					line = br.readLine();
					continue;
				}						
			}
			System.out.println("1班数学平均成绩："+mathscore1/count1);
			System.out.println("2班数学平均成绩："+mathscore2/count2);
		} catch (IOException e) {
			e.printStackTrace();
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
	
	public static HashMap<Integer, Integer> avgStudentIdScore(){
		BufferedReader br = null;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		try {
			br = new BufferedReader(new FileReader("e:/io.txt"));
			String line = br.readLine();
			while(line!=null){
				String[] s = line.split(",");
				int avg = (Integer.parseInt(s[2])+Integer.parseInt(s[3])+Integer.parseInt(s[4]))/3;
				hm.put(Integer.parseInt(s[0]), avg);
				line = br.readLine();
			}
			return hm;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}finally{
			if(br!=null){
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void failedScore(){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("e:/io.txt"));
			String line = br.readLine();
			while(line!=null){
				String[] s = line.split(",");
				if(Integer.parseInt(s[2])<60||Integer.parseInt(s[3])<60||Integer.parseInt(s[4])<60){
					System.out.println("不及格学生的姓名："+s[1]);
				}
				line = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(br!=null){
				try{
					br.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
	}
	
	public static HashMap<String, Integer> goodScore(){
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("e:/io.txt"));
			String line = br.readLine();
			while(line!=null){
				String[] s = line.split(",");
				if(Integer.parseInt(s[3])>=90){
					hm.put(s[2], Integer.parseInt(s[3]));
				}
				if(Integer.parseInt(s[4])>=90){
					hm.put(s[2], Integer.parseInt(s[3]));
				}
				if(Integer.parseInt(s[5])>=90){
					hm.put(s[2], Integer.parseInt(s[3]));
				}
				line = br.readLine();
			}
			return hm;
		}catch(IOException e){
			e.printStackTrace();
			return null;
		}finally{
			if(br!=null){
				try{
					br.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}	
	}
	
	public static void writeFile(){
		try{
			BufferedWriter bw = new BufferedWriter(new FileWriter("e:/io.txt"));
			char[] cbuf ={'1','5','2','8','8','9'};
			bw.write(cbuf);
			bw.flush();
			bw.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) {
		//File.readFile();
		
		//File.avgMathScore();
		
		/*HashMap<Integer,Integer> hm = File.avgStudentIdScore();
		Set<Integer> set = hm.keySet();
		Iterator i = set.iterator();
		while(i.hasNext()){
			Integer key = (Integer) i.next();
			Integer value = hm.get(key);
			System.out.println("学号："+key+",的平均分："+value);
		}*/
		
		//File.failedScore();
		
		/*HashMap<String, Integer> hm = File.goodScore();
		Set<String> set = hm.keySet();
		Iterator i = set.iterator();
		while(i.hasNext()){
			String key = (String) i.next();
			Integer value = hm.get(key);
			System.out.println(key+","+value);
		}*/
		
		
	}
}

