package easy_test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class easy_test {

		 public static void createNewFile(){
			 try{
				 BufferedWriter file = new BufferedWriter(new FileWriter("d://成绩表.txt"));
				 file.write("1,张飞,30");
				 file.newLine();
				 file.write("2,张二,40");
				 file.newLine();
				 file.write("3,张十方,99");
				 file.flush();
				 file.close();
			 }catch(Exception e){
				 e.printStackTrace();
			 }
		 }
		 
		 public static void read(){
			 try{
				 FileReader fr=new FileReader("d://成绩表.txt");  
			     BufferedReader br=new BufferedReader(fr);
			     String str = br.readLine();
			     int sum=0;
			     int count=0;
			     while (str != null) {
			    		String[] s=str.split(",");
			    		if(Integer.parseInt(s[2])<60){
			    			System.out.println("不及格的是："+s[1]);
			    		}
			    		if(Integer.parseInt(s[2])>90){
			    			System.out.println("90以上的是："+s[1]);
			    		}
			    		count+=1;
			    		sum+=Integer.parseInt(s[2]);
			    		str = br.readLine();
			    	}
			     System.out.println(sum/count);
			 }catch(Exception e){
				 e.printStackTrace();
			 }
		}
		 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		createNewFile();
		read();
	}

}
