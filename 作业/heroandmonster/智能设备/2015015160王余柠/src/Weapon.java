
public interface Weapon {
	int addNum=10;
	public default int addAttackNum() {
		return addNum;
	}
}
