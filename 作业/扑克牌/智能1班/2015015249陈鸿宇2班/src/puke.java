
public class puke {

	private String color;
	private String number;
	
	public puke(String color,String number){
		this.color = color;
		this.number = number;
	}
	
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color = color;
	}
	public String getNumber(){
		return number;
	}
	public void setNumber(String number){
		this.number = number;
	}
	public String toGo(){
		return getColor()+getNumber();
	}
}
