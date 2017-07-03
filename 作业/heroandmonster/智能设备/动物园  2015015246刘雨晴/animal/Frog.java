package animal;

/*
 * 实现抽象类动物类，实现水生生物和陆生生物接口
 * */


public class Frog  extends Animal implements Aquatic,Terrestrial{
	/*重写了Cry()方法*/
	public void cry(){
		
		System.out.println("叫声：呱~");
		
	}
	/*重写了run()方法*/

	public void running(){
		
		System.out.println("奔跑姿势：四条腿蹦！");
		
	}
	/*重载了running()方法*/

	public void running(String p){
		
		this.setPosition(p);
		System.out.println("奔跑姿势：");

		System.out.println("此时是在水里，姿势是游泳！");
		
	}
	/*重写了running()方法*/

	public void swimming(){
		
		System.out.println("游泳姿势：蛙泳！");
		
	}	
	
	public static void main(String[] args) {
		
		Frog frog = new Frog();
		frog.setName("小哇");
		frog.setLegNum(4);
		frog.setVarieties("金钱蛙");
		frog.toString();
		
		frog.swimming();
		frog.running();
		frog.running("水里");

		frog.cry();
		
	}
	
	

}
