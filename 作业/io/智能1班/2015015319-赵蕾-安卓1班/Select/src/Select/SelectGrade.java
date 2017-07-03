//另外，咱们的作业再明确一下：
//文件结构如下：
//要求以BufferedReader和BufferedWriter类进行文件读写，
//具体实现：查询所有有不及格科目的学生姓名，
//查询所有90分以上学生姓名，
//查询各班数学平均分

package Select;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;  

public class SelectGrade {
	
	public void getMathAverage() {
		BufferedReader br = null;
		try {
			FileReader f = new FileReader("E:/workspace/Select/student.txt");
			br = new BufferedReader(f);
			int  sum = 0;
			String s = br.readLine();
			while (s != null) {
				String []s1 = s.split(",");
				sum += Integer.parseInt(s1[2]);
				s = br.readLine();
			}
			System.out.println("数学平均成绩："+sum/4);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void selectStudent() {
		File f = new File("E:/workspace/Select/student.txt");
		try {
			InputStream is=new FileInputStream(f);
            BufferedReader bf=new BufferedReader(new InputStreamReader(is));
            String s = bf.readLine();
			
			 
            while(s != null) {
            	String[] s1 = s.split(",");
				//输出没有及格的人
				if(Integer.parseInt(s1[2])<60) {
					System.out.println(s1[1]+"数学不及格！");
				} else if(Integer.parseInt(s1[3])<60) {
					System.out.println(s1[1]+"语文不及格！");
				} else if(Integer.parseInt(s1[4])<60) {
					System.out.println(s1[1]+"英语不及格！");
				}
				//输出上90的人
				if(Integer.parseInt(s1[2])>90) {
					System.out.println(s1[1]+"数学90分以上！");
				} else if(Integer.parseInt(s1[3])>90) {
					System.out.println(s1[1]+"语文90分以上！");
				} else if(Integer.parseInt(s1[4])>90) {
					System.out.println(s1[1]+"英语90分以上！");
				}
				
				s = bf.readLine();
            }
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}