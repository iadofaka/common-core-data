package com.linked.system.components;

import com.linked.system.response.PositionCatalogResponse;
import com.linked.system.services.PositionCatalogService;
import com.linked.system.vo.PositionCatalog;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Path("/service")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Component
public class PositionCatalogComponent {
	
	@Autowired
	PositionCatalogService positionCatalogService;
	
	@POST
	@Path("/create/position")
	public PositionCatalogResponse createPosition(PositionCatalog positionCatalog){
		PositionCatalogResponse positionCatalogResponse = new PositionCatalogResponse();
		positionCatalogService.createPosition(positionCatalog);
		 positionCatalog = positionCatalogService.findByName(positionCatalog.getPositionName());
		
		 positionCatalogResponse = new PositionCatalogResponse("0", "Is OK", true, positionCatalog);
		
		return positionCatalogResponse;
	}
	

}
