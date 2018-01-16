package com.linked.system;

import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class CommonCoreDataApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(CommonCoreDataApplication.class, args);
//		SpringApplicationBuilder springApplicationBuilder= 
//				(SpringApplicationBuilder) new SpringApplicationBuilder(ApplicationConfig.class)
//				.sources(ApplicationConfig.class)
//				.properties(getProperties());
//		springApplicationBuilder.run(args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder springApplicationBuilder) {
		return springApplicationBuilder
				.sources(CommonCoreDataApplication.class)
				.properties(getProperties());
	}

	static Properties getProperties() {
		Properties props = new Properties();
		props.put("spring.config.location", "file:${PROPERTIES_FILES_PATH}/application.properties");
		return props;
	}
}