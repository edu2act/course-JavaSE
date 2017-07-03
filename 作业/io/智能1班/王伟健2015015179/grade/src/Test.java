import java.util.ArrayList;
import java.util.Set;


public class Test {
	public static void main(String[] args) {
		
		Service se = new Service();
		/*不及格*/
		System.out.println("未及格：");
		ArrayList<String> at=se.getFail();
		for(String s:at){
			System.out.print(s+"\t");
		}
		System.out.println();
		/*大于90分*/
		System.out.println("大于90分：");
		Set<String> set=se.getExcellent();
		for(String s:set){
			System.out.print(s+"\t");
		}
		System.out.println();
		/*查找*/
		System.out.println("所有人：");
		se.search("*");
	}

}
