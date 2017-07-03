package play;
import java.util.Arrays;
import java.util.Random;
class Person{
	private String[]paishu;
	private String name;
	public String getName(){
		return name;
	}
	 public void setName(String name){
		 this.name=name;
	 }
	 public String[] getPaishu(){
	 return paishu;
	 }
	 public void setPaishu(String[] paishu){
       this.paishu=paishu;
		 
	 }
	 public String toString()
	 {
	 return"姓名："+this.name+"牌数："+Arrays.toString(this.paishu);
	 }
	 
	 
	 
}
public class fapai {
	public static void main(String[] args)
	{

	String[] sa=shengChengShuZu();
	String daluanhou[]=daLuan(sa); 
	Person p1=new Person();
	Person p2=new Person();
	Person p3=new Person();
	Person p4=new Person();
     p1.setName("刘德华");
	p2.setName("张学友");
	p3.setName("周星驰");
	p4.setName("底牌");
	 
	 
 
	p1.setPaishu(liudehua(daluanhou));
	p2.setPaishu(zhangxueyou(daluanhou));
	p3.setPaishu(zhouxinchi(daluanhou));
	p4.setPaishu(dipai(daluanhou));
	System.out.println(p1+"\n"+p2+"\n"+p3+"\n"+p4);
	}
	public static String huaSe(int num){
	String str=null;
	switch (num)
	{
	case 0:
	str="黑桃";
	break;
	case 1:
	str="红桃";
	break;
	case 2:
	str="梅花";
	break;
	case 3:
	str="方块";
	break;
	}
	return str;
	}
	public static String number(int num){
	String str=null;
	switch (num)
	{
	case 0:
	str="3";
	break;
	case 1:
	str="4";
	break;
	case 2:
	str="5";
	break;
	case 3:
	str="6";
	break;
	case 4:
	str="7";
	break;
	case 5:
	str="8";
	break;
	case 6:
	str="9";
	break;
	case 7:
	str="10";
	break;
	case 8:
	str="J";
	break;
	case 9:
	str="Q";
	break;
	case 10:
	str="K";
	break;
	case 11:
	str="A";
	break;
	case 12:
	str="2";
	break;
	}
	return str;
	}
	public static String[] daLuan(String[] a){
	boolean[] flag= new boolean[54];
	String[] caozuoshuzu=new String[54];
	int b=0;
	for(int i=0;i<a.length;i++){

	do{
	Random r =new Random();
  b=r.nextInt(54);
	}while(flag[b]);
	flag[b]=true;
	caozuoshuzu[i]=a[b];
	}
	return caozuoshuzu;
	}
	public static String[] shengChengShuZu(){
	String[] sa=new String[54];
	int c=0;
	for(int j=0;j<4;j++){ 
 
	again:for (int i =0; i<13;i++)//数字循环
	{

	while(c<=52){

	 sa[c]=huaSe(j)+number(i);
	 c++;
	 continue again;
	}

	}
	}	
	sa[52]="大王";
	sa[53]="小王";
	return sa;
	}
	public static String[] liudehua(String[] daluanhou){
	String [] liudehua=new String[17];
	for (int i =0;i<liudehua.length; i++)
	{
	liudehua[i]=daluanhou[i];
	}
	return liudehua;
	}
	public static String[] zhangxueyou(String[] daluanhou){
	String[] zhangxueyou=new String[17];
	for (int i=0;i< zhangxueyou.length; i++)
	{
	zhangxueyou[i]=daluanhou[i+17];
	}
	return zhangxueyou;
	}
	public static String[]zhouxinchi(String[] daluanhou){
	String [] zhouxinchi=new String[17];
	for (int i = 0;i < zhouxinchi.length; i++)
	{
	zhouxinchi[i]=daluanhou[i+34];
	}
	return zhouxinchi;
	}
	public static String[] dipai(String[] daluanhou){
	String []dipai=new String[3];
	for (int i=0;i<dipai.length; i++)
	{
	dipai[i]=daluanhou[i+51];
	}
	return dipai;
	}
	 

}
