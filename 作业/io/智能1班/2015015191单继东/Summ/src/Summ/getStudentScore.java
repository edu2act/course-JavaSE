package Summ;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class getStudentScore {
	public static int getStudentScore(int id){
		BufferedReader br=null;
		try{
			int sum=0;
			int count=0;
			br=new BufferedReader(new FileReader("d:/a.txt"));
			String line=br.readLine();
			while(line!=null){
				String [] s=line.split(",");
				if(id==Integer.parseInt(s[0])){
					sum+=Integer.parseInt(s[2]);
					sum+=Integer.parseInt(s[4]);
					sum+=Integer.parseInt(s[3]);
					break;
				}
				line=br.readLine();
			}
			return sum/3;
		}catch(Exception e){
			e.printStackTrace();
			return 0;
		}finally{
			if(br!=null)
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}
