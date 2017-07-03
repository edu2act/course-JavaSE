/*
 * puke类
 * 抽象出每张扑克的公有属性
 * 在main函数中会建立集合并对54张牌初始化
 */
package puke;

public class puke {
	private String huase;
	private int number;
	public puke(){}
	public puke(String huase,int number){
		this.huase=huase;
		this.number=number;
	}
	public void setHuase(String huase){
		this.huase=huase;
	}
	public void setNumber(int number){
		this.number=number;
	}
	public String getHuase(){
		return huase;
	}
	public int getNumber(){
		return number;
	}
	
}
