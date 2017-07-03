package tb;

import tb.Stream;

public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream s1 = new Stream();
		s1.greaterThan90();
		s1.delete("2");
		int [] avg = s1.avgMath(3);
		System.out.println(avg[1]);
	}

}
