package com.MyQQ.entity;

import java.util.Date;

public class User {
	private int qqNum;
	private String nickName;
	private String password;
	private Date regitstTime;
	private String gender;
	private String introduce;
	private String ip;
	
	
	
	public int getQqNum() {
		return qqNum;
	}
	public void setQqNum(int qqNum) {
		this.qqNum = qqNum;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getRegitstTime() {
		return regitstTime;
	}
	public void setRegitstTime(Date regitstTime) {
		this.regitstTime = regitstTime;
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
	public String getip() {
		return ip;
	}
	public void setIP(String ip) {
		this.ip = ip;
	}
}
