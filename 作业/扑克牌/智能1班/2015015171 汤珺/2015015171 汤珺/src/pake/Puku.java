package pake;

import java.util.LinkedList;

public class Puku {
	private  String[] color={"红","黑","花","片"};
	private String[] num={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
	private static  LinkedList<String> Puku=new LinkedList<String>();

	public String[] getColor() {
		return color;
	}
	public void setColor(String[] color) {
		this.color = color;
	}
	public String[] getNum() {
		return num;
	}
	public void setNum(String[] num) {
		this.num = num;
	}
	   public void init(){
			for(int i=0;i<color.length;i++){
				for(int j=0;j<num.length;j++){
					
					getPuku().add(color[i]+num[j]);
				}
			}
			getPuku().add("大王");
			getPuku().add("小王");
		}
	public static LinkedList<String> getPuku() {
		return Puku;
	}
	public static void setPuku(LinkedList<String> puku) {
		Puku = puku;
	}


	
}
