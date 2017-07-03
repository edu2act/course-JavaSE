package com.MYQQ.entity;
import java.util.Date;
public class user {
	private int qqnum;//qq号
	private String name;//昵称
	private String password;//密码
	private Date time;//创建时间
	private String sex;//性别
	private String introduce;//个人简介
	private String ip;//ip
	public int getQqnum() {
		return qqnum;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public void setQqnum(int qqnum) {
		this.qqnum = qqnum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

}
