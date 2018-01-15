package com.linked.system.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.linked.system.vo.UserInformation;

public interface UserInformationRepository extends CrudRepository<UserInformation, Long>{
	
	@Override
    @Transactional
    Iterable<UserInformation> findAll();
	List<UserInformation> findByName(String name);
	UserInformation findByAlias(String alias);
	List<UserInformation> findByNameAndLastName(String name, String lastName);
	List<UserInformation> findByIsActive(Boolean isActive);
}
