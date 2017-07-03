package stu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
/**
 * 添加新数据
 * @参数 a String类型（学号，姓名，班级，数学，语文，英语）
 * @author 高明健
 * @return void
 */
public class addstu {
	public void addStu(String a) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(new FileReader("D://a.txt"));
			String str = br.readLine();
			LinkedList arr = new LinkedList();
			while (str != null) {
				arr.add(str);

				str = br.readLine();
			}
			bw = new BufferedWriter(new FileWriter("D://a.txt"));
			for (Object i : arr) {
				bw.write((String) i);
				bw.newLine();
			}
			bw.write(a);
			bw.newLine();
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
