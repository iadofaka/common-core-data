package com.linked.system.config;

import java.util.Random;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * 
 * @author Ing Fabian Carvajal Acolt 
 * @version 1.0.0
 * @since Enero 2018
 *
 */
@Component
public class HealthCheck implements HealthIndicator{

	private Random random =  new Random();
	
	@Override
	public Health health() {
		int errorCode = check(); // perform some specific health check
		if (errorCode != 0) {
			return Health.down()
					.withDetail("Error Code", errorCode).build();
		}
		return Health.up().build();
	}

	public int check() {
		int result = 0;
		
		if(random.nextBoolean()){
			result = 42;
		}
		return result;
	}
}