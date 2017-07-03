import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.Random;
public class random {
	
	public void handOut() {
	
		 Object []poc={"红桃：A","红桃：2","红桃：3","红桃：4","红桃：5","红桃：6","红桃：7","红桃：8",
				 "红桃：9","红桃：10","红桃：j","红桃：Q","红桃：K",
				 "黑桃：A","黑桃：2","黑桃：3","黑桃：4","黑桃：5","黑桃：6","黑桃：7","黑桃：8","黑桃：9",
				 "黑桃：10","黑桃：J","黑桃：Q","黑桃：K","梅花：A","梅花:2","梅花:3","梅花:4","梅花:5","梅花:6",
				 "梅花:7","梅花:8","梅花:9","梅花:10",
				 "梅花:J","梅花:Q","梅花:K","方片：A","方片：2","方片：3","方片：4","方片：5","方片：6","方片：7",
				 "方片：8","方片：9","方片：10","方片：J","方片：Q",
				 "方片：K","大王","小王"};
		
			
		
		
		
	
		
		    
			System.out.println("第一个人的牌是：");
			for(int p  = poc.length;p > 36;p--){
		   
			Random random =new Random();
			int t= random.nextInt(p);//找到随机数赋值给t
		
			
			System.out.println(poc[t]);//输出随机位置的值
			List   list   =   new   ArrayList(Arrays.asList(poc));//将数组变成列表 
			list.remove(t); //将随机值删除
			poc =  list.toArray();  //将列表转换成数组
		
				}
		
			System.out.println(" ");
			System.out.println("第二个人的牌是：");
			for(int p  = poc.length;p > 18;p--){
		   
			Random random =new Random();
			int t= random.nextInt(p);//找到随机数赋值给t
		
			
			System.out.println(poc[t]);//输出随机位置的值
			List   list   =   new   ArrayList(Arrays.asList(poc));//将数组变成列表 
			list.remove(t); //将随机值删除
			poc =  list.toArray();  //将列表转换成数组
		
				}
		
			System.out.println(" ");
		System.out.println("第三个人的牌是：");
		for(int p  = poc.length;p > 0;p--){
		   
			Random random =new Random();
			int t= random.nextInt(p);//找到随机数赋值给t
		
			
			System.out.println(poc[t]);//输出随机位置的值
			List   list   =   new   ArrayList(Arrays.asList(poc));//将数组变成列表 
			list.remove(t); //将随机值删除
			poc =  list.toArray();  //将列表转换成数组
		
				}
		
		
		
		
		
		
		
		
		
		
	}
		
}
