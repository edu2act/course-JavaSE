package puKe;

public class Test {

	public static void main(String[] args) {
		 YouXi Play=new YouXi();
		 Play.xh();
		 Players player1=new Players("张三",11);
		 Players player2=new Players("李四",10);
		 Players player3=new Players("王五",13);
		 Play.DealCarls(player1, player2, player3);
		 System.out.println(player1.getName()+"牌是");
		 for(int i=0;i<3;i++) {
			 System.out.print(player1.lin.get(i).getFloweerColor()+player1.lin.get(i).getValue()+"  ");
		 }
		 System.out.println();
		 System.out.println(player2.getName()+"牌是");
		 for(int i=0;i<3;i++) {
			 System.out.print(player2.lin.get(i).getFloweerColor()+player2.lin.get(i).getValue()+"  ");
		 }
		 System.out.println();
		 System.out.println(player3.getName()+"牌是");
		 
		 for(int i=0;i<3;i++) {
			 System.out.print(player3.lin.get(i).getFloweerColor()+player3.lin.get(i).getValue()+"  ");
		 }
	}
}
