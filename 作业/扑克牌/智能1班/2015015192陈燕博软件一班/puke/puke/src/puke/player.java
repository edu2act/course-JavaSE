/*
 * player类
 * 每个玩家首先会被随机分17张牌，所以每个玩家会有1个集合用来装牌
 * 每个玩家有name属性和level属性
 */
package puke;
import java.util.*;
public class player {
	private String name;
	private int level;
	public player(){}
	public player(String name,int level){
		this.name=name;
		this.level=level;
	}
	public LinkedList list=new LinkedList();
	public void setName(String name){
		this.name=name;
		
	}
	public void setLevel(int level){
		this.level=level;
	}
	public String getName(){
		return name;
	}
	public int getlevel(){
		return level;
	}
}
