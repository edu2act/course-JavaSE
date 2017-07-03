package student;

import java.io.*;

public class Student {
	public void Insert(){
		try{
			BufferedWriter bw = new BufferedWriter(new FileWriter("D:/方向课/JavaSE/workspace1/Homework7/student.txt"));
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("请输入学生的学号，姓名，年龄，数学成绩，英语成绩,以空格分开，输入exit退出");
			String in = br.readLine();
			while(!in.equals("exit")){
				bw.write(in);
				bw.newLine();
				in = br.readLine();
			}
			br.close();
			bw.flush();
			bw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void SelectAll(){
		try {
			BufferedReader br = new BufferedReader(new FileReader("D:/方向课/JavaSE/workspace1/Homework7/student.txt"));
			String line = null;
			
			while((line = br.readLine()) != null){
				String [] s = line.split(" ");
				for(int i = 0;i < s.length;i++){
					System.out.print(s[i]+"\t");
				}
				System.out.println();
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void SelectFail(){
		try {
			BufferedReader br = new BufferedReader(new FileReader("D:/方向课/JavaSE/workspace1/Homework7/student.txt"));
			String line = null;
			
			while((line = br.readLine()) != null){
				String [] s = line.split(" ");
				if(Integer.parseInt(s[3]) < 60||Integer.parseInt(s[4]) < 60){
					System.out.print(s[1]+"\t");
				}
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void SelectGood(){
		try {
			BufferedReader br = new BufferedReader(new FileReader("D:/方向课/JavaSE/workspace1/Homework7/student.txt"));
			String line = null;
			
			while((line = br.readLine()) != null){
				String [] s = line.split(" ");
				if(Integer.parseInt(s[3]) > 90||Integer.parseInt(s[4]) > 90){
					System.out.println(s[1]+"\t");
				}
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public float MathAVG(){
		int sum = 0;
		int count = 0;
		float avg = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader("D:/方向课/JavaSE/workspace1/Homework7/student.txt"));
			String line = null;
			while((line = br.readLine()) != null){
				String [] s = line.split(" ");
				sum += Integer.parseInt(s[3]);
				count++;
			}
			br.close();
			avg = (float)sum/count;
			System.out.println(avg);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return avg;
	}
	
}
