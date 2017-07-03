package zoo;

public class Fish extends Animal implements Swim {
	public Fish() {
		super();
	}
	public Fish(String name,String color,String type) {
		super(name,color,type);
	}
	public void fake() {
		System.out.println(super.getColor()+"的"+super.getName()+"不会叫");
	}
	public void eat() {
		System.out.println(super.getName()+"是"+super.getType()+"爱吃虾米");
	}
	public void swim() {
		System.out.println(super.getName()+"会游泳");
	}
}
