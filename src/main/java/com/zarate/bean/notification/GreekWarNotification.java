package com.zarate.bean.notification;

public class GreekWarNotification {

	private String message;

	private String who;

	public GreekWarNotification(String message) {
		this.message = message;
	}

	public void notifyMessage() {
		System.out.printf("Notifying %s with the message:\n%s", who, message);
	}

	public void setWho(String who) {
		this.who = who;
	}

}
