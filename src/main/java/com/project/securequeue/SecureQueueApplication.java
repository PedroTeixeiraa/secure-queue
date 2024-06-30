package com.project.securequeue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.project.securequeue")
public class SecureQueueApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecureQueueApplication.class, args);
	}

}
