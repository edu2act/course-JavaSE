package puke;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Random;


public class SetCard {

	public static String huase[]={"方片","梅花","红桃","黑桃"}; 
	public static String point[]={"2","3","4","5","6","7","8","9","10","j","Q","K","A"}; 
	List<Puku> PukuList = new ArrayList(); 
	public void buildCard(){ 
		for(int i=0;i<huase.length;i++){
			for(int j = 0;j<point.length;j++){ 
				Puku card = new Puku(); 
				PukuList.add(card); 
				} 
			} 
		} 
	public void randomCard(){ 
		for (int i=0;i<1000;i++){
			Random random = new Random(); 
			int a = random.nextInt(PukuList.size()); 
			int b = random.nextInt(PukuList.size());
			PukuList.get(a); 
			Puku temp = new Puku(PukuList.get(a).getHuase(),PukuList.get(a).getPoint());
			PukuList.get(a).setHuase(PukuList.get(b).getHuase()); 
			PukuList.get(a).setPoint(PukuList.get(b).getPoint()); 
			PukuList.get(b).setHuase(temp.getHuase()); 
			PukuList.get(b).setPoint(temp.getPoint()); 
			} 
		} 
	

	}



