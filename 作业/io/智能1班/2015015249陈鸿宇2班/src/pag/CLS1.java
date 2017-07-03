package pag;

public class CLS1 {

		public static void main(String[] args) {
			CLS2 a=new CLS2();
			String address = "D://a.txt";
			a.selectDown(address);
			a.selectUp(address);
			a.AvgMath(address);
		}
}