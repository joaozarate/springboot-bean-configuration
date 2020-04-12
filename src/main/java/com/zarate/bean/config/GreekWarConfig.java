package com.zarate.bean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zarate.bean.notification.GreekWarNotification;

@Configuration
public class GreekWarConfig {

	@Bean //The bean's name will be greekWarNotification
	public GreekWarNotification greekWarNotification() {

		GreekWarNotification notification = new GreekWarNotification("Greeks troops began a massacre of tens of thousands of Greeks on the island of Chios");
		notification.setWho("Ottoman troops");

		return notification;

	}

}
