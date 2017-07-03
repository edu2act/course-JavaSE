package puKePai;

import java.util.Random;

public class faPai {
	private static int m = 0;
	private static int i = 0,j=0;
	private static int s[] = new int[54];
	private static int p[] = new int[54];
	private static int p1[] =new int[20];
	private static int p2[] =new int[20];
	private static int p3[] =new int[20];
	
	

	public static void main(String[] args) {
		Random r = new Random();

		while (i < 54) {
			m = r.nextInt(54);
			if (s[m] == 1)
				continue;
			s[m] = 1;
			p[i] = m;
			i++;
		}
		
		for(j=0;j<20;j++){
			p1[j]=p[j];
		}
		for(j=0;j<17;j++){
			p2[j]=p[j+20];
		}
		for(j=0;j<17;j++){
			p3[j]=p[j+37];
		}
	}
	
	public static int[] getP1() {
		return p1;
	}

	public static int[] getP2() {
		return p2;
	}

	public static int[] getP3() {
		return p3;
	}
}