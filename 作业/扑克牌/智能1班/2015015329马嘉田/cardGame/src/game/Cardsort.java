package game;

import java.util.Comparator;

public class Cardsort implements Comparator<Puke>{

	@Override
	public int compare(Puke p1, Puke p2) {
		// TODO Auto-generated method stub
		// 构建花色和牌值数组，通过比对，计算得到某张牌的价值（大小）
        String[] color = {"方片", "梅花", "红桃", "黑桃"};
        String[] number = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J","Q","K", "A"};

        //由于比较规则是先比较牌值，如果相等再比较花色（黑红梅方），所以将牌值赋予较高的权值
        int valueOfP1 = 0;
        int valueOfP2 = 0;
        for(int i=0;i<number.length;i++){
            if(p1.getNumber().equals(number[i])) valueOfP1 += i*10;
            if(p2.getNumber().equals(number[i])) valueOfP2 += i*10;
        }
        for(int i=0;i<color.length;i++){
            if(p1.getColor().equals(color[i])) valueOfP1 += i;
            if(p2.getColor().equals(color[i])) valueOfP2 += i;
        }

        if( valueOfP1 > valueOfP2 ) return -1;
        if( valueOfP1 < valueOfP2 ) return 1;

		return 0;
	}
	
}
