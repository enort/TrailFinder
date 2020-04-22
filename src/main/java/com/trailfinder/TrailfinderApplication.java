package com.trailfinder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class TrailfinderApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrailfinderApplication.class, args);
	}

}
