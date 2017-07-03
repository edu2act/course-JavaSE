package files;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;


public class Count {
	public static int tCount;
	
	public static int count(File a) throws IOException{
		BufferedReader f = null;
		try {
			f=new BufferedReader(new FileReader(a));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		int count=0;
		String s=f.readLine();
		while(s!=null){
			for(char c:s.toCharArray()){
				if(c>='0'&&c<='9')	count++;
			}
		}
		return count;
	}
	
	public static void open(String path) throws IOException{
		File a=new File(path);
		String[] b;
		
		if(a.isDirectory()){
			b=a.list();
			for(String c:b){
				open(c);
			}
		}else if(a.isFile()){
			String[] name=a.getName().split(".");
			if(name[1].equals("java"))
				tCount+=Count.count(a);
		}
		
		
		
	}
	
	
	public static void main(String... args){
		Integer a=100;
		Scanner b=new Scanner(System.in);
		try{
			open(b.nextLine());
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("整个项目中的数字总数为："+tCount);
	}
}
