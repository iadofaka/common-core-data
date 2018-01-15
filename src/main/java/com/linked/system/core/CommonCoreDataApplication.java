package com.linked.system.core;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class CommonCoreDataApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		new CommonCoreDataApplication()
		.configure(new SpringApplicationBuilder(CommonCoreDataApplication.class))
		.run(args);
	}
}
