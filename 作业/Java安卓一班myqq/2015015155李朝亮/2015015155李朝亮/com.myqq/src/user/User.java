package user;

import java.util.Date;

public class User {
	public User(){};
	public User(int qqNum, String nickName, String passWord, Date registTime, String gender, String introduce) {
		super();
		this.qqNum = qqNum;
		this.nickName = nickName;
		this.passWord = passWord;
		this.registTime = registTime;
		this.gender = gender;
		this.introduce = introduce;
	}
	private int qqNum;
	private String nickName;
	private String passWord;
	private Date registTime;
	private String gender;
	private String introduce;
	public int getqqNum() {
		return qqNum;
	}
	public void setqqNum(int qqNum) {
		this.qqNum = qqNum;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public Date getRegistTime() {
		return registTime;
	}
	public void setRegistTime(Date registTime) {
		this.registTime = registTime;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
}

