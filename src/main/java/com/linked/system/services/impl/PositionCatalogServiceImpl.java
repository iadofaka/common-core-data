package com.linked.system.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.linked.system.repository.PositionCatalogRepository;
import com.linked.system.services.PositionCatalogService;
import com.linked.system.vo.PositionCatalog;

public class PositionCatalogServiceImpl implements PositionCatalogService{
	
	@Autowired
	PositionCatalogRepository  positionCatalogRepository;

	@Override
	public Iterable<PositionCatalog> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PositionCatalog findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PositionCatalog> findByIsActive(Boolean isActive) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createPosition(PositionCatalog positionsCatalog) {
		java.util.Date date = new java.util.Date();
		java.sql.Timestamp dateTime = new java.sql.Timestamp( date.getTime() );
		positionsCatalog.setDateRegistry(dateTime);
		positionsCatalog.setDateRegistryUpdate(dateTime);
		positionCatalogRepository.save(positionsCatalog);
		
	}

	@Override
	public void updatePosition(PositionCatalog positionsCatalog) {
		java.util.Date date = new java.util.Date();
		java.sql.Timestamp dateTime = new java.sql.Timestamp( date.getTime() );
		positionsCatalog.setDateRegistryUpdate(dateTime);
		positionCatalogRepository.save(positionsCatalog);
		
	}

	@Override
	public void lockPosition(PositionCatalog positionsCatalog) {
		java.util.Date date = new java.util.Date();
		java.sql.Timestamp dateTime = new java.sql.Timestamp( date.getTime() );
		positionsCatalog.setDateRegistryUpdate(dateTime);
		positionCatalogRepository.save(positionsCatalog);
		
	}

	@Override
	public void unLockPosition(PositionCatalog positionsCatalog) {
		java.util.Date date = new java.util.Date();
		java.sql.Timestamp dateTime = new java.sql.Timestamp( date.getTime() );
		positionsCatalog.setDateRegistryUpdate(dateTime);
		positionCatalogRepository.save(positionsCatalog);
	}

}
