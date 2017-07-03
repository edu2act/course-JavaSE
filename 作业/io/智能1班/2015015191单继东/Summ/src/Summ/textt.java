package Summ;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class textt {

	public static void main(String[] args) {
		int avg=avg.avgMath();
		System.out.println(avg);
		
		int avg=getStudentScore.getStudentScore(2);
		System.out.println(avg);
		
		HashMap<Integer, Integer> hm=getStudentScore.getAvg();
		Set keys=hm.keySet();
		Iterator i=keys.iterator();
		while(i.hasNext()){
			Integer key=(Integer)i.next();
			Integer value=hm.get(key);
			System.out.println("学号"+key+",平均分："+value);
		}
		try{
			BufferedReader br=new BufferedReader(new FileReader("d:/a.txt"));
			String line=br.readLine();
			while(line!=null){
				System.out.println(line);
			line=br.readLine();
			}
			br.close();
			BufferedWriter bw=new BufferedWriter(new FileWriter("d:/a.txt"));
			bw.write("you are a good man");
			bw.newLine();
			bw.write("nihao");
			bw.write("小稻草");
			bw.flush();
			bw.close();
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
