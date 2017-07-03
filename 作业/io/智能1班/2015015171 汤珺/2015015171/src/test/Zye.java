package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Zye {
		public static HashMap<Integer,Integer> getAvgScore(){
			BufferedReader b=null;
			try{
				HashMap<Integer,Integer> c=new HashMap<Integer,Integer>();
				int count=0;
				b= new BufferedReader(new FileReader("F:/a.txt"));
				String line=b.readLine();
				while(line!=null){
					int sum=0;
					String[] s=line.split(",");
					sum+=Integer.parseInt(s[2]);
					sum+=Integer.parseInt(s[3]);
					sum+=Integer.parseInt(s[4]);
					count++;
					line=b.readLine();
					c.put(Integer.parseInt(s[0]), sum/3);
				}
				return c;
			}catch(Exception e){
				e.printStackTrace();
				return null;
			}finally{
				if(b!=null){
					try{
						b.close();
					}catch(IOException e){
						e.printStackTrace();
					}
				}
			}
		}
		public static String noPass(){
			BufferedReader b = null;
			try{
				String n = null;
				b= new BufferedReader(new FileReader("F:/a.txt"));
				String line=b.readLine();
				while(line!=null){
					String[] s=line.split(",");
					int []m={0,0,0};
					m[0]=Integer.parseInt(s[2]);
					m[1]=Integer.parseInt(s[3]);
				    m[2]=Integer.parseInt(s[4]);
				    
					for(int i=0;i<m.length;i++){
						if(m[i]<60){
							n=s[1];
						}
					}
					
					line=b.readLine();
				}
				return n;
				
			}catch(Exception e){
				e.printStackTrace();
				return null;
			}finally{
				if(b!=null){
					try{
						b.close();
					}catch(IOException e){
						e.printStackTrace();
					}
				}
			}
		}
		public static void classAvg(){
			BufferedReader b=null;
			int count=0;
			int sum=0;
			try{
			b= new BufferedReader(new FileReader("F:/a.txt"));
			String line=b.readLine();
			while(line!=null){
				String[] s=line.split(",");
				sum+=Integer.parseInt(s[3]);
				count++;
				line=b.readLine();
			}
			System.out.println(sum/count);
			b.close();
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("错误");
		}finally{
			if(b!=null){
				try{
					b.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}

		}
		public static String goodJob(){
			BufferedReader b = null;
			try{
				String n = null;
				b= new BufferedReader(new FileReader("F:/a.txt"));
				String line=b.readLine();
				while(line!=null){
					String[] s=line.split(",");
					int []m={0,0,0};
					m[0]=Integer.parseInt(s[2]);
					m[1]=Integer.parseInt(s[3]);
				    m[2]=Integer.parseInt(s[4]);
				    int sum=0;
					for(int i=0;i<m.length;i++){
						sum+=m[i];
					}
					if(sum/3>90){
						n=s[1];
						
					}
					line=b.readLine();
					
				}
				return n;
			}catch(Exception e){
				e.printStackTrace();
				return null;
			}finally{
				if(b!=null){
					try{
						b.close();
					}catch(IOException e){
						e.printStackTrace();
					}
				}
			}
		}
		
		public static void main(String[] args) {
			HashMap<Integer,Integer> a=Zye.getAvgScore();
			Set key=a.keySet();
			Iterator i=key.iterator();
			while(i.hasNext()){
				Integer keys=(Integer)i.next();
				Integer value=a.get(keys);
				System.out.println("学号"+keys+",平均分："+value);
			}
			String bn=Zye.noPass();
			System.out.println("有科目分数少于60的是"+bn);
			String cn=Zye.goodJob();
			System.out.println("平均分大于90的是"+cn);
			Zye.classAvg();
			

			}
		}
	
