package com.linked.system.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.linked.system.vo.UserInformation;

/**
 * 
 * @author Ing Fabian Carvajal Acolt 
 * @version 1.0.0
 * @since Enero 2018
 *
 */
public interface UserInformationRepository extends CrudRepository<UserInformation, Long>{
	
    Iterable<UserInformation> findAll();
	List<UserInformation> findByName(String name);
	UserInformation findByAlias(String alias);
	List<UserInformation> findByNameAndLastName(String name, String lastName);
	List<UserInformation> findByIsActive(Boolean isActive);
}
