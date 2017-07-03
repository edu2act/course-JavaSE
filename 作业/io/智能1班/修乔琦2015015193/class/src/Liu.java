import java.io.*;
import java.lang.*;
import java.util.*;
public class Liu {

	public static void main(String[] args) {
		  try {  
	            File file = new File("E:/project/a.txt");  
                BufferedReader br;    
	            br=new BufferedReader(new FileReader(file));
	            String line;
	            int sum1=0;
	            int sum2=0;
	            int n1=0;
	            int n2=0;
	            while ((line=br.readLine()) != null) { 
	            	String s[]=line.split(",");
	            	int s0=Integer.parseInt(s[0]);
	            	int s1=Integer.parseInt(s[2]);
	            	int s2=Integer.parseInt(s[3]);
	            	int s3=Integer.parseInt(s[4]);
	            	if(s1<60||s2<60||s3<60)
	            	{System.out.println(s[1]+"同学不及格");}
	            	//输出不及格同学姓名
	            	if(s1>90&&s2>90&&s3>90)
	            	{System.out.println(s[1]+"同学成绩十分优异");}
	            	//输出所有科目都在90以上同学姓名
	            	if(s0==1){
	            		sum1=sum1+s1;
	            		n1=n1+1;
	            	}
	            	if(s0==2){
	            		sum2=sum2+s1;
	            		n2=n2+1;
	            	}
	            }
	            System.out.println("一班数学平均分为"+sum1/n1);
	            System.out.println("二班数学平均分为"+sum2/n2);
	            br.close();  
	        } catch (FileNotFoundException ex) {  
	            ex.printStackTrace();  
	        } catch (IOException ex) {  
	            ex.printStackTrace();  
	        }  
	}
}
		
		