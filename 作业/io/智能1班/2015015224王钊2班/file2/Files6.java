/**
 * 姓名：王钊
 * 学号：2015015224
 * 班级：2班
 * 日期：2017/5/1
 */


package file2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Files6{
	
	


	public static void main(String[] args) {
		
		
		
		File file=new File("f:/a");
		if(!file.exists()){
			file.mkdirs();
		}
		File f=new File("f:/a/a.txt");
		f.delete();
		try{

			f.createNewFile();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		try{
			
			
			BufferedWriter bw=new BufferedWriter(new FileWriter("f:/a/a.txt"));
			bw.write("1,zhangsan,100,95,100,1 ");
			bw.newLine();
			bw.write("2,zhangcheng,100,95,100,1 ");
			bw.newLine();
			bw.write("3,zhangai,100,90,80,1 ");
			bw.newLine();
			bw.write("4,lisi,60,90,80,2");
			bw.newLine();
			bw.write("5,lizhi,60,90,100,2");
			bw.newLine();
			bw.write("6,limeng,60,90,50,2");
			bw.newLine();
			bw.write("7,wangwu,60,80,90,3");
			bw.newLine();
			bw.write("8,wangliu,60,50,90,3");
			bw.newLine();
			bw.write("9,wangqiang,60,90,90,3");
			bw.newLine();
			bw.write("10,qianyi,60,55,90,4");
			bw.newLine();
			bw.write("11,qianying,60,40,90,4");
			bw.newLine();
			bw.write("12,qianyu,80,10,90,4");
			bw.flush();
			bw.close();
			
			BufferedReader br=new BufferedReader(new FileReader("f:/a/a.txt"));
			String line=br.readLine();
			int sum=0;
			int count1=0;
			while(line!=null){
				int count=0;
				
				String [] s=line.split(",");
				for(int i=2;i<5;i++){
					if(Integer.parseInt(s[i])<60){
						System.out.println("有不及格科目的学生姓名为："+s[1]);
						
						break;
					}
				}
				for(int i=2;i<5;i++){
					if(Integer.parseInt(s[i])>90){
						
						
						count=count+1;
					}
					
					
				}
				if(count==3){
					System.out.println("所有90分以上学生姓名为:"+s[1]);
				}
				
				
				
				sum+=Integer.parseInt(s[3]);
				count1++;
				while(count1==3){
					System.out.println(s[5]+"班数学平均分为"+sum/3);
					sum=0;
					count1=0;
				}
				line=br.readLine();
				
				
				
			}
			
			
			br.close();
			
			
		}catch(Exception e){
		e.printStackTrace();
		}
	}

	

}
