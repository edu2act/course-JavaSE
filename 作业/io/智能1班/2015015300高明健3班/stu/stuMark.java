package stu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import animal.frog;
/**
 * 打印不及格和90分以上学生信息
 * @author 高明健
 * @return void
 */
public class stuMark {

	public  void StuMark() {
		BufferedReader br=null ;
		BufferedWriter bw =null;
		DeletStu num = new DeletStu();
		try {
			num.deletStu("004");
			br = new BufferedReader(new FileReader("D://a.txt"));
			bw = new BufferedWriter(new FileWriter("D://帐户信息-copy.txt"));
			String str = br.readLine();
			while (str != null) {				
				String arr[]=str.split(",");
				if(Integer.parseInt(arr[3])<60||Integer.parseInt(arr[4])<60||Integer.parseInt(arr[5])<60)
					System.out.println("有不及格科目：学号："+arr[0]);
				if(Integer.parseInt(arr[3])>=90||Integer.parseInt(arr[4])>=90||Integer.parseInt(arr[5])>=90)
					System.out.println("有90分以上科目：学号："+arr[0]);
				int temp=0;
				temp+=Integer.parseInt(arr[3]);
				str = br.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				bw.flush();
				bw.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}


	}

}
