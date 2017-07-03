package com.myqq.entity;

import java.io.Serializable;
import java.util.Date;

public class Message implements Serializable{
	public Message() {
	};
	public Message(int id, String content, int sender, int receiver, Date sendTime, Date receiveTime, int state) {
		super();
		this.id = id;
		this.content = content;
		this.sender = sender;
		this.receiver = receiver;
		this.sendTime = sendTime;
		this.receiveTime = receiveTime;
		this.state = state;
	}
	private int id;
	private String content;
	private int sender;
	private int receiver;
	private Date sendTime;
	private Date receiveTime;
	private int state;
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
	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}
	public Date getReceiveTime() {
		return receiveTime;
	}
	public void setReceiveTime(Date receiveTime) {
		this.receiveTime = receiveTime;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public static long getSerialversionuid() {
		return getSerialversionuid();
	}
}
