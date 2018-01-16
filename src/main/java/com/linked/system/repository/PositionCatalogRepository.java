package com.linked.system.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.linked.system.vo.PositionCatalog;

/**
 * 
 * @author Ing Fabian Carvajal Acolt 
 * @version 1.0.0
 * @since Enero 2018
 *
 */
public interface PositionCatalogRepository  extends CrudRepository<PositionCatalog, Long>{
	
	PositionCatalog findByPositionName(String positionName);
	List<PositionCatalog> findByIsActive(Boolean isActive);

}
