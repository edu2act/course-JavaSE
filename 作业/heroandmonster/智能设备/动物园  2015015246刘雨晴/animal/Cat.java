package animal;

/*
 * 实现抽象类动物类，实现陆生生物接口
 * */


public class Cat extends Animal implements Terrestrial {
	/*重写了running()方法*/

	public void running(){
		
		System.out.println("跑步姿势：四条腿！");
		
	}
	/*重写了cry()方法*/

	public void cry() {
		
		System.out.println("叫声：喵 ~");
		
	}
	
	
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.setName("小喵");
		cat.setLegNum(4);
		cat.setVarieties("波斯猫");
		
		cat.toString();
		cat.running();
		cat.cry();
	}
	
	

}
