package Puker;

import java.util.Comparator;

public class CardComparator implements Comparator<Card> {
	public int compare(Card c1,Card c2) {
		//构建花色和牌值数组 通过对比 计算得到某张牌的价值（大小）
		String[] color = {"方片", "梅花", "红桃", "黑桃"};
        String[] number = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J","Q","K", "A"};
        
        
        //由于比较规则是先比较牌值 如果相等在比较花色  所以将牌值设为较高的权值
        int valueOfC1 = 0;
        int valueOfC2 = 0;
        for(int i=0;i<number.length;i++) {
        	if(c1.getNumber().equals(number[i])) 	valueOfC1 += i*10;
        	if(c2.getNumber().equals(number[i]))	valueOfC2 += i*10;
        }
        for(int i=0;i<color.length;i++) {
        	if(c1.getNumber().equals(color[i]))		valueOfC1 += i;
        	if(c2.getColor().equals(color[i]))		valueOfC2 += i;
        }
        if(valueOfC1 > valueOfC2) return -1;
        if(valueOfC1 < valueOfC2) return 1;
        
        return 0;
	}
}
