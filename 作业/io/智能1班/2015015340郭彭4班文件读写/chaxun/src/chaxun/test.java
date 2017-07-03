package chaxun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class test {
	public static void createData(){
		File dir =new File("D://2015015340//");
		boolean r= false;
		if(!dir.exists()){
			r=dir.mkdir();
			if(r){
				System.out.println("目录创建成功！");
			}
		}
		File f= new File("D://2015015340//grade.txt");
		if(!f.exists()){
			r=false;
			try{
				r=f.createNewFile();	
			}catch(IOException e){
				e.printStackTrace();
			}
			if(r){
				System.out.println("文件创建成功！");
			}
		}
		try{
		BufferedWriter bw =new BufferedWriter(new
				FileWriter("D://2015015340//grade.txt"));
				bw.write("1,zhangsan,100,90,80");
				bw.newLine();
				bw.write("2,lisi,90,80,70");
				bw.newLine();
				bw.write("3,wangwu,80,58,70");
				bw.newLine();
				bw.write("4,liuliu,55,80,38");
				bw.flush();
				bw.close();
				System.out.println("数据写入成功！");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static int avgMath(){
		try{
			int sum=0;
			int count=0;
			BufferedReader br=new BufferedReader(new FileReader("D://2015015340//grade.txt"));
			String line=br.readLine();
			while(line!=null){
				String [] s=line.split(",");
				sum+=Integer.parseInt(s[3]);
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
	public static void failed(){
		BufferedReader br=null;
		try{
			br=new BufferedReader(new FileReader("D://2015015340//grade.txt"));
			String line=br.readLine();
			ArrayList <String> yuwen = new ArrayList<String>();
			yuwen.add("语文不及格的有:");
			ArrayList <String> shuxue = new ArrayList<String>();
			shuxue.add("数学不及格的有:");
			ArrayList <String> yingyu = new ArrayList<String>();
			yingyu.add("英语不及格的有:");
			while(line!=null){
				String [] s=line.split(",");
				if(Integer.parseInt(s[2])<60){
					yuwen.add(s[1]);
				}
				if(Integer.parseInt(s[3])<60){
					shuxue.add(s[1]);
				}
				if(Integer.parseInt(s[4])<60){
					yingyu.add(s[1]);
				}
				line=br.readLine();
				
			}
			for(int i=0;i<yuwen.size();i++){
				System.out.print(yuwen.get(i));
			}
			System.out.println();
			for(int i=0;i<shuxue.size();i++){
				System.out.print(shuxue.get(i));
			}
			System.out.println();
			for(int i=0;i<yingyu.size();i++){
				System.out.print(yingyu.get(i));
			}
			System.out.println();
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
	}
	public static void select90(){
		BufferedReader br=null;
		try{
			br=new BufferedReader(new FileReader("D://2015015340//grade.txt"));
			String line=br.readLine();
			ArrayList <String> yuwen90 = new ArrayList<String>();
			yuwen90.add("语文90+(含90)的有:");
			ArrayList <String> shuxue90 = new ArrayList<String>();
			shuxue90.add("数学90+的有:");
			ArrayList <String> yingyu90 = new ArrayList<String>();
			yingyu90.add("英语90+的有:");
			while(line!=null){
				String [] s=line.split(",");
				if(Integer.parseInt(s[2])>=90){
					yuwen90.add(s[1]);
				}
				if(Integer.parseInt(s[3])>=90){
					shuxue90.add(s[1]);
				}
				if(Integer.parseInt(s[4])>=90){
					yingyu90.add(s[1]);
				}
				line=br.readLine();
				
			}
			for(int i=0;i<yuwen90.size();i++){
				System.out.print(yuwen90.get(i));
			}
			System.out.println();
			for(int i=0;i<shuxue90.size();i++){
				System.out.print(shuxue90.get(i));
			}
			System.out.println();
			for(int i=0;i<yingyu90.size();i++){
				System.out.print(yingyu90.get(i));
			}
			System.out.println();
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
	}
	public static void main(String[] args) {
		createData();
		failed();
		select90();
		System.out.println("数学平均分"+avgMath());
	}

}
