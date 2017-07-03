package tb;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;

public class Stream {
	BufferedReader br = null;
	BufferedWriter bw = null;
	int sum;
	int count;
	/**
	 * @param 学号，姓名，班级，数学，语文，外语
	 * @return void
	 */
	public void writeIn(String s) {
		try {
			LinkedList<String> link = new LinkedList<String>();
			br = new BufferedReader(new FileReader("F:/Java/a.txt"));
			if (br != null) {
				String line = br.readLine();
				while (line != null) {
					link.add(line);
					line = br.readLine();
				}
			}
			bw = new BufferedWriter(new FileWriter("F:/Java/a.txt"));
			for (String i : link) {
				bw.write(i);
				bw.newLine();
			}
			bw.write(s);
			bw.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (bw != null)
				try {
					bw.flush();
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}

	/**
	 * 按照学号删除数据
	 * @param int学号
	 * @return void
	 */
	public void delete(String a) {
		try {
			LinkedList<String> link = new LinkedList<String>();
			br = new BufferedReader(new FileReader("F:/Java/a.txt"));
			if (br != null) {
				String line = br.readLine();
				while (line != null) {
					String[] s = line.split(",");
					if (s[0].equals(a)) {
						System.out.println("1");
						line = br.readLine();
					}
					link.add(line);
					line = br.readLine();
				}
			}
			bw = new BufferedWriter(new FileWriter("F:/Java/a.txt"));
			for (String i : link) {
				if (!link.isEmpty()) {
					bw.write(i);
					bw.newLine();
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (bw != null)
				try {
					bw.flush();
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}

	/**
	 * 按照学号修改某一行的数据
	 * @param 学号，姓名，班级，数学，语文，外语
	 * @return void
	 */
	public void revise(String a) {
		try {
			LinkedList<String> link = new LinkedList<String>();
			br = new BufferedReader(new FileReader("F:/Java/a.txt"));
			if (br != null) {
				String line = br.readLine();
				while (line != null) {
					String[] s = line.split(",");
					String[] n = a.split(",");
					if (s[0].equals(n[0])) {
						line = br.readLine();
						link.add(a);
					}
					link.add(line);
					line = br.readLine();
				}
			}
			bw = new BufferedWriter(new FileWriter("F:/Java/a.txt"));
			for (String i : link) {
				bw.write(i);
				bw.newLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (bw != null)
				try {
					bw.flush();
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}

	/**
	 * 查询所有有不及格科目的学生姓名
	 * @param void
	 * @return name Map类型键为学号值为姓名
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public HashMap<Integer, String> failStudent() {
		try {
			HashMap failStudent = new HashMap<Integer, String>();
			br = new BufferedReader(new FileReader("F:/Java/a.txt"));
			String line = br.readLine();
			// 通过循环，找到该学生
			while (line != null) {
				String[] s = line.split(",");
				if (Integer.parseInt(s[3]) < 60 || Integer.parseInt(s[4]) < 60 || Integer.parseInt(s[5]) < 60) {
					failStudent.put(Integer.parseInt(s[0]), s[1]);
				}
				line = br.readLine();
			}
			return failStudent;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} finally {
			if (br != null)
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

	}

	/**
	 * 查询所有90分以上学生姓名
	 * @param void
	 * @return void
	 */
	public void greaterThan90() {
		try {
			br = new BufferedReader(new FileReader("F:/Java/a.txt"));
			String line = br.readLine();
			while (line != null) {
				String[] s = line.split(",");
				if (Integer.parseInt(s[3]) > 90 || Integer.parseInt(s[4]) > 90 || Integer.parseInt(s[5]) > 90) {
					System.out.println(s[1]);
				}
				line = br.readLine();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (br != null)
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

	}

	/**
	 * 查询各班数学平均分
	 * @param 一共有多少个班
	 * @return 整形数组 存放数学平均成绩
	 */
	public int[] avgMath(int n) {
		try {
			int[] avg = new int[n];
			for (int i = 1; i <= n; i++) {
				br = new BufferedReader(new FileReader("F:/Java/a.txt"));
				sum = 0;
				count = 0;
				String line = br.readLine();
				while (line != null) {
					String[] s = line.split(",");
					if (Integer.parseInt(s[2]) == i) {
						sum = sum + Integer.parseInt(s[3]);
						count = count + 1;
					}
					line = br.readLine();
				}
				if (count != 0) {
					avg[i - 1] = sum / count;
				} else {
					avg[i - 1] = 0;
				}
			}
			return avg;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} finally {
			if (br != null)
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}

}
