package com.bean;

import java.io.Serializable;
import java.util.Date;


public class Message implements Serializable{
	private int id;
	private String content;
	private int sender;
	private int receiver;
	private Date sendTime;
	private int state;//状态
	
	public Message() {
		
		// TODO Auto-generated constructor stub
	}
	public Message(int id, String content, int sender, int receiver,
			Date sendTime, int state) {
		this.id = id;
		this.content = content;
		this.sender = sender;
		this.receiver = receiver;
		this.sendTime = sendTime;
		this.state = state;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getSender() {
		return sender;
	}
	public void setSender(int sender) {
		this.sender = sender;
	}
	public int getReceiver() {
		return receiver;
	}
	public void setReceiver(int receiver) {
		this.receiver = receiver;
	}
	public Date getSendTime() {
		return sendTime;
	}
	public void setSendTime(Date date) {
		this.sendTime = date;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
}

