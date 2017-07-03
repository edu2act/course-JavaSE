package poker;

import java.util.Random;

public class GetRandom {
	public int[] getRandom(){
		int[] intRet = new int[9]; 
		int intRd = 0; //存放随机数
		int count = 0; //记录生成的随机数个数
		int flag = 0; //是否已经生成过标志
		while(count<9){
			Random rdm = new Random(System.currentTimeMillis());
			intRd = Math.abs(rdm.nextInt())%52+1;
			for(int i=0;i<count;i++){
				if(intRet[i]==intRd){
					flag = 1;
					break;
				}else{
					flag = 0;
				}
			}
			if(flag==0){
				intRet[count] = intRd;
				count++;
			}
		}
		return intRet;
	}
}
