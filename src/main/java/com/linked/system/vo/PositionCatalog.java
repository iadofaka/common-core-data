package com.linked.system.vo;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 
 * @author Ing Fabian Carvajal Acolt 
 * @version 1.0.0
 * @since Enero 2018
 *
 */
@Entity
@Audited
@Table(name = "LKS_C_ADM_POSITIONS")
public class PositionCatalog implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5498613062841631879L;
	@Column(name = "POSITION_ID", unique = true)
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private Long id;
	@Column(name ="POSITION_NAME", nullable=false)
	private String positionName;
	@Column(name="POSITION_GRADE", nullable=false)
	private String grade;
	@Column(name = "DATE_REGISTRY", nullable=false)
	@JsonFormat(timezone = "America/Mexico_City", shape = JsonFormat.Shape.STRING,pattern="yyyy-MM-dd HH:mm:ss")
	private Timestamp dateRegistry;
	@Column(name = "DATE_REGISTRY_UPDATE", nullable=false)
	@JsonFormat(timezone = "America/Mexico_City", shape = JsonFormat.Shape.STRING,pattern="yyyy-MM-dd HH:mm:ss")
	private Timestamp dateRegistryUpdate;
	@Column(name= "IS_ACTIVE")
	private boolean isActive;

	protected PositionCatalog() {
		
	}

	public PositionCatalog(String positionName, String grade, Timestamp dateRegistry,
			Timestamp dateRegistryUpdate, boolean isActive) {
		super();
		this.positionName = positionName;
		this.grade = grade;
		this.dateRegistry = dateRegistry;
		this.dateRegistryUpdate = dateRegistryUpdate;
		this.isActive = isActive;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPositionName() {
		return positionName;
	}

	public void setNamePosition(String positionName) {
		this.positionName = positionName;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Timestamp getDateRegistry() {
		return dateRegistry;
	}

	public void setDateRegistry(Timestamp dateRegistry) {
		this.dateRegistry = dateRegistry;
	}

	public Timestamp getDateRegistryUpdate() {
		return dateRegistryUpdate;
	}

	public void setDateRegistryUpdate(Timestamp dateRegistryUpdate) {
		this.dateRegistryUpdate = dateRegistryUpdate;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
}