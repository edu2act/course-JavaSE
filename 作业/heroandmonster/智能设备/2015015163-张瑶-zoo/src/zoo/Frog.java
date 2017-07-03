package zoo;

public class Frog extends Animal implements Swim{
	public Frog() {
		super();
	}
	public Frog(String name, String color, String type) {
    	super(name,color,type);
    }
	public void fake() {
		System.out.println(super.getColor()+"的"+super.getName()+"呱呱");
	}
	public void eat() {
		System.out.println(super.getName()+"是"+super.getType()+"爱吃昆虫");
	}
	public void swim() {
		System.out.println(super.getName()+"可以游泳");
	}
}
