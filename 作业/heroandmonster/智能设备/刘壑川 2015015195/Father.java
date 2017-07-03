package game;

public abstract class Father {
	public String name;
	public int bloodCount;
	public int level;
	public int attackNum;
	
	public  abstract void attack(Father f);
	
}
