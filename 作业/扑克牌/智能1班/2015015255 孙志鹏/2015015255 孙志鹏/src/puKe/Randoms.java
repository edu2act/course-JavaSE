package puKe;

import java.util.Random;

public class Randoms {
	public int[] getRandom(){
		int[] intRet = new int[9]; 
		int intRandom = 0; 
		int count = 0; 
		int flag = 0; 
		while(count<9){
			Random rdm = new Random(System.currentTimeMillis());
			intRandom = Math.abs(rdm.nextInt())%52+1;
			for(int i=0;i<count;i++){
				if(intRet[i]==intRandom){
					flag = 1;
					break;
				}else{
					flag = 0;
				}
			}
			if(flag==0){
				intRet[count] = intRandom;
				count++;
			}
		}
		return intRet;
	}
}
