package poker;

public class Test {
	public static void main(String[] args) {
		 Game gm  =new Game();
	     gm.CreatePlays(); //创建牌
	     gm.CreateCards(); //创建玩家
	     gm.ChangeCards(); //洗牌
	     gm.SendCards();    //发牌
	     gm.Contest();      //判断输赢
	}
}
