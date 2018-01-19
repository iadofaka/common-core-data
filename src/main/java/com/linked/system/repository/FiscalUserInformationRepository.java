package com.linked.system.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.linked.system.vo.FiscalUserInformation;

/**
 * 
 * @author Ing Fabian Carvajal Acolt 
 * @version 1.0.0
 * @since Enero 2018
 *
 */
public interface FiscalUserInformationRepository extends CrudRepository<FiscalUserInformation, Long> {
	
	FiscalUserInformation findByEntityName(String alias);
	FiscalUserInformation findByRfc(String rfc);
	List<FiscalUserInformation> findByIsActive(Boolean isActive);
	
}
