package poker;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Game Play=new Game();
		Play.f();
		 //Play.PukeValue();
		 //Play.valueList();
		 Players player1=new Players("张三",11);
		 Players player2=new Players("李四",10);
		 Players player3=new Players("王五",13);
		 Play.DealCarls(player1, player2, player3);
		 
		 System.out.println(player1.getName()+"牌是");
		 for(int i=0;i<3;i++) {
			 System.out.print(player1.lin.get(i).getFlowerColor()+player1.lin.get(i).getValue()+"  ");
		 }
		 System.out.println();
		 
		 System.out.println(player2.getName()+"牌是");
		 for(int i=0;i<3;i++) {
			 System.out.print(player2.lin.get(i).getFlowerColor()+player2.lin.get(i).getValue()+"  ");
		 }
		 System.out.println();
		 
		 System.out.println(player3.getName()+"牌是");	 
		 for(int i=0;i<3;i++) {
			 System.out.print(player3.lin.get(i).getFlowerColor()+player3.lin.get(i).getValue()+"  ");
		 }
	}

}
