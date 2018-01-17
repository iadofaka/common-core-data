package com.linked.system.services;

import java.util.List;

import com.linked.system.vo.PositionCatalog;

/**
 * 
 * @author Ing Fabian Carvajal Acolt 
 * @version 1.0.0
 * @since Enero 2018
 *
 */
public interface PositionCatalogService {
	
	Iterable<PositionCatalog> findAll() throws Exception;//ok
	PositionCatalog findByPositionName(String name) throws Exception;//ok
	List<PositionCatalog> findByIsActive(Boolean isActive) throws Exception;//ok
	void createPosition(PositionCatalog positionsCatalog) throws Exception;//ok
	void updatePosition(PositionCatalog positionsCatalog) throws Exception;
	void lockPosition(PositionCatalog positionsCatalog) throws Exception;
	void unLockPosition(PositionCatalog positionsCatalog) throws Exception;

}
