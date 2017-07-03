package puKePai;

import java.util.Random;

public class diZhu {
	private static int d=0;
	
	public static void main(String[] args) {
		Random r = new Random();
		d = r.nextInt(3);
	}
	
	public static int getD() {
		return d;
	}
}
