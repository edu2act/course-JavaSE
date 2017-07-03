import java.util.ArrayList;
import java.util.LinkedList;


public class Player {
	public String name;
	public int level;//分数
	public String identity;//身份
public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	//	public LinkedList listOne=new LinkedList();
	public ArrayList<Cards> list1=new ArrayList<Cards>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
}
