package zoo;

public class Test {

	public static void main(String[] args) {
		Frog frog = new Frog("青蛙","绿色","两栖类");
		frog.fake();
		frog.eat();
		Fish fish = new Fish("鱼","金色","水生类");	
		fish.fake();
		fish.eat();
		Dog dog = new Dog("狗","黑色","陆生类");
		dog.fake();
		dog.eat();
		Swim swimmer1 = (Swim)frog;
		swimmer1.swim();
		Swim swimmer2 = (Swim)fish;
		swimmer2.swim();
	}

}
