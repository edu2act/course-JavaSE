package com.GoChat.entity;

import java.io.Serializable;
import java.util.Date;

public class Message implements Serializable{
	private int id;
	private String content;
	private int sender;
	private int recevier;
	private Date sendTime;
	private Date reciveTime;
	private int state;
	public Message(){
		
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
	public int getRecevier() {
		return recevier;
	}
	public void setRecevier(int recevier) {
		this.recevier = recevier;
	}
	public Date getSendTime() {
		return sendTime;
	}
	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}
	public Date getReciveTime() {
		return reciveTime;
	}
	public void setReciveTime(Date reciveTime) {
		this.reciveTime = reciveTime;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
}
