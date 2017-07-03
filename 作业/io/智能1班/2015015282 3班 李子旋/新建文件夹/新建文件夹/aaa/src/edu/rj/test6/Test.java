package edu.rj.test6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream s1 = new Stream();
		s1.greaterThan90();// 查询有大于90的学生姓名
		
		// 查询所有有不及格科目的学生姓名
		HashMap<Integer, String> outStudent = new HashMap<Integer, String>();
		outStudent = s1.failStudent();
		Set keys=outStudent.keySet();
		Iterator i=keys.iterator();
		while(i.hasNext()){
			Integer key=(Integer)i.next();
			String value=outStudent.get(key);
			System.out.println("学号"+key+",姓名："+value);
		}
		//求各班数学平均分
		HashMap<String,Integer> avg = new HashMap<String,Integer>();
		avg = s1.avgMath();
		Set keyAvg=avg.keySet();
		Iterator j=keyAvg.iterator();
		while(j.hasNext()){
			String key1=(String)j.next();
			Integer value=avg.get(key1);
			System.out.println(key1+",数学平均分："+value);
		}
		
//		s1.revise("111,ccc,3,98,85,26"); //按照学号修改数据；
//		s1.delete("111"); //按照学号删除数据
//		s1.writeIn("333,fff,4,85,98,78"); // 写入数据
	}

}
