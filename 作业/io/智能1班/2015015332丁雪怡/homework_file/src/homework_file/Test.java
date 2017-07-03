package homework_file;

import java.io.*;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		//初始化文档并存入信息
		File f=new File("C:\\Users\\雪怡\\Desktop\\学习\\大二下\\java\\studentfile\\成绩表.txt");
		try {
			FileWriter fw = new FileWriter("C:\\Users\\雪怡\\Desktop\\学习\\大二下\\java\\studentfile\\成绩表.txt");
			BufferedWriter bufw = new BufferedWriter(fw);
			bufw.write("1,一班,赵一,80,63,59");  
	        bufw.newLine();           
	        bufw.write("2,二班,钱二,81,92,52"); 
	        bufw.newLine(); 
	        bufw.write("3,三班,孙三,76,57,89"); 
	        bufw.newLine(); 
	        bufw.write("4,四班,李四,85,90,99");
	        bufw.flush();  
	        bufw.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("出错了");
		}
		
		
		
		//读取信息
		 try {
        //查询所有不及格科目和学生姓名
		InputStream studentFile1 = new FileInputStream(f);
		BufferedReader bf1 = new BufferedReader(new InputStreamReader(studentFile1));
		String strFile1 = bf1.readLine(); 
        System.out.print("不及格的人有：");
        while(strFile1!=null) {
			String[] str= strFile1.split(",");
				for(int i=3;i<6;i++){
					if(Integer.parseInt(str[i])<60){
						System.out.print(str[2]+'、');
						break;
					}
				}
				strFile1 = bf1.readLine();
			}
        
         
        //查询所有90分以上学生姓名
        System.out.print("90分以上的人有：");
        System.out.println(' ');
        InputStream studentFile2 = new FileInputStream(f);
		BufferedReader bf2 = new BufferedReader(new InputStreamReader(studentFile2));
        String strFile2 = bf2.readLine();
        double num=0;
        double j=0;
        while(strFile2!=null) {
			String[] str= strFile2.split(",");
			num+=Integer.parseInt(str[3]);
				for(int i=3;i<6;i++){
					if(Integer.parseInt(str[i])>90){
						System.out.print(str[2]+'、');
						break;
					}
				}
				strFile2 = bf2.readLine();
				j++;
			}
        System.out.println(' ');
        
       
        //计算数学平均成绩
        System.out.println("数学平均成绩为："+(num/j));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
