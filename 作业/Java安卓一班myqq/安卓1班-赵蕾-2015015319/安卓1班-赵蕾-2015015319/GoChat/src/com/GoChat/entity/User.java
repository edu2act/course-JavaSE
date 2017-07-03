package com.GoChat.entity;

import java.util.Date;

public class User {
	private int QQnum;
	private String nickName;
	private String passWord;
	private String gender;
	private String description;
	private String ip;
	public User(String nickName,String passWord){
		this.nickName=nickName;
		this.passWord=passWord;
	}
	public User(){}
	public int getQQnum() {
		return QQnum;
	}
	public void setQQnum(int qQnum) {
		QQnum = qQnum;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
}
