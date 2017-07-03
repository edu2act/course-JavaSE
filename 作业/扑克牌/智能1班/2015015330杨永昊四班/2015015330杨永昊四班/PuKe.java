package 扑克牌;

public class PuKe {
	private String skin;
	private int value;
	
	PuKe(){
		this.skin = "方片";
		this.value = 1;
	}
	PuKe(String a, int b){
		this.skin = a;
		this.value = b;
	}
	
	public String getSkin() {
		return skin;
	}
	public void setSkin(String skin) {
		this.skin = skin;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
}
