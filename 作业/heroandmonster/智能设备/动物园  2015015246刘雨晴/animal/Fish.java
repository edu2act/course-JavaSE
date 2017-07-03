package animal;

/*
 * 实现抽象类动物类，实现水生生物接口
 * */


public class Fish extends Animal implements Aquatic{
	/*重写了swimming()方法*/

	public void swimming(){
		
		System.out.println("游泳姿势：自由泳！");
		
	}
	/*重写了cry()方法*/

	public void cry(){
		
		System.out.println("叫声：无！");
		
	}
	
	public static void main(String[] args) {
		Fish fish = new Fish();
		fish.setName("小渔");
		fish.setLegNum(0);
		fish.setVarieties("小鲤鱼");
		
		fish.toString();
		fish.swimming();
		fish.cry();
	}

	
	

}
