package net.onest;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
//		int[] num1 = {1,2,3,4,5};
//		int[] num2;
//		num2 = {1,2,3,4,5};
//		int[4] num3;
//		System.out.println(num1.length);
//		System.out.println(num1[5]);//数组下标越界异常
//		System.out.println("==============");
		//动态初始化
//		int[] num4 = new int[5];
//		num4[0] = 19;
//		for(int i = 0; i < num4.length; i++) {
//			num4[i] = i;
//			System.out.println(num4[i]);
//		}
		
		//二维数组
//		int[][] nums = {{1,2},{3,4,5},{6,7,8,9}};
//		
//		for(int i = 0; i < nums.length; i++) {
//			for(int j = 0; j < nums[i].length; j++) {
//				System.out.println(nums[i][j]);
//			}
//		}
//		
//		String[][] strs = new String[4][4];
//		
//	    int[][] nums1 = new int[3][];
//	    nums1[0] = new int[2];
//	    nums1[1] = new int[3];
//	    nums1[2] = new int[4];
	    
		//数组的赋值
		int[] i1 = {1,2,3,4,5};
		int[] i2 = i1;//赋的引用的值
		
		//重新给新数组分配内存空间
//		int[] i3 = Arrays.copyOf(i1, i1.length);
//		i3[0] = 10;
//		for(int i : i1) {
//			System.out.println(i);
//		}
		
//		int[] i4 = new int[5];
//		Arrays.fill(i4, 10);
//		System.out.println(Arrays.toString(i4));
		
		int[] i5 = {28,43,21,87,4,5,65,34};
		Arrays.sort(i5);
		System.out.println(Arrays.toString(i5));
		
		int index = Arrays.binarySearch(i5, 50);
		System.out.println(index);
	}
}
