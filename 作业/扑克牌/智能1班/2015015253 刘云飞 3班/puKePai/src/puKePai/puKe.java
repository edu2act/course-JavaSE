package puKePai;

/**
 * 
 * @author me 一副纸牌有54张，4种花色，每种花色13张。我们能用一个整数m就表示出所有的54种情况，规则是： m / 13： =0:
 *         红心，=1: 方片，=2: 梅花，=3: 黑桃. =4 王  m % 13: =0:2，=1:3，=2:4 ....
 *         =8:10，=9:J，=10:Q，=11: K，=12:A 比如：m = 15 就表示：方块4 m=38表示：梅花A 
 *
 *
 *		此程序为斗地主发牌程序，假设玩家每次都叫牌
 */

public class puKe {
	String paiSe[] = { "♥", "♦", "♣", "♠","王"};
	String point[] = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
	public String[] getPaiSe() {
		return paiSe;
	}
	public String[] getPoint() {
		return point;
	}
}
