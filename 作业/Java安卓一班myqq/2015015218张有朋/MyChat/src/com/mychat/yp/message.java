package com.mychat.yp;

import java.io.Serializable;
import java.util.Date;

public class message implements Serializable{
	
	private int id;
	private String content;
	private int sender;
	private int receiver;
	private Date sentTime;
	private Date receiveTime;
	private int state;
	
	public message(int id, String content, int sender, int receiver, Date sentTime, Date receiveTime, int state) {
		super();
		this.id = id;
		this.content = content;
		this.sender = sender;
		this.receiver = receiver;
		this.sentTime = sentTime;
		this.sentTime = receiveTime;
		this.state = state;
	}
	public message(int type) {
		super();
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
	public Date getSentTime() {
		return sentTime;
	}
	public void setSentTime(Date sentTime) {
		this.sentTime = sentTime;
	}
	public Date getReceiveTime() {
		return sentTime;
	}
	public void setReceiveTime(Date receiveTime) {
		this.sentTime = receiveTime;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
}
