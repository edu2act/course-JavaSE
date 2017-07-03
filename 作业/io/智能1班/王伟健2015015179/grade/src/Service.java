import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Service {
	public ArrayList<String> getFail(){
		Dao dao = new Dao();
		dao.openFile();
		ArrayList<ArrayList> a  =new ArrayList<ArrayList>();
		ArrayList<String> b  =new ArrayList<String>();
		a=dao.search("*");
		for(int i= 0;i<a.size();i++){
			for(int j= 2;j<a.get(i).size()-1;j++){
				int k = Integer.parseInt((String) a.get(i).get(j));
				if(k<60){
					b.add((String) a.get(i).get(1));
				}else{
					continue;
				}
			}
		}
		return b;
	}
	public Set<String> getExcellent(){
		Dao dao = new Dao();
		dao.openFile();
		ArrayList<ArrayList> a  =new ArrayList<ArrayList>();
		Set<String> b  =new HashSet<String>();
		a=dao.search("*");
		for(int i= 0;i<a.size();i++){
			for(int j= 2;j<a.get(i).size()-1;j++){
				int k = Integer.parseInt((String) a.get(i).get(j));
				if(k>90){
					b.add((String) a.get(i).get(1));
				}else{
					continue;
				}
			}
		}
		
		return b;
	}
	public Set<String> getAvgClass(){
		Dao dao = new Dao();
		dao.openFile();
		ArrayList<ArrayList> a  =new ArrayList<ArrayList>();
		Set<String> b  =new HashSet<String>();
		a=dao.search("*");
		Map<String,Integer> mp=new HashMap();
		for(int i= 0;i<a.size();i++){
			String cs = (String) a.get(i).get(5);
			if(mp.containsKey(cs)){			
				mp.put(cs,mp.get("cs")+Integer.parseInt((String) a.get(i).get(3))); 
			}else{
				mp.put(cs,Integer.parseInt((String) a.get(i).get(3)));
			}
		}

		return b;
	}
	public void search(String s){
		Dao dao = new Dao();
		dao.openFile();
		System.out.println("学号\t|姓名\t|数学\t|语文\t|英语\t|班级");
		for(ArrayList<String> a:dao.search(s)){
			
			for(String sr: a){
				System.out.print(sr+"\t|");
			}
			System.out.println();
		}
	}
}
