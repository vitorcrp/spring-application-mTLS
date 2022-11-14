package com.mtlsapplication.webhookserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class WebhookserverApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(WebhookserverApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(WebhookserverApplication.class);
	}

}
