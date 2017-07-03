package puke;


	import java.util.Arrays;  
	public class Run{  
	    public static void main(String[] args) {  
	      
	        int[]pkCode=new int[54];                                              
	          
	        for(int i=0;i<54;i++){  
	            pkCode[i]=i;  
	        }  
	          
	        String[]color={"方片","梅花","红桃","黑桃"};                                  

	        String[]num={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};   

	        int[]pk=new int[54];  

	        for(int i=0;i<pk.length;i++){  

	            int index=(int)(Math.random()*(pk.length-i));                     

	            pk[i]=pkCode[index];  
	            remove(pkCode,index);  
	        }  

	        int[]player1=new int[17];  
	        int[]player2=new int[17];  
	        int[]player3=new int[17];  
	        int[]dipai=new int[3];  

	        System.arraycopy(pk, 0, player1, 0, 17);  
	        System.arraycopy(pk, 17, player2, 0, 17);  
	        System.arraycopy(pk, 34, player3, 0, 17);  
	        System.arraycopy(pk, 51, dipai, 0,3);  
	          
	        sort(player1);  
	        sort(player2);  
	        sort(player3);  
	        sort(dipai);  

	        String []pk1Char = new String[17];  
	        String []pk2Char = new String[17];  
	        String []pk3Char = new String[17];  
	        String []dipaiChar = new String[3];  
	          
	        copy(player1,pk1Char,color,num);  
	        copy(player2,pk2Char,color,num);  
	        copy(player3,pk3Char,color,num);  
	        copy(dipai,dipaiChar,color,num);  
	          
	        System.out.println(Arrays.toString(pk1Char));             
	        System.out.println(Arrays.toString(pk2Char));  
	        System.out.println(Arrays.toString(pk3Char));  
	        System.out.println(Arrays.toString(dipaiChar));  
	    }  
 
	    public static void sort(int[]a){  
	        for(int i=1;i<a.length;i++){  
	            for(int j=0;j<i;j++){  
	                if(a[j]<a[i]){  
	                    int temp=a[j];  
	                    a[j]=a[i];  
	                    a[i]=temp;  
	                }  
	            }  
	        }  
	    }  

	    public static void remove(int[]a,int index){  
	        for(int i=index;i<a.length-1;i++){  
	            a[i]=a[i+1];  
	        }  
	    }  

	    public static void copy(int[]a,String[]d  
	            ,String[]color,String[]num){  
	        for(int i=0;i<a.length;i++){  
	            int index=a[i];  

	            if(index==52)d[i]="小王";  

	            else if(index==53)d[i]="大王";  
	              
	            else{  

	                d[i]=color[index%4]+num[index/4];  
	            }  
	        }  
	    }  
	}  

