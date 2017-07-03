package com.MYQQ.entity;
import java.io.Serializable;
import java.util.Date;
public class message implements Serializable{
	private int id;//消息的流水号
	private String content;//消息的内容
	private int sender;//消息的发送者
	private int receiver;//消息 的接受者
	private Date sendTime;//消息的发送时间
	private Date receiveTime;//消息的接收时间
	private int state;//消息的状态。已读，删除，撤回
	public message(){}
	public message(int id,String content,int sender,int receiver,Date sendTime,Date receiveTime,int state){
		this.id=id;
		this.content=content;
		this.sender=sender;
		this.receiver=receiver;
		this.sendTime=sendTime;
		this.receiveTime=receiveTime;
		this.state=state;
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
	public Date getSendtime() {
		return sendTime;
	}
	public void setSendtime(Date sendtime) {
		this.sendTime = sendtime;
	}
	public Date getReceivetime() {
		return receiveTime;
	}
	public void setReceivetime(Date receivetime) {
		this.receiveTime = receivetime;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
}
