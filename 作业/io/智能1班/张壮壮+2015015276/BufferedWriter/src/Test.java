import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test {
	
	
	
	public static HashMap<Integer,Integer> getAvgScore(){
		BufferedReader br = null;
		try{
			int count = 0;
			HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
			br = new BufferedReader(new FileReader("d:/a.txt"));
			String line = br.readLine();
			//通过循环，找到该学生
			while(line!=null){
				int sum = 0;
					String []s = line.split(",");
					sum +=Integer.parseInt(s[2]);
					sum +=Integer.parseInt(s[3]);
					sum +=Integer.parseInt(s[4]);
				line = br.readLine();
				hm.put(Integer.parseInt(s[0]),sum/3);
				
			}
			return hm;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally{
			if(br!=null)
				try{
					br.close();
				}catch(Exception e){
					e.printStackTrace();
					}
		}
	}
	
	
	
	
	
	
	
	
	
	
	//计算学生的3个科目平均分
	public static int getStudentScore(int id){
		BufferedReader br = null;
		try{
			int count = 0;
			int sum = 0;
			br = new BufferedReader(new FileReader("d:/a.txt"));
			String line = br.readLine();
			//通过循环，找到该学生
			while(line!=null){
					String []s = line.split(",");
					if(id == Integer.parseInt(s[0])){
						sum +=Integer.parseInt(s[2]);
						sum +=Integer.parseInt(s[3]);
						sum +=Integer.parseInt(s[4]);
					}
				line = br.readLine();
			}
			return sum/3;
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}finally{
			if(br!=null)
				try{
					br.close();
				}catch(Exception e){
					e.printStackTrace();
					}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	public static int avgMath(){
		try{
			int sum = 0;
			int count = 0;
			BufferedReader br = new BufferedReader(new FileReader("d:/a.txt"));
			String line = br.readLine();
			while(line!=null){
				String []s = line.split(",");
				sum +=Integer.parseInt(s[2]);
//				把string类型转换为int型
				count++;
				line = br.readLine();
			}
			br.close();
			return sum/count;
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}
	}
	public static void main(String []args){

		//		int avg = Test.avgMath();
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int avg1 = Test.getStudentScore(2);
//		System.out.println(avg1);
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		HashMap<Integer,Integer> hm = Test.getAvgScore();
//		Set keys = hm.keySet();
//		Iterator i = keys.iterator();
//		while(i.hasNext()){
//			Integer key = (Integer)i.next();
//			Integer value = hm.get(key);
//			System.out.println("xueaho"+key+",pingjunfen");
//		}
//		try{
//			BufferedReader br = new BufferedReader(new FileReader("d:/a.txt"));
//			String line = br.readLine();
//			while(line!=null){
//				System.out.println(line);
//				line = br.readLine();
//			}
//			br.close();
////			BufferedWriter bw = new BufferedWriter(new FileWriter("d:/a.txt")); 
////			bw.write("hello");
////			bw.newLine();
////			bw.write("hi");
////			bw.write("zhangsan");
////			bw.flush();
////			bw.close();
//		}
//		catch(Exception e){
//			e.printStackTrace();
//		}
	}
}
