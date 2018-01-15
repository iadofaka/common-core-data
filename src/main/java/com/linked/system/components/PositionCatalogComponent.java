package com.linked.system.components;

import org.springframework.stereotype.Component;

import com.linked.system.response.PositionCatalogResponse;
import com.linked.system.services.PositionCatalogService;
import com.linked.system.vo.PositionCatalog;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;


@Component
@Path("service/")
public class PositionCatalogComponent {
	
	@Autowired
	PositionCatalogService _positionCatalogService;
	
	@POST
	@Path("create/position")
	@Produces("application/json")
	public PositionCatalogResponse createPosition(PositionCatalog positionCatalog){
		PositionCatalogResponse positionCatalogResponse = new PositionCatalogResponse();
		_positionCatalogService.createPosition(positionCatalog);
		 positionCatalog = _positionCatalogService.findByName(positionCatalog.getPositionName());
		
		 positionCatalogResponse = new PositionCatalogResponse("0", "Is OK", true, positionCatalog);
		
		return positionCatalogResponse;
	}
	

}
