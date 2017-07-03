package Select;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;  
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;  

public class SetGrade {
	public void setGrade(){
		try {
			FileWriter fw = new FileWriter("student.txt");
	        BufferedWriter bfw = new BufferedWriter(fw); 
	        //依次是学号，姓名，数学成绩，语文成绩，英语成绩
	        bfw.write("1,张三,80,67,74");
	        bfw.newLine();
	        bfw.write("2,李四,59,67,80");
	        bfw.newLine();
	        bfw.write("3,王勇,68,49,72");
	        bfw.newLine();
	        bfw.write("4,刘萍,80,85,74");
	        bfw.flush();//刷新
	        bfw.close();//关闭流
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
