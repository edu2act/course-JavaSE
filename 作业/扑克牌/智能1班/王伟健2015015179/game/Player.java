package game;

import java.util.ArrayList;

public class Player {
	private String role;
	private ArrayList<Pai> pai = new ArrayList<Pai>();
	public Player(){};
	public Player(String role, ArrayList<Pai> pai) {
		super();
		this.role = role;
		this.pai = pai;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public ArrayList<Pai> getPai() {
		return pai;
	}
	public void setPai(Pai pai) {
		this.pai.add(pai);
	}
}
