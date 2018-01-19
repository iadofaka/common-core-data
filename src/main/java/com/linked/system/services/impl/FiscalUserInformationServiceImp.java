package com.linked.system.services.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.linked.system.repository.FiscalUserInformationRepository;
import com.linked.system.services.FiscalUserInformationService;
import com.linked.system.vo.FiscalUserInformation;

/**
 * @author Ing. Fabian Carvajal Acolt
 *
 */
public class FiscalUserInformationServiceImp implements FiscalUserInformationService {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	FiscalUserInformationRepository fiscalUserInformationRepository;

	/* (non-Javadoc)
	 * @see com.linked.system.services.FiscalUserInformationService#findAll()
	 */
	@Override
	public Iterable<FiscalUserInformation> findAll() throws Exception {
		logger.info("Find all position");
		return fiscalUserInformationRepository.findAll();
	}

	/* (non-Javadoc)
	 * @see com.linked.system.services.FiscalUserInformationService#findByAlias(java.lang.String)
	 */
	@Override
	public FiscalUserInformation findByEntityName(String entityName) throws Exception {
		
		return fiscalUserInformationRepository.findByEntityName(entityName);
	}
	
	/* (non-Javadoc)
	 * @see com.linked.system.services.FiscalUserInformationService#findByRfc(java.lang.String)
	 */
	@Override
	public FiscalUserInformation findByRfc(String rfc) throws Exception {
		return fiscalUserInformationRepository.findByRfc(rfc);
	}

	/* (non-Javadoc)
	 * @see com.linked.system.services.FiscalUserInformationService#findByIsActive(java.lang.Boolean)
	 */
	@Override
	public List<FiscalUserInformation> findByIsActive(Boolean isActive) throws Exception {
		return fiscalUserInformationRepository.findByIsActive(isActive);
	}

	/* (non-Javadoc)
	 * @see com.linked.system.services.FiscalUserInformationService#createFiscalUser(com.linked.system.vo.FiscalUserInformation)
	 */
	@Override
	public void createFiscalUser(FiscalUserInformation fiscalUserInformation) throws Exception {
		java.util.Date date = new java.util.Date();
		java.sql.Timestamp dateTime = new java.sql.Timestamp( date.getTime() );
		fiscalUserInformation.setDateRegistry(dateTime);
		fiscalUserInformation.setDateRegistryUpdate(dateTime);
		fiscalUserInformation.setActive(true);
		fiscalUserInformationRepository.save(fiscalUserInformation);
	}

	/* (non-Javadoc)
	 * @see com.linked.system.services.FiscalUserInformationService#updateFiscalUser(com.linked.system.vo.FiscalUserInformation)
	 */
	@Override
	public void updateFiscalUser(FiscalUserInformation fiscalUserInformation) throws Exception {
		java.util.Date date = new java.util.Date();
		java.sql.Timestamp dateTime = new java.sql.Timestamp( date.getTime() );
		fiscalUserInformation.setDateRegistryUpdate(dateTime);
		fiscalUserInformationRepository.save(fiscalUserInformation);

	}

	/* (non-Javadoc)
	 * @see com.linked.system.services.FiscalUserInformationService#lockFiscalUser(com.linked.system.vo.FiscalUserInformation)
	 */
	@Override
	public void lockFiscalUser(FiscalUserInformation fiscalUserInformation) throws Exception {
		java.util.Date date = new java.util.Date();
		java.sql.Timestamp dateTime = new java.sql.Timestamp( date.getTime() );
		fiscalUserInformation.setDateRegistryUpdate(dateTime);
		fiscalUserInformation.setActive(false);
		fiscalUserInformationRepository.save(fiscalUserInformation);

	}

	/* (non-Javadoc)
	 * @see com.linked.system.services.FiscalUserInformationService#unLockFiscalUser(com.linked.system.vo.FiscalUserInformation)
	 */
	@Override
	public void unLockFiscalUser(FiscalUserInformation fiscalUserInformation) throws Exception {
		java.util.Date date = new java.util.Date();
		java.sql.Timestamp dateTime = new java.sql.Timestamp( date.getTime() );
		fiscalUserInformation.setDateRegistryUpdate(dateTime);
		fiscalUserInformation.setActive(true);
		fiscalUserInformationRepository.save(fiscalUserInformation);

	}

}
