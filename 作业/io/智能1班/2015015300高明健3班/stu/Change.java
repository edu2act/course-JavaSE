package stu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

/**
 * 按学号更改数据
 * @参数 number String(学号),a String类型（学号，姓名，班级，数学，语文，英语）
 * @author 高明健
 * @return void
 */

public class Change {
	public void changeStu(String number,String a) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(new FileReader("D://a.txt"));
			String str = br.readLine();
			LinkedList arr = new LinkedList();
			while (str != null) {
				String id[]=str.split(",");
				if(id[0].equals(number))
				{
					str = br.readLine();
					addstu add=new addstu();
					add.addStu(a);
					continue;
				}
				arr.add(str);
				str = br.readLine();
			}
			bw = new BufferedWriter(new FileWriter("D://a.txt"));
			for (Object i : arr) {
				bw.write((String) i);
				bw.newLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
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