package com.linked.system.components;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.linked.system.response.UserInformationResponse;
import com.linked.system.services.UserInformationService;
import com.linked.system.vo.UserInformation;

@Component
@Path("service/")
public class UserInformationComponent {
	
	@Autowired
	UserInformationService _userInformationService; 
	
	
	@POST
	@Path("/create/user")
	@Produces("application/json")
	public UserInformationResponse createUser(UserInformation userInformation){
		UserInformationResponse informationResponse = new  UserInformationResponse();
		_userInformationService.createUserInformation(userInformation);
		userInformation = (UserInformation) _userInformationService.findByAlias(userInformation.getAlias());
		informationResponse = new UserInformationResponse("0", "Is ok", true, userInformation);
		
		return informationResponse;
		
	}
	
	@GET
	@Path("/getInformation")
	public String sayHello(){
		return "Hello";
	}
}
