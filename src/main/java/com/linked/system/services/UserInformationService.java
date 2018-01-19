package com.linked.system.services;

import java.util.List;

import com.linked.system.vo.UserInformation;

/**
 * 
 * @author Ing Fabian Carvajal Acolt 
 * @version 1.0.0
 * @since Enero 2018
 *
 */
public interface UserInformationService {

	Iterable<UserInformation> findAll();
	List<UserInformation> findByName(String name);
	List<UserInformation> findByNameAndLastName(String name, String lastName);
	List<UserInformation> findByIsActive(Boolean isActive);
	UserInformation findByAlias(String alias);
	void createUserInformation(UserInformation userInformation);
	void updateUserInformation(UserInformation userInformation);
	void lockUserInformation(UserInformation userInformation);
	void unLockUserInformation(UserInformation userInformation);
	
}
