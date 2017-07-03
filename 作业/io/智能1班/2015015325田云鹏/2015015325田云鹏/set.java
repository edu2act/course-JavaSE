package homework;  
  
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;  
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;  
  
public class set {  
    public static void main(String[] args) throws IOException {  
        FileWriter fw = new FileWriter("Grade.txt");    //创建成绩单
        
        /** 
         * 为了提高写入的效率，使用了字符流的缓冲区。 
         * 创建了一个字符写入流的缓冲区对象，并和指定要被缓冲的流对象相关联。 
         */  
        BufferedWriter bufw = new BufferedWriter(fw);    
          
        //使用缓冲区中的方法将数据写入到缓冲区中。  
        //分别按照姓名，语文成绩，数学成绩，外语成绩写入。
        bufw.write("1班,张三,51,61,62");  
        bufw.newLine();           
        bufw.write("2班,李四,70,71,72"); 
        bufw.newLine(); 
        bufw.write("3班,王五,80,81,82"); 
        bufw.newLine(); 
        bufw.write("4班,田云鹏,100,100,100");  
        //使用缓冲区中的方法，将数据刷新到目的地文件中去。  
        bufw.flush();  
        //关闭缓冲区,同时关闭了fw流对象  
        bufw.close();     
    } 
 
} 