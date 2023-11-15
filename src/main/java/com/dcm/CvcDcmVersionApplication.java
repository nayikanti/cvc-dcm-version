package com.dcm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CvcDcmVersionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CvcDcmVersionApplication.class, args);
		System.out.println("hello DCM");
	}

}
