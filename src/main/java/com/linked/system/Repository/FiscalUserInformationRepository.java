package com.linked.system.Repository;

import org.springframework.data.repository.CrudRepository;

import com.linked.system.vo.FiscalUserInformation;

public interface FiscalUserInformationRepository extends CrudRepository<FiscalUserInformation, Long> {
	
}
