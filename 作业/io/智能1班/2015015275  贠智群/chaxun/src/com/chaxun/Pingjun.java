package com.chaxun;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Pingjun {
	public static int Sum(String a){
		String[] ss=a.replaceAll("[^0-9]",",").split(",");
		
		int sum=0;
		
		for(String temp:ss){
			if(temp.length()>0){
				sum+=Integer.parseInt(temp);
			}
		}
		return sum;
	}
	public static int read(String a){
		int sum=0;
		int count=0;
		try{
			File file = new File(a);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			String s = null;
			
	        while((s = br.readLine())!=null)  
	        {  
	            sum+=Sum(s);
	            count+=1;
	        } 
	        br.close();
			fr.close();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		return sum/count;
		
	
	}	
}
	

