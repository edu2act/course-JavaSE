package com.game2;

public class card {
	int value,style;
	final String[] val = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	final String[] sty = {"红桃","梅花","方块","黑桃"};
	card(int i,int j){
		style = i;
		value = j;
	}
	public String toString() {
        return  sty[style]+ " " + val[value];
    }
}
