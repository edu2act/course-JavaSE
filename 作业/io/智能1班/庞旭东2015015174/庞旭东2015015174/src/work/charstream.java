package work;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class charstream {
	
	public static HashMap<Integer,Integer> getAvgScore(){
		BufferedReader br=null;
		try{
			HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
			int count=0;
			br=new BufferedReader(new FileReader("d:/a.txt"));
			String line=br.readLine();
			 
			while(line!=null){
				int sum=0;
				String [] s=line.split(",");
				sum+=Integer.parseInt(s[2]);
				sum+=Integer.parseInt(s[4]);
				sum+=Integer.parseInt(s[3]);
				line=br.readLine();
				hm.put(Integer.parseInt(s[0]), sum/3);
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
	
	 
	public static int getStudentScore(int id){
		BufferedReader br=null;
		try{
			int sum=0;
			int count=0;
			br=new BufferedReader(new FileReader("d:/a.txt"));
			String line=br.readLine();
			 
			while(line!=null){
				String [] s=line.split(",");
				if(id==Integer.parseInt(s[0])){
					sum+=Integer.parseInt(s[2]);
					sum+=Integer.parseInt(s[4]);
					sum+=Integer.parseInt(s[3]);
					break;
				}
				line=br.readLine();
			}
			return sum/3;
		}catch(Exception e){
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
	
	public static int avgMath(){
		try{
			int sum=0;
			int count=0;
			BufferedReader br=new BufferedReader(new FileReader("d:/a.txt"));
			String line=br.readLine();
			while(line!=null){
				String [] s=line.split(",");
				sum+=Integer.parseInt(s[2]);
				count++;
				line=br.readLine();
			}
			br.close();
			return sum/count;
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}
	}
	
	public static void main(String[] args) {
 
		
		HashMap<Integer, Integer> hm=charstream.getAvgScore();
		Set keys=hm.keySet();
		Iterator i=keys.iterator();
		while(i.hasNext()){
			Integer key=(Integer)i.next();
			Integer value=hm.get(key);
			System.out.println("学号"+key+",平均分："+value);
		}
 
	}
}
