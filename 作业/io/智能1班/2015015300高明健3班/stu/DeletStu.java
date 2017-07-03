package stu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

/**
 * 按学号删除数据
 * @参数 number String(学号)
 * @author 高明健
 * @return void
 */
public class DeletStu {
	public void deletStu(String number) {
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

