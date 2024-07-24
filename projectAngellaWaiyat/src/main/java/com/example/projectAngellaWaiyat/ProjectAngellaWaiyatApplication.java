package com.example.projectAngellaWaiyat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScan("com.example.projectAngellaWaiyat.controller")
public class ProjectAngellaWaiyatApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectAngellaWaiyatApplication.class, args);
	}

}
