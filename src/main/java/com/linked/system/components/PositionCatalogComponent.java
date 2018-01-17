package com.linked.system.components;

import com.linked.system.enums.ReturnCodes;
import com.linked.system.response.PositionCatalogResponse;
import com.linked.system.services.PositionCatalogService;
import com.linked.system.vo.PositionCatalog;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author Ing Fabian Carvajal Acolt 
 * @version 1.0.0
 * @since Enero 2018
 *
 */
@Path("/position")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Component
public class PositionCatalogComponent {

	@Autowired
	PositionCatalogService positionCatalogService;

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@POST
	@Path("/create")
		public PositionCatalogResponse createPosition(PositionCatalog positionCatalog){
		PositionCatalogResponse positionCatalogResponse = new PositionCatalogResponse();
		logger.info("New name position: " + positionCatalog.getPositionName());
		try {
			PositionCatalog positionCatalogResult = positionCatalogService
					.findByPositionName(positionCatalog.getPositionName());
			if(positionCatalogResult == null){
				positionCatalogService.createPosition(positionCatalog);
				positionCatalogResult = positionCatalogService
						.findByPositionName(positionCatalog.getPositionName());
				positionCatalogResponse = new PositionCatalogResponse(
						ReturnCodes.SUCCESFULL_RESPONSE.getCode()
						,ReturnCodes.SUCCESFULL_RESPONSE.getMessage()
						,true
						,positionCatalogResult);
			}else{
				positionCatalogResponse = new PositionCatalogResponse(
						ReturnCodes.POSITION_EXIST.getCode()
						,ReturnCodes.POSITION_EXIST.getMessage()
						,true
						,positionCatalogResult);
			}	
		} catch (Exception e) {
			positionCatalogResponse = new PositionCatalogResponse("-1", "Error: " + e.getMessage(), false);
		}
		return positionCatalogResponse;
	}
	
	@GET
	@Path("/find/{positionName}")
	public PositionCatalogResponse findPositionName(@PathParam("positionName") String positionName){
		PositionCatalogResponse positionCatalogResponse = new PositionCatalogResponse();
		logger.info("Find position name: " + positionName);
		try {
			PositionCatalog positionCatalog = positionCatalogService.findByPositionName(positionName);
			if(positionCatalog != null){
				positionCatalogResponse = new PositionCatalogResponse(
						ReturnCodes.SUCCESFULL_RESPONSE.getCode()
						,ReturnCodes.SUCCESFULL_RESPONSE.getMessage()
						,true
						,positionCatalog);
			}else{
				positionCatalogResponse = new PositionCatalogResponse(
						ReturnCodes.POSITION_NOT_EXIST.getCode()
						,ReturnCodes.POSITION_NOT_EXIST.getMessage()
						,true);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return positionCatalogResponse;
	}
	
	@GET
	@Path("/findList/isActive/{isActive}")
	public PositionCatalogResponse findByIsActive(@PathParam("isActive") Boolean isActive){
		PositionCatalogResponse positionCatalogResponse = new PositionCatalogResponse();
		try {
			List<PositionCatalog> positionsCatalog = positionCatalogService.findByIsActive(isActive);
			if(positionsCatalog.size() > 0){
				positionCatalogResponse = new PositionCatalogResponse(
						ReturnCodes.SUCCESFULL_RESPONSE.getCode()
						,ReturnCodes.SUCCESFULL_RESPONSE.getMessage()
						,true
						,positionsCatalog);
			}else{
				positionCatalogResponse = new PositionCatalogResponse(
						ReturnCodes.THERE_ARE_NOT_RESULTS.getCode()
						,ReturnCodes.THERE_ARE_NOT_RESULTS.getMessage()
						,true);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return positionCatalogResponse;
	}
	
	@GET
	@Path("/findAll")
	public PositionCatalogResponse findAllPositions(){
		PositionCatalogResponse positionCatalogResponse = new PositionCatalogResponse();
		try {
			Iterable<PositionCatalog> iterable = positionCatalogService.findAll();
			if(iterable != null){
				positionCatalogResponse = new PositionCatalogResponse(
						ReturnCodes.SUCCESFULL_RESPONSE.getCode()
						,ReturnCodes.SUCCESFULL_RESPONSE.getMessage()
						,true
						,iterable);
			}else{
				positionCatalogResponse = new PositionCatalogResponse(
						ReturnCodes.THERE_ARE_NOT_RESULTS.getCode()
						,ReturnCodes.THERE_ARE_NOT_RESULTS.getMessage()
						,true);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return positionCatalogResponse;
	}
	
	@PUT
	@Path("/lockPosition")
	public PositionCatalogResponse lockPosition(PositionCatalog positionCatalog){
		PositionCatalogResponse positionCatalogResponse = new PositionCatalogResponse();
		try {
			PositionCatalog findPositionResult = positionCatalogService
					.findByPositionName(positionCatalog.getPositionName());
			if(findPositionResult != null){
				positionCatalogService.lockPosition(findPositionResult);
				positionCatalogResponse = new PositionCatalogResponse(
						ReturnCodes.SUCCESFULL_RESPONSE.getCode()
						,ReturnCodes.SUCCESFULL_RESPONSE.getMessage()
						,true
						,findPositionResult);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return positionCatalogResponse;
	}
	
	@PUT
	@Path("/unLockPosition")
	public PositionCatalogResponse unLockPosition(PositionCatalog positionCatalog){
		PositionCatalogResponse positionCatalogResponse = new PositionCatalogResponse();
		try {
			PositionCatalog findPositionResult = positionCatalogService
					.findByPositionName(positionCatalog.getPositionName());
			if(findPositionResult != null){
				positionCatalogService.unLockPosition(findPositionResult);
				positionCatalogResponse = new PositionCatalogResponse(
						ReturnCodes.SUCCESFULL_RESPONSE.getCode()
						,ReturnCodes.SUCCESFULL_RESPONSE.getMessage()
						,true
						,findPositionResult);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return positionCatalogResponse;
	}
}