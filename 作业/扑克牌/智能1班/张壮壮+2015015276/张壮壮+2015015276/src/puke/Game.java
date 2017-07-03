package puke;

import java.util.ArrayList;

public class Game {
	private ArrayList<PuKu> list =new ArrayList<PuKu>();
	public void dispatchPuKe(){
		for(int i=0 ;i<list.size();i++){
			PuKu p = (PuKu) list.get(i);
			System.out.println(p.FlowerColor+p.Number);
		}
	}
}
