/**
 * 
 */
package com.linked.system.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.linked.system.repository.PositionCatalogRepository;
import com.linked.system.services.PositionCatalogService;
import com.linked.system.vo.PositionCatalog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Ing. Fabian Carvajal Acolt
 *
 */
public class PositionCatalogServiceImpl implements PositionCatalogService {
	
	@Autowired
	PositionCatalogRepository  positionCatalogRepository;

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	/* (non-Javadoc)
	 * @see com.linked.system.services.PositionCatalogService#findAll()
	 */
	@Override
	public Iterable<PositionCatalog> findAll() {
		logger.info("Find all position");
		return positionCatalogRepository.findAll();
	}

	/* (non-Javadoc)
	 * @see com.linked.system.services.PositionCatalogService#findByPositionName(java.lang.String)
	 */
	@Override
	public PositionCatalog findByPositionName(String name) {
		logger.info("Find position name: " + name);
		return positionCatalogRepository.findByPositionName(name);
	}

	/* (non-Javadoc)
	 * @see com.linked.system.services.PositionCatalogService#findByIsActive(java.lang.Boolean)
	 */
	@Override
	public List<PositionCatalog> findByIsActive(Boolean isActive) {
		logger.info("Find all position when is: " + isActive);
		return positionCatalogRepository.findByIsActive(isActive);
	}

	/* (non-Javadoc)
	 * @see com.linked.system.services.PositionCatalogService#createPosition(com.linked.system.vo.PositionCatalog)
	 */
	@Override
	public void createPosition(PositionCatalog positionCatalog) {
		java.util.Date date = new java.util.Date();
		java.sql.Timestamp dateTime = new java.sql.Timestamp( date.getTime() );
		positionCatalog.setDateRegistry(dateTime);
		positionCatalog.setDateRegistryUpdate(dateTime);
		positionCatalog.setActive(true);
		logger.info("Save new position name: " + positionCatalog.getPositionName());
		positionCatalogRepository.save(positionCatalog);
		logger.info("The new position name " + positionCatalog.getPositionName() +" was saved" );
	}

	/* (non-Javadoc)
	 * @see com.linked.system.services.PositionCatalogService#updatePosition(com.linked.system.vo.PositionCatalog)
	 */
	@Override
	public void updatePosition(PositionCatalog positionCatalog) {
		java.util.Date date = new java.util.Date();
		java.sql.Timestamp dateTime = new java.sql.Timestamp( date.getTime() );
		positionCatalog.setDateRegistryUpdate(dateTime);
		logger.info("Update position name: " + positionCatalog.getPositionName());
		positionCatalogRepository.save(positionCatalog);
		logger.info("The position name " + positionCatalog.getPositionName() +" was updated" );

	}

	/* (non-Javadoc)
	 * @see com.linked.system.services.PositionCatalogService#lockPosition(com.linked.system.vo.PositionCatalog)
	 */
	@Override
	public void lockPosition(PositionCatalog positionCatalog) {
		java.util.Date date = new java.util.Date();
		java.sql.Timestamp dateTime = new java.sql.Timestamp( date.getTime() );
		positionCatalog.setDateRegistryUpdate(dateTime);
		positionCatalog.setActive(false);
		logger.info("Lock position name: " + positionCatalog.getPositionName());
		positionCatalogRepository.save(positionCatalog);
		logger.info("The position name " + positionCatalog.getPositionName() +" was lock" );

	}

	/* (non-Javadoc)
	 * @see com.linked.system.services.PositionCatalogService#unLockPosition(com.linked.system.vo.PositionCatalog)
	 */
	@Override
	public void unLockPosition(PositionCatalog positionCatalog) {
		java.util.Date date = new java.util.Date();
		java.sql.Timestamp dateTime = new java.sql.Timestamp( date.getTime() );
		positionCatalog.setDateRegistryUpdate(dateTime);
		positionCatalog.setActive(true);
		logger.info("UnLock position name: " + positionCatalog.getPositionName());
		positionCatalogRepository.save(positionCatalog);
		logger.info("The position name " + positionCatalog.getPositionName() +" was unlock" );
	}

}