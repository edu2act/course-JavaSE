package zoo;

public class Dog extends Animal{
	public Dog() {
		super();
	}
	public Dog(String name, String color, String type) {
		super(name,color,type);
	}
	public void fake() {
		System.out.println(super.getColor()+"的"+super.getName()+"会汪汪地叫");
	}
	public void eat() {
		System.out.println(super.getName()+"是"+super.getType()+"爱吃萝卜");
	}
}
