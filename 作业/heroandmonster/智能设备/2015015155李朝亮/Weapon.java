package game;

public interface Weapon {
	int addNum=100;
	public default int addAttackNum(){
		return addNum;
	}
}
