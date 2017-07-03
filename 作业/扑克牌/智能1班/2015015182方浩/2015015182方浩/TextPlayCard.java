
public class TextPlayCard {
	public static void main(String[] args) {
		Game game = new Game();
		game.init();//加入扑克牌
		game.shuffle();//初始化后就洗牌
		
		PlayerPlay player = new PlayerPlay();
		player.init();//加入玩家
		player.shuffle();
		player.setIdentify();
		
		if(player.getIdentify()=="地主"){
			player.show();
			game.show1();//发牌
		}else{
			player.show();
			game.show();//发牌
		}

		if(player.getIdentify()=="地主"){
			player.show();
			game.show1();//发牌
		}else{
			player.show();
			game.show();//发牌
		}
		
		if(player.getIdentify()=="地主"){
			player.show();
			game.show1();//发牌
		}else{
			player.show();
			game.show();//发牌
		}
		
	}
}
