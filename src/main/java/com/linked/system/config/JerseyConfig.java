package com.linked.system.config;


import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.linked.system.components.PositionCatalogComponent;
import com.linked.system.components.UserInformationComponent;

@Component
public class JerseyConfig extends ResourceConfig{
	
	public JerseyConfig(){
		register(PositionCatalogComponent.class);
		register(UserInformationComponent.class);
	}

}
