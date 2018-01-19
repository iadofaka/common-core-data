/**
 * 
 */
package com.linked.system.services;

import java.util.List;

import com.linked.system.vo.FiscalUserInformation;

/**
 * @author Ing. Fabian Carvajal Acolt
 *
 */
public interface FiscalUserInformationService {

	Iterable<FiscalUserInformation> findAll() throws Exception;
	FiscalUserInformation findByEntityName(String entityName) throws Exception;
	FiscalUserInformation findByRfc(String rfc) throws Exception;
	List<FiscalUserInformation> findByIsActive(Boolean isActive) throws Exception;
	void createFiscalUser(FiscalUserInformation fiscalUserInformation) throws Exception;
	void updateFiscalUser(FiscalUserInformation fiscalUserInformation) throws Exception;
	void lockFiscalUser(FiscalUserInformation fiscalUserInformation) throws Exception;
	void unLockFiscalUser(FiscalUserInformation fiscalUserInformation) throws Exception;
	
}
