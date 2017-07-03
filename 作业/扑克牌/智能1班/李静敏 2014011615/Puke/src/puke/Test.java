package puke;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game CG = new Game(); 
		Player[] player=new Player[2]; 
		for (int i =0;i<2;i++){ 
			boolean flag = true;
			while(flag){ 
				try{ 
					player[i] = CG.creatPlayer(); 
					}catch(WrongCommand e){ 
						System.out.println(e.getMessage()); 
						continue; 
						} 
				if (player[i].getName()!=null){ 
					flag = false; 
					} 
				}
		}
		SetCard SC = new SetCard(); 
		CG.Game(SC, player[0], player[1]); 
		} 
	
	}


