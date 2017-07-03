package stu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/**
 * 求班级数学（第一个成绩）平均值
 * @参数 c int（班级）
 * @author 高明健
 * @return int(此班级数学平均分）
 */
public class stuAvg {
	public int getAvg(int c){
		BufferedReader br=null ;
		Map mark=new HashMap();
		int temp1=0;
		int temp2=0;
		try {
			br = new BufferedReader(new FileReader("D://a.txt"));
			String str = br.readLine();
			while (str != null) {				
				String arr[]=str.split(",");
				if(Integer.parseInt(arr[2])==c)
					{
					temp1+=Integer.parseInt(arr[3]);
					temp2+=1;
					}				
				str = br.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		return temp1/temp2;
	}
}
