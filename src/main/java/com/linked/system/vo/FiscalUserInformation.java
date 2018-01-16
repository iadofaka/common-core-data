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
@Table(name = "LKS_M_ADM_FISCAL_INFORMATION")
@Audited
public class FiscalUserInformation implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8241438121233079784L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "FISCAL_INF_ID", unique= true)
	private Long fiscalInfId;
	@Column(name = "ENTITY_NAME", unique= true)
	private String entityName;
	@Column(name = "RFC", unique= true)
	private String rfc;
	@Column(name = "ADDRESS", unique= true)
	private String addres;
	@Column(name = "DOOR_NUMBER", unique= true)
	private String doorNumber;
	@Column(name = "INT_NUMBER", unique= true)
	private String intNumber;
	@Column(name = "POSTAL_CODE", unique = true)
	private String postalCode;
	@Column(name = "TOWNSHIP", unique = true)
	private String township;
	@Column(name = "STATE", unique = true)
	private String state;
	@Column(name = "COUNTRY", unique = true)
	private String country;
	@Column(name = "TELEPHONE_NUMBER", unique = true)
	private String telephoneNumber;
	@Column(name = "EMAIL_ADDRESS", unique = true)
	private String emailAddress;
	@Column(name = "IS_ACTIVE", unique = true)
	private boolean isActive;
	@Column(name = "DATE_REGISTRY", nullable=false)
	@JsonFormat(timezone = "America/Mexico_City", shape = JsonFormat.Shape.STRING,pattern="yyyy-MM-dd HH:mm:ss")
	private Timestamp dateRegistry;
	@Column(name = "DATE_REGISTRY_UPDATE", nullable=false)
	@JsonFormat(timezone = "America/Mexico_City", shape = JsonFormat.Shape.STRING,pattern="yyyy-MM-dd HH:mm:ss")
	private Timestamp dateRegistryUpdate;
	
	protected FiscalUserInformation() {
		
	}

	public FiscalUserInformation(String entityName, String rfc, String addres, String doorNumber, String intNumber,
			String postalCode, String township, String state, String country, String telephoneNumber,
			String emailAddress, boolean isActive, Timestamp dateRegistry, Timestamp dateRegistryUpdate) {
		super();
		this.entityName = entityName;
		this.rfc = rfc;
		this.addres = addres;
		this.doorNumber = doorNumber;
		this.intNumber = intNumber;
		this.postalCode = postalCode;
		this.township = township;
		this.state = state;
		this.country = country;
		this.telephoneNumber = telephoneNumber;
		this.emailAddress = emailAddress;
		this.isActive = isActive;
		this.dateRegistry = dateRegistry;
		this.dateRegistryUpdate = dateRegistryUpdate;
	}

	public Long getFiscalInfId() {
		return fiscalInfId;
	}

	public void setFiscalInfId(Long fiscalInfId) {
		this.fiscalInfId = fiscalInfId;
	}

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public String getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}

	public String getIntNumber() {
		return intNumber;
	}

	public void setIntNumber(String intNumber) {
		this.intNumber = intNumber;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getTownship() {
		return township;
	}

	public void setTownship(String township) {
		this.township = township;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
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
	
}
