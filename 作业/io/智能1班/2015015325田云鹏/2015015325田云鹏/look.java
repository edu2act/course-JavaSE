package homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
  
  
//实现FilenameFilter接口,可用于过滤器文件名
//本方法实现的是筛选指定格式结尾的文件
public class look{
  
	public static void main(String[] args) {
        File f=new File("E:\\Java\\eData\\a\\Grade.txt");//你文件的路径
        try {
            InputStream is=new FileInputStream(f);
            BufferedReader bf=new BufferedReader(new InputStreamReader(is));
           
            String str = bf.readLine();     
       
            
			while(str!=null) {	
				
				String[] s = str.split(",");

				for(int i=2;i<=4;i++) {  				//判断是否有人某科不及格,如果有则输出此人全部信息。
					if(Integer.parseInt(s[i])<60) 
					{
						System.out.println("不及格的人为:    "+str);
						break;
					}
					if(Integer.parseInt(s[i])>90)
					{		//判断是否有人某科在90分以上，如果有则输出此人全部信息。
						System.out.println("有90分以上的人为: "+str);
						break;
						
					}
				}
				
				
				str = bf.readLine();
				
				
			}
  	
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
       avg();
    }
	
	public static void avg() {
		BufferedReader br = null;
		try {
			 br = new BufferedReader(new FileReader("E:\\Java\\eData\\a\\Grade.txt"));
			 
			try {
				int sum1 =0;
				String str = br.readLine();
				
				while(str!=null) {
					 
					String[] s = str.split(",");
					
						sum1 +=  Integer.parseInt(s[3]);
						
				
	
					str = br.readLine();
				}
				System.out.println("数学平均分为:  "+sum1/4);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(br!=null)
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}
}


