package stu;
/**
 * 测试 （学生文件信息在D盘）
 * @author 高明健
 */
public class TestStu {

	public static void main(String[] args) {
		stuMark m=new stuMark();
		Change c=new Change();
		addstu a=new addstu();
		m.StuMark();
		c.changeStu("001","007,aaa,1,100,40,20");
		m.StuMark();
	}

}
