import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyWork {
	public static void main(String[] args) {
		File src = new  File("D:/a.txt");
		//输入原始数据 分别为 学号 姓名 语文成绩 数学成绩 英语成绩
		BufferedWriter bw = null;
		 try {
			bw = new BufferedWriter(new FileWriter(src));
			bw.write("1,zhangsan,100,90,80,1");
			bw.newLine();
			bw.write("2,lisi,90,80,70,1");
			bw.newLine();
			bw.write("3,wangwu,70,49,60,1");
			bw.newLine();
			bw.write("4,zhangfei,100,90,80,2");
			bw.newLine();
			bw.write("5,zhaoyun,90,80,70,2");
			bw.newLine();
			bw.write("6,guanyu,70,49,60,1");
			bw.newLine();
			bw.flush();
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}  
		 
		 //selectDisqualified();
		// highGrade();
		 avgMathGrade();
	}
	
	/**
	 * 查询所有有不及格科目的学生姓名
	 */
	public static void selectDisqualified() {
		BufferedReader br = null;
		try {
			 br = new BufferedReader(new FileReader("D:/a.txt"));
			try {
				String str = br.readLine();
				while(str!=null) {
					String[] s = str.split(",");
					for(int i=2;i<=4;i++) {
						if(Integer.parseInt(s[i])<60) {
							System.out.println(s[1]);
							break;
						}
					}
					str = br.readLine();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(br!=null)
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}
	
	/**
	 * 查询所有90分以上学生姓名
	 */
	public static void highGrade() {
		BufferedReader br = null;
		try {
			 br = new BufferedReader(new FileReader("D:/a.txt"));
			try {
				String str = br.readLine();
				while(str!=null) {
					String[] s = str.split(",");
					if(Integer.parseInt(s[2])>90 && Integer.parseInt(s[3])>90 && Integer.parseInt(s[4])>90 ) {
						System.out.println(s[1]);
					}
					str = br.readLine();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(br!=null)
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}
	
	/**
	 * 查询各班数学平均分
	 */
	public static void avgMathGrade() {
		BufferedReader br = null;
		try {
			 br = new BufferedReader(new FileReader("D:/a.txt"));
			 
			try {
				int sum1 =0,count1=0;
				 int sum2 = 0,count2=0;
				String str = br.readLine();
				System.out.println(str);
				while(str!=null) {
					 
					String[] s = str.split(",");
					if(Integer.parseInt(s[5])==1) {
						sum1 +=  Integer.parseInt(s[3]);
						
						count1++;
						
					}
					else if(Integer.parseInt(s[5])==2) {
						sum2 += Integer.parseInt(s[3]);
						//System.out.println(sum2);
						count2++;
						
					}
					str = br.readLine();
				}
				System.out.println(sum1/count1);
				System.out.println(sum2/count2);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(br!=null)
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}
}
