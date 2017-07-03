 
import java.awt.*;  
import javax.swing.*;  
import java.awt.event.*;  
  
public class Test extends JFrame{  
	public static boolean isNumeric(String str) {  
		  for (int i = str.length(); --i >= 0;) {     
		   if (!Character.isDigit(str.charAt(i))) {  
		    return false;  
		   }  
		  }  
		   return true;  
		}  
	public static void main(String[] args) {
		Test t=new Test();
		String s="sss";
		
		System.out.println(t.isNumeric(s));
		
	}
}