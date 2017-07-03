package animal;

/*
 * 定义动物的抽象类
 * */


public abstract class Animal {
	
	private String name;
	private int legNum;
	private String varieties; 
	private String position;//生活环境：水中/陆地
	public abstract void cry();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLegNum() {
		return legNum;
	}
	public void setLegNum(int legNum) {
		this.legNum = legNum;
	}
	public String getVarieties() {
		return varieties;
	}
	public void setVarieties(String varieties) {
		this.varieties = varieties;
	}
	public Animal(String name, int legNum, String varieties) {
		super();
		this.name = name;
		this.legNum = legNum;
		this.varieties = varieties;
	}
	public Animal() {

	}
	public String toString(){
		
		System.out.println("名字："+name+"  "+"有几条腿："+legNum+"  "+"品种："+varieties);
		
		
		return name;
		
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getPosition() {
		return position;
	}
	
	

}
