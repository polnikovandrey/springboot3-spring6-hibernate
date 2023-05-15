package com.mcfly.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBootApplication scans a package of the own class (MyApplication.class) and all "sub-packages".
 * To use beans outside the own class package the "scanBasePackages" property should be used.
 */
@SpringBootApplication(scanBasePackages = { "com.mcfly.myapp", "com.mcfly.common" })
public class MyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyApplication.class, args);
	}

}
