package com.zarate.bean.service;

import org.springframework.stereotype.Component;

import com.zarate.bean.notification.GreekWarNotification;

@Component
public class GreekWarService {

	private GreekWarNotification notification;

	// Injection occur via constructor
	public GreekWarService(GreekWarNotification notification) {
		this.notification = notification;
	}

	public void notifyMessage() {
		notification.notifyMessage();
	}

}
