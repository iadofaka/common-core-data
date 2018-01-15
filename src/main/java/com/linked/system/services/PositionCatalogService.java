package com.linked.system.services;

import java.util.List;

import com.linked.system.vo.PositionCatalog;


public interface PositionCatalogService {

	
	Iterable<PositionCatalog> findAll();
	PositionCatalog findByName(String name);
	List<PositionCatalog> findByIsActive(Boolean isActive);
	void createPosition(PositionCatalog positionsCatalog);
	void updatePosition(PositionCatalog positionsCatalog);
	void lockPosition(PositionCatalog positionsCatalog);
	void unLockPosition(PositionCatalog positionsCatalog);

}
