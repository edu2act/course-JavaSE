package onest.net;

import java.util.Random;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
//		String str = "Hello";
//		int x = 10, y = 20;
//		System.out.println(x > y ? x : y);
//		int i1 = -10;
//		int i2 = +20;
//		System.out.println(i1 + i2);
		
//		int i3 = -1;
//		System.out.println(i3 >> 2);
//		System.out.println(i3 >>> 2);
		
//		long l1 = 10L;
//		double d1 = 10.0;
//		System.out.println(l1 + d1);
		//如果表达式中，存在double类型，都转成double类型
		//如果表达式中，存在float类型，都转成float类型
		//如果表达式中，存在long类型，都转成long类型
		//char、short、byte类型参与运算时，无条件转成int类型
//		char c1 = 'A';
//		int i4 = 10;
//		System.out.println(c1 + i4);
		
//		byte b1 = 12;
//		short s1 = 123;
		
		//输入两个操作数一个运算符，计算结果
//		Scanner input = new Scanner(System.in);
//		System.out.println("请输入第一个操作数：");
//		int num1 = input.nextInt();
//		System.out.println("请输入第二个操作数：");
//		int num2 = input.nextInt();
//		System.out.println("请输入运算符：");
//		String opt = input.next();
//		char c = opt.charAt(0);
//		int result = 0;
//		//switch表达式，可以是byte、short、int、char、String、枚举
//		switch(opt) {
//		case "+":
//			result = num1 + num2;
//			break;
//		case "-":
//			result = num1 - num2;
//			break;
//		case "*":
//			result = num1 * num2;
//			break;
//		case "/":
//			result = num1 / num2;
//			break;
//		}
//		System.out.println("计算结果为：" + result);
		
//		for(int i = 0; i < 10; i++) {
//			if(i == 5) {
//				continue;
//			}
//			System.out.println(i);
//		}
//		Demo demo = new Demo();
//		System.out.println(demo.add(5, 10));
		
		//生成随机数
//		Random ran = new Random();
//		int res = ran.nextInt(100);
//		int num1 = 0;
//		Scanner input = new Scanner(System.in);
//		System.out.println("请输入一个整数：");
//		while(num1 != res) {
//			num1 = input.nextInt();
//			if(num1 > res) {
//				System.out.println("大了");
//			}else if(num1 < res) {
//				System.out.println("小了");
//			}else {
//				
//			}
//		}
//		System.out.println("猜对了" + num1);
		
//		int[] nums = {1,2,3,4};
//		for(int i : nums) {
//			System.out.println(i);
//		}
		System.out.println(Float.floatToIntBits(3.14f));
	}
	
	int add(int num1, int num2) {
		int result = 0;
		for(int i = num1; i <= num2; i++) {
			result += i;
		}
		return result;
	}
}
