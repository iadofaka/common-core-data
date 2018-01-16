package com.linked.system.components;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.linked.system.response.UserInformationResponse;
import com.linked.system.services.UserInformationService;
import com.linked.system.vo.UserInformation;

/**
 * 
 * @author Ing Fabian Carvajal Acolt 
 * @version 1.0.0
 * @since Enero 2018
 *
 */
@Path("/user")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Component
public class UserInformationComponent {
	
	@Autowired
	UserInformationService userInformationService; 
	
	
	@POST
	@Path("/create")
	public UserInformationResponse createUser(UserInformation userInformation){
		UserInformationResponse informationResponse = new  UserInformationResponse();
		userInformationService.createUserInformation(userInformation);
		userInformation = (UserInformation) userInformationService.findByAlias(userInformation.getAlias());
		informationResponse = new UserInformationResponse("0", "Is ok", true, userInformation);
		
		return informationResponse;
		
	}
	
	@GET
	public String sayHello(){
		System.out.println("Entró al sistema");
		return "{\"username\":\"raidentrance\"}";
	}
}
