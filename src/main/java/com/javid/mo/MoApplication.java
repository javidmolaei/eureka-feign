package com.javid.mo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoApplication.class, args);
	}

}
