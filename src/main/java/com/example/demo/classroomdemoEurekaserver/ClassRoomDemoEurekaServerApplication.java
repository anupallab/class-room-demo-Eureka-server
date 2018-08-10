package com.example.demo.classroomdemoEurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ClassRoomDemoEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClassRoomDemoEurekaServerApplication.class, args);
	}
}
