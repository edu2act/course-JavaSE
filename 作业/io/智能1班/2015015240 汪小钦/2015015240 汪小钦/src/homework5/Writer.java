package homework5;
import java.io.*;

public class Writer {
	
	public static void student(BufferedWriter bw,String classno , String name,String math,
			String eng) throws IOException {
		bw.write(classno);
		bw.write(",");
		bw.write(name);
		bw.write(",");
		bw.write(math);
		bw.write(",");
		bw.write(eng);
		bw.newLine();
	}
	//查询所有有不及格科目的学生姓名
	public static void faliStudent(BufferedReader br)throws IOException{
		br=null;
		try{
			br=new BufferedReader(new FileReader("f:/a.txt"));
			String line=br.readLine();
			while(line!=null){
				String [] s=line.split(",");
				for(int i=2;i<s.length;i++){
					if(Integer.parseInt(s[i])<60){
						System.out.println(s[1]);
						break;
					}
				}
				line=br.readLine();
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(br!=null)
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
	//查询所有90分以上学生姓名，
	public static void goodStudent(BufferedReader br) throws IOException {
		String goodline = br.readLine();
		while(goodline != null) {
			String[] goods = goodline.split(",");
			for(int i = 2; i < goods.length; i ++) {
				if( Integer.parseInt(goods[i]) >= 90) {
					System.out.println(goods[1]);
					break;
				}
			}
			
			goodline = br.readLine();
		}
	}
	
	//查询各班数学平均分
	public static void mathAvg(int i, BufferedReader brr) throws IOException {
		String mathline = brr.readLine();
		int sum = 0;
		int count= 0;
		while(mathline != null) {
			String[] maths = mathline.split(",");
			if( Integer.parseInt(maths[0]) == i ) {
				sum += Integer.parseInt(maths[2]);
				count ++;
			}
			mathline = brr.readLine();
		}
		try{
			int avg = sum/count;
			System.out.println( i + "班数学 平均分为：" + avg);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
		
	
//}



