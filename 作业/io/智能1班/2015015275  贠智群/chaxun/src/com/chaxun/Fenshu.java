package com.chaxun;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class Fenshu {
		public static String Shaixuan(String a,int b,int c){
			String[] s = a.split("\\d+");
			String[] ss=a.replaceAll("[^0-9]",",").split(",");
			String sss = null;
			
			for(String temp:ss){
				if(temp.length()>0){
					int m=Integer.parseInt(temp); 
					if(m>=b&&m<=c){
						for(String temp1:s){
							if(temp1.length()>0)
								sss=temp1;
						}
					}
						
				}
			}
			return sss;
		}
		public static void read(String a,int b,int c){
			
			try{
				File file = new File(a);
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);
				String s = null;
				
		        while((s = br.readLine())!=null)
		        {  
		        	if(Shaixuan(s,b,c)!=null)
		        		System.out.print(Shaixuan(s,b,c));
		        	
		        } 
		        s=br.readLine();
		        br.close();
				fr.close();
				
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
			
		
		}	


}
