package com.linked.system.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linked.system.repository.UserInformationRepository;
import com.linked.system.services.UserInformationService;
import com.linked.system.vo.UserInformation;

/**
 * 
 * @author Ing Fabian Carvajal Acolt 
 * @version 1.0.0
 * @since Enero 2018
 *
 */
@Service
public class UserInformationServiceImpl implements UserInformationService{

	@Autowired
	private UserInformationRepository userInformationRepository;

	@Override
	public Iterable<UserInformation> findAll() {
		return userInformationRepository.findAll();
	}

	@Override
	public List<UserInformation> findByName(String name) {
		return userInformationRepository.findByName(name);
	}

	@Override
	public List<UserInformation> findByNameAndLastName(String name, String lastName) {
			return userInformationRepository.findByNameAndLastName(name, lastName);
	}

	@Override
	public List<UserInformation> findByIsActive(Boolean isActive) {
		return userInformationRepository.findByIsActive(isActive);
	}

	@Override
	public void createUserInformation(UserInformation userInformation) {
		java.util.Date date = new java.util.Date();
		java.sql.Timestamp dateTime = new java.sql.Timestamp( date.getTime() );
		UserInformation user = userInformationRepository.findByAlias(userInformation.getAlias());
		if(user == null){

		}else{
			userInformation.setDateRegistry(dateTime);
			userInformation.setDateRegistryUpdate(dateTime);
			userInformation.setActive(true);
			userInformationRepository.save(userInformation);
		}
	}

	@Override
	public void updateUserInformation(UserInformation userInformation) {
		java.util.Date date = new java.util.Date();
		java.sql.Timestamp dateTime = new java.sql.Timestamp( date.getTime() );
		userInformation.setDateRegistryUpdate(dateTime);
		userInformationRepository.save(userInformation);
	}

	@Override
	public void lockUserInformation(UserInformation userInformation) {
		java.util.Date date = new java.util.Date();
		java.sql.Timestamp dateTime = new java.sql.Timestamp( date.getTime() );
		userInformation.setDateRegistryUpdate(dateTime);
		userInformation.setActive(false);
		userInformationRepository.save(userInformation);

	}

	@Override
	public void unLockUserInformation(UserInformation userInformation) {
		java.util.Date date = new java.util.Date();
		java.sql.Timestamp dateTime = new java.sql.Timestamp( date.getTime() );
		userInformation.setDateRegistryUpdate(dateTime);
		userInformation.setActive(true);
		userInformationRepository.save(userInformation);
	}

	@Override
	public UserInformation findByAlias(String alias) {
		return userInformationRepository.findByAlias(alias);
	}
}
