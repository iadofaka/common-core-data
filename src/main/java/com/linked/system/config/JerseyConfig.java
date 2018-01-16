package com.linked.system.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.linked.system.components.PositionCatalogComponent;
import com.linked.system.components.UserInformationComponent;

/**
 * 
 * @author Ing Fabian Carvajal Acolt 
 * @version 1.0.0
 * @since Enero 2018
 *
 */
@Component
public class JerseyConfig extends ResourceConfig{
	
	public JerseyConfig(){
		register(UserInformationComponent.class);
		register(PositionCatalogComponent.class);
	}
}