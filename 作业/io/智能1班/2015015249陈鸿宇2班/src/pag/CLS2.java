package pag;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CLS2 {

	public void selectDown(String t){
		try {
			BufferedReader r = new BufferedReader(new FileReader(t));
			String line =r.readLine();
			System.out.println("存在不及格科目的学生：");
			while(line!=null){
				String [] s=line.split(",");
				for(int i=2;i<5;i++){
					int j = Integer.parseInt(s[i]);
					if(j<60){	
						System.out.println(s[1]);
					}	
				}
				line=r.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void selectUp(String t){
		try {
			BufferedReader r = new BufferedReader(new FileReader(t));
			String line =r.readLine();
			System.out.println("存在成绩在90分以上科目的学生：");
			while(line!=null){
				String [] s=line.split(",");
				for(int i=2;i<5;i++){
					int j = Integer.parseInt(s[i]);
					if(j>=90){
						System.out.println(s[1]);
						break;
					}
						
				}
				line=r.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void AvgMath(String t){
		try {
			BufferedReader r = new BufferedReader(new FileReader(t));
			String line =r.readLine();
			System.out.println("该班学生的数学平均成绩：");
			int sum = 0;
			while(line!=null){
				String [] s=line.split(",");
				sum+=Integer.parseInt(s[3]);
				line=r.readLine();
			}
			System.out.println(sum/3);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
