package puke;

public class WrongCommand extends Exception { 
	public WrongCommand(){
		
	} 
	public WrongCommand(String message){ 
		super(message); 
	} 
}
