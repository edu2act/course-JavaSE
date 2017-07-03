package game;

public abstract class person {
	public String name;
	public int bloodCount;
	public int level;
	public int attackNum;
	
	public abstract void attack(person p);
	
}
