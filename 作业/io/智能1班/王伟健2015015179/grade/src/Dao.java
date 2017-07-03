import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Dao {
	private static final String PATH = "d:/Test.txt";
	public BufferedReader openFile(){
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(PATH));
			return br;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	public void closeStream(BufferedReader br){
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	public ArrayList<ArrayList> search(String s){
		BufferedReader br=this.openFile();
		String line;
		
		ArrayList<ArrayList> b  = new ArrayList<ArrayList>();
		
		try {
			line = br.readLine();
			while(line!=null){
				ArrayList<String> a  = new ArrayList<String>();
				if(s.equals("*")){					
					String[] sr = line.split(",");
					for(int i = 0 ; i<sr.length;i++ ){
						a.add(sr[i]);
					}
					line=br.readLine();	
					b.add(a);
				}else{
					String[] sr = line.split(",");
					if(line.contains(s)){
						for(int i = 0 ; i<sr.length;i++ ){
							a.add(sr[i]);
						}
						line=br.readLine();	
						b.add(a);
					}else{
						line=br.readLine();
						continue;						
					}
				}			
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return b;
	}
	public void update(){
		BufferedWriter bw;
		try {
			bw = new BufferedWriter(new FileWriter(PATH));
			
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
