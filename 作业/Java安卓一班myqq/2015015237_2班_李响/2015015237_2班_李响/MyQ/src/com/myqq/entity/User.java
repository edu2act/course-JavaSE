package com.myqq.entity;

import java.util.Date;

public class User {
	private String password;
	private int qqnum;
	private String nickName;
	private String gender;
	private String introduce;
	private Date registTime;
	private String ip;
	
	
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip2) {
		this.ip = ip2;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getQqnum() {
		return qqnum;
	}
	public void setQqnum(int qqnum) {
		this.qqnum = qqnum;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
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
	public Date getRegistTime() {
		return registTime;
	}
	public void setRegistTime(Date registTime) {
		this.registTime = registTime;
	}
	
	

}
