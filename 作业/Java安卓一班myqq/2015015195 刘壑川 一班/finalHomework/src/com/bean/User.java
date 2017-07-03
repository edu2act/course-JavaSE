package com.bean;

public class User {
	//用户ID
	private String id;
	// 用户昵称 
	private String nickName;
	//用户账号 
	private int qqNum;
	//用户密码
	private String password;
	//用户性别
	private String userSex;
	//用户IP
	private String ip;
	public User() {
		
	}
	
	public User(String id, String nickName) {
		this.id = id;
		this.nickName = nickName;
	}

	public User(int qqNum, String nickName) {
		this.nickName = nickName;
		this.qqNum = qqNum;
	}
	
	public User(String id, int qqNum, String nickName,String userSex ,String password) {
		this.id = id;
		this.nickName = nickName;
		this.qqNum = qqNum;
		this.userSex = userSex;
		this.password = password;
	}
	public User(String id, int qqNum, String nickName,String userSex ,String password,String ip) {
		this.id = id;
		this.nickName = nickName;
		this.qqNum = qqNum;
		this.userSex = userSex;
		this.password = password;
		this.ip = ip;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getQQNum() {
		return qqNum;
	}

	public void setQQNum(int qqNum) {
		this.qqNum = qqNum;
	}
	
	
	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	
	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
	
}
