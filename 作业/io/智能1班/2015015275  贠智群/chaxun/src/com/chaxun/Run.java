package com.chaxun;

public class Run {
	public static void main(String[] args) {
		System.out.println(Pingjun.read("1.txt"));
		Fenshu.read("1.txt",90,100);
		System.out.println("90分以上");
		Fenshu.read("1.txt",0,69);
		System.out.println("不及格");
	}
}
