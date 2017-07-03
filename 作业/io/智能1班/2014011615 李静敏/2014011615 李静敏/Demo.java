package stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 *查询所有有不及格科目的学生姓名，
 *查询所有90分以上学生姓名，
 *查询数学平均分
 */


public class Demo {
	public static void main(String[] args){
		File f1= new File("f:/a.txt");
		File f2 = new File("e:/a.txt");
		try{
			//定义BufferedReader类
			FileReader fileReader = new FileReader(f1);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			//定义BufferedWriter类
			FileWriter fileWriter = new FileWriter(f2);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);


			String str = bufferedReader.readLine();
			String sName;
			String name;
			int mathAvg;


			while(str != null){
				sName = getStudentNameOfFail(str);
				if(sName != ""){
					bufferedWriter.write(sName +"不及格 ");	
				}
				name = getStudentNameOfBetterThanNinety(str);
				if(name != ""){	
					bufferedWriter.write(name+"成绩大于九十分");
				}
				str = bufferedReader.readLine();
			}


			mathAvg = getMathAvg(f1);
			bufferedWriter.write("" + mathAvg);

			bufferedReader.close();
			bufferedWriter.flush();
			bufferedWriter.close();
			fileReader.close();
			fileWriter.close();

		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}
	}


//查询所有有不及格科目的学生姓名
	public static String getStudentNameOfFail(String str){
		String name = "";


		String[] list = str.split(",");
		for(int i = 2; i < list.length ; i++){
			if(Integer.parseInt(list[i]) < 60){
				name = list[1];
			}
		}
		return name;
	}

//查询所有成绩在90分以上的同学
	public static String getStudentNameOfBetterThanNinety(String str){
		String name = "";
		String[] list = str.split(",");
		for(int i = 2; i < list.length ; i++){
			if(Integer.parseInt(list[i]) > 90){
				name = list[1];
			}
		}
		return name;
	}

//查询全班数学的平均成绩
	public static int getMathAvg(File f1){
		FileReader fileReader;
		int sum = 0;

		ArrayList array = new ArrayList();
		try {
			fileReader = new FileReader(f1);
			BufferedReader br = new BufferedReader(fileReader);
			String str = br.readLine();
			while (str != null){
				String[] list = str.split(",");
				array.add(Integer.parseInt(list[3]));
				str = br.readLine();
			}
			for(int i = 0; i < array.size(); i++){
				sum += (Integer)array.get(i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}
		return sum/array.size();
	}
}
