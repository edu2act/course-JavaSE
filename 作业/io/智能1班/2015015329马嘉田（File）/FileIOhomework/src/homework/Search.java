package homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Search {



	public static void main(String[] args) {
		File f = new File("E:/51CTO/Java/Grade.txt");
		try {
			InputStream is = new FileInputStream(f);
			BufferedReader bf = new BufferedReader(new InputStreamReader(is));

			String str = bf.readLine();

			while (str != null) {

				String[] s = str.split(",");

				for (int i = 2; i <= 4; i++) { 
					if (Integer.parseInt(s[i]) < 60) {
						System.out.println("有不及格科目的学生: " + str);
						break;
					}
					if (Integer.parseInt(s[i]) > 90) {
						System.out.println("90分以上的学生: " + str);
						break;

					}
				}

				str = bf.readLine();

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		avg();
	}

	public static void avg() {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("E:/51CTO/Java/Grade.txt"));

			try {
				int sum1 = 0;
				String str = br.readLine();

				while (str != null) {

					String[] s = str.split(",");

					sum1 += Integer.parseInt(s[3]);

					str = br.readLine();
				}
				System.out.println("数学平均分:  " + sum1 / 4);

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (br != null)
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}

}
