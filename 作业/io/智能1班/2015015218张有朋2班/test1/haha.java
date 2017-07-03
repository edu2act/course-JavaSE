package test1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;



public class haha {
	/**
	 * 获取不及格的学生
	 * @return 该生的学号，姓名，不及格的分数
	 */
	public static HashMap<String,Integer> notPass(){
		BufferedReader br = null;
		try{
			HashMap<String,Integer> hm = new HashMap<String,Integer>();
			br = new BufferedReader(new FileReader("d:/test.txt"));
			String line = br.readLine();
			while(line!=null){
				String [] s = line.split(",");
				for(int i = 2;i < 5;i++){
					if(Integer.parseInt(s[i]) < 60){
						hm.put(s[0]+s[1], Integer.parseInt(s[i]));
					}
				
				}
				line = br.readLine();
			}
			return hm; 
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally{
			if(br!=null){
				try{
					br.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
			
		}
	}
	
	/**
	 * 获取超过90分的学生
	 * @return  该生的学号，姓名，高于90的分
	 */
	
	public static HashMap<String,Integer> getHeigh(){
		BufferedReader br = null;
		try{
			HashMap<String,Integer> hm = new HashMap<String,Integer>();
			br = new BufferedReader(new FileReader("d:/test.txt"));
			String line = br.readLine();
			while(line!=null){
				String [] s = line.split(",");
				for(int i = 2;i < 5;i++){
					if(Integer.parseInt(s[i]) > 90){
						hm.put(s[0]+s[1], Integer.parseInt(s[i]));
					}
				
				}
				line = br.readLine();
			}
			return hm; 
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally{
			if(br!=null){
				try{
					br.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
	}
	
	/**
	 * 获取各班的数学平均分
	 * @return  各班的数学平均分
	 */
	
	public static void avgMath(){
		BufferedReader br = null;
		try{
			br = new BufferedReader(new FileReader("d:/test.txt"));
			String line = br.readLine();
			int sum = 0;
			int summ = 0;
			int count = 0,countt = 0;
			while(line!=null){
				String [] s = line.split(",");
				if(Integer.parseInt(s[5])==1){
					sum +=Integer.parseInt(s[3]);
					count ++;
				}else{
					summ +=Integer.parseInt(s[3]);
					countt ++;
				}
				line = br.readLine();
			}
			System.out.println("1班的数学平均分为:" + sum/count + ",2班的数学平均分为:" + summ/countt); 
		}catch(Exception e){
			e.printStackTrace();
			return;
		}finally{
			if(br!=null){
				try{
					br.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
	}
		
		
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		HashMap<String,Integer> hm = haha.notPass();
		Set keys = hm.keySet();
	    java.util.Iterator i=keys.iterator();
		while(i.hasNext()){
			String key=(String) i.next();
			Integer value=hm.get(key);
			System.out.println("学号" + ",姓名" + " "+key+",不及格的分："+value);
		}
		
		HashMap<String,Integer> hh = haha.getHeigh();
		Set keyss = hh.keySet();
	    java.util.Iterator j=keyss.iterator();
		while(j.hasNext()){
			String key=(String) j.next();
			Integer value=hh.get(key);
			System.out.println("学号" + ",姓名" + " "+key+",高于90的分："+value);
		}
		
		haha.avgMath();
		
	}

}
