package com.linked.system.services.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linked.system.repository.PositionCatalogRepository;
import com.linked.system.services.PositionCatalogService;
import com.linked.system.vo.PositionCatalog;

/**
 * 
 * @author Ing Fabian Carvajal Acolt 
 * @version 1.0.0
 * @since Enero 2018
 *
 */
@Service
public class PositionCatalogServiceImpl implements PositionCatalogService{

	@Autowired
	PositionCatalogRepository  positionCatalogRepository;

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public Iterable<PositionCatalog> findAll() {
		logger.info("Find all position");
		return positionCatalogRepository.findAll();
	}

	@Override
	public PositionCatalog findByPositionName(String name) {
		logger.info("Find position name: " + name);
		return positionCatalogRepository.findByPositionName(name);
	}

	@Override
	public List<PositionCatalog> findByIsActive(Boolean isActive) {
		logger.info("Find all position when is: " + isActive);
		return positionCatalogRepository.findByIsActive(isActive);
	}

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

	@Override
	public void updatePosition(PositionCatalog positionCatalog) {
		java.util.Date date = new java.util.Date();
		java.sql.Timestamp dateTime = new java.sql.Timestamp( date.getTime() );
		positionCatalog.setDateRegistryUpdate(dateTime);
		logger.info("Update position name: " + positionCatalog.getPositionName());
		positionCatalogRepository.save(positionCatalog);
		logger.info("The position name " + positionCatalog.getPositionName() +" was updated" );

	}

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
