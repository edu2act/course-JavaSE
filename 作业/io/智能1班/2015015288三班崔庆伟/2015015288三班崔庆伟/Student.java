package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Student {
	// 有不及格的学生的姓名
		public static  String bujige(){
		BufferedReader br=null;
		try{
			
			int count=0;
			br=new BufferedReader(new FileReader("d:/a.txt"));
			String line=br.readLine();
			while(line!=null){
				int sum=0;
				String [] s=line.split(",");
				for(int i=1;i<s.length;i++){
					int j=Integer.parseInt(s[i]);
					String r=s[0];
					if(j<60){
						return r ;
							
					}
					break;
					
				}
				 
				line=br.readLine();
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(br!=null)
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		return null;
	}
		
	// 数学平均分
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
//		所有90分以上的学生姓名
		public static  String youxiu(){
			BufferedReader br=null;
			try{
				int count=0;
				br=new BufferedReader(new FileReader("d:/a.txt"));
				String line=br.readLine();
				while(line!=null){
					int sum=0;
					String [] s=line.split(",");
					for(int i=1;i<s.length;i++){
						int j=Integer.parseInt(s[i]);
						if(j<90){
							break;	
						}
						String r=s[0];
						return r;
					}
					line=br.readLine();
					
				}
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				if(br!=null)
					try {
						br.close();
					} catch (IOException e) {
						e.printStackTrace();
						}		
			}
			return null;
		}
}
