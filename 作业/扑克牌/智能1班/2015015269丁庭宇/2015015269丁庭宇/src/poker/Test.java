package poker;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Game Play=new Game();
		 Play.ValuePuke();
		 //Play.PukeValue();
		 //Play.valueList();
		 Players p1=new Players("炸",11);
		 Players p2=new Players("王炸",10);
		 Players p3=new Players("同花",13);
		 Players p4=new Players("顺子",13);
		 Play.DealCarls(p1,p2,p3,p4);
		 System.out.println(p1.getName()+"牌是");
		 for(int i=0;i<5;i++) {
			 System.out.print(p1.lin.get(i).getFloweerColor()+p1.lin.get(i).getValue()+"  ");
		 }
		 System.out.println();
		 System.out.println(p2.getName()+"牌是");
		 for(int i=0;i<5;i++) {
			 System.out.print(p2.lin.get(i).getFloweerColor()+p2.lin.get(i).getValue()+"  ");
		 }
		 System.out.println();
		 System.out.println(p3.getName()+"牌是");
		 
		 for(int i=0;i<5;i++) {
			 System.out.print(p3.lin.get(i).getFloweerColor()+p3.lin.get(i).getValue()+"  ");
		 }
		 System.out.println();
		 System.out.println(p4.getName()+"牌是");
		 
		 for(int i=0;i<5;i++) {
			 System.out.print(p4.lin.get(i).getFloweerColor()+p4.lin.get(i).getValue()+"  ");
		 }
	}

}
