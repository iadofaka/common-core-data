/**
 * 
 */
package com.linked.system.services.impl;

import java.util.List;

import com.linked.system.repository.UserInformationRepository;
import com.linked.system.services.UserInformationService;
import com.linked.system.vo.UserInformation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Ing. Fabian Carvajal Acolt
 *
 */
public class UserInformationServiceImpl implements UserInformationService {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private UserInformationRepository userInformationRepository;

	/* (non-Javadoc)
	 * @see com.linked.system.services.UserInformationService#findAll()
	 */
	@Override
	public Iterable<UserInformation> findAll() {
		logger.info("Find all position");
		return userInformationRepository.findAll();
	}

	/* (non-Javadoc)
	 * @see com.linked.system.services.UserInformationService#findByName(java.lang.String)
	 */
	@Override
	public List<UserInformation> findByName(String name) {
		return userInformationRepository.findByName(name);
	}

	/* (non-Javadoc)
	 * @see com.linked.system.services.UserInformationService#findByNameAndLastName(java.lang.String, java.lang.String)
	 */
	@Override
	public List<UserInformation> findByNameAndLastName(String name, String lastName) {
		return userInformationRepository.findByNameAndLastName(name, lastName);
	}

	/* (non-Javadoc)
	 * @see com.linked.system.services.UserInformationService#findByIsActive(java.lang.Boolean)
	 */
	@Override
	public List<UserInformation> findByIsActive(Boolean isActive) {
		return userInformationRepository.findByIsActive(isActive);
	}

	/* (non-Javadoc)
	 * @see com.linked.system.services.UserInformationService#findByAlias(java.lang.String)
	 */
	@Override
	public UserInformation findByAlias(String alias) {
		return userInformationRepository.findByAlias(alias);
	}

	/* (non-Javadoc)
	 * @see com.linked.system.services.UserInformationService#createUserInformation(com.linked.system.vo.UserInformation)
	 */
	@Override
	public void createUserInformation(UserInformation userInformation) {
		java.util.Date date = new java.util.Date();
		java.sql.Timestamp dateTime = new java.sql.Timestamp( date.getTime() );
			userInformation.setDateRegistry(dateTime);
			userInformation.setDateRegistryUpdate(dateTime);
			userInformation.setActive(true);
			userInformationRepository.save(userInformation);
	}

	/* (non-Javadoc)
	 * @see com.linked.system.services.UserInformationService#updateUserInformation(com.linked.system.vo.UserInformation)
	 */
	@Override
	public void updateUserInformation(UserInformation userInformation) {
		java.util.Date date = new java.util.Date();
		java.sql.Timestamp dateTime = new java.sql.Timestamp( date.getTime() );
		userInformation.setDateRegistryUpdate(dateTime);
		userInformationRepository.save(userInformation);
	}

	/* (non-Javadoc)
	 * @see com.linked.system.services.UserInformationService#lockUserInformation(com.linked.system.vo.UserInformation)
	 */
	@Override
	public void lockUserInformation(UserInformation userInformation) {
		java.util.Date date = new java.util.Date();
		java.sql.Timestamp dateTime = new java.sql.Timestamp( date.getTime() );
		userInformation.setDateRegistryUpdate(dateTime);
		userInformation.setActive(false);
		userInformationRepository.save(userInformation);
	}

	/* (non-Javadoc)
	 * @see com.linked.system.services.UserInformationService#unLockUserInformation(com.linked.system.vo.UserInformation)
	 */
	@Override
	public void unLockUserInformation(UserInformation userInformation) {
		java.util.Date date = new java.util.Date();
		java.sql.Timestamp dateTime = new java.sql.Timestamp( date.getTime() );
		userInformation.setDateRegistryUpdate(dateTime);
		userInformation.setActive(true);
		userInformationRepository.save(userInformation);
	}

}
