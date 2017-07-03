
public class Player {
	private String name;
	private String identify;
	public Player(String name, String identify) {
		this.name = name;
		this.identify = identify;
	}
	
	public String getIdentify() {
		return identify;
	}

	public void setIdentify(String identify) {
		this.identify = identify;
	}

	public Player(String name) {
		this.name = name;
	}

	public Player() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
