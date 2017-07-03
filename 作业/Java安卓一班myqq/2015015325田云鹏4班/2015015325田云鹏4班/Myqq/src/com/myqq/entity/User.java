package com.myqq.entity;

import java.util.Date;

public class User {
	
	private int qqNum;
	private String nickName;
	private String password;
	private Date registTime;
	private String gender;
	private String introuduce;
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
	public String getIntrouduce() {
		return introuduce;
	}
	public void setIntrouduce(String introuduce) {
		this.introuduce = introuduce;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
}
