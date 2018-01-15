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

@Entity
@Table(name = "LKS_M_ADM_USER")
@Audited
public class UserInformation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3294610342221098751L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "USER_ID", unique= true)
	private Long userId;
	@Column(name = "FISCAL_INFORMATION_ID", nullable=false)
	private FiscalUserInformation fiscalUserInformation;//We get the id in fiscal information table
	@Column(name = "POSITION_ID", nullable=false)
	PositionCatalog positionsCatalog;//we get the id position in Catalog Positions
	@Column(name="ALIAS", nullable=false)
	private String alias;
	@Column(name = "NAME", nullable=false)
	private String name;
	@Column(name = "SECOND_NAME", nullable=false)
	private String secondName;
	@Column(name = "LAST_NAME", nullable=false)
	private String lastName;
	@Column(name = "SECOND_LAST_NAME", nullable=false)
	private String secondLastName;
	@Column(name = "FULL_NAME", nullable=false)
	private String fullName;
	@Column(name = "ADDRESS", nullable=false)
	private String address;
	@Column(name = "DOOR_NUMBER", nullable=false)
	private String doorNumber;
	@Column(name = "CELL_PHONE", nullable=false)
	private String cellPhone;
	@Column(name = "E_MAIL", nullable=false)
	private String email;
	@Column(name = "IMAGE_PATH", nullable=false)
	private String imagePath;
	@Column(name =  "PASSWORD", nullable=false)
	private String password;
	@Column(name = "IS_ACTIVE", nullable=false)
	private boolean isActive;
	@Column(name = "DATE_REGISTRY", nullable=false)
	private Timestamp dateRegistry;
	@Column(name = "DATE_REGISTRY_UPDATE", nullable=false)
	private Timestamp dateRegistryUpdate;
	

	protected UserInformation() {
	}


	public UserInformation(FiscalUserInformation fiscalUserInformation, PositionCatalog positionsCatalog, String alias,
			String name, String secondName, String lastName, String secondLastName, String fullName, String address,
			String doorNumber, String cellPhone, String email, String imagePath, String password, boolean isActive,
			Timestamp dateRegistry, Timestamp dateRegistryUpdate) {
		super();
		this.fiscalUserInformation = fiscalUserInformation;
		this.positionsCatalog = positionsCatalog;
		this.alias = alias;
		this.name = name;
		this.secondName = secondName;
		this.lastName = lastName;
		this.secondLastName = secondLastName;
		this.fullName = fullName;
		this.address = address;
		this.doorNumber = doorNumber;
		this.cellPhone = cellPhone;
		this.email = email;
		this.imagePath = imagePath;
		this.password = password;
		this.isActive = isActive;
		this.dateRegistry = dateRegistry;
		this.dateRegistryUpdate = dateRegistryUpdate;
	}


	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
	}


	public FiscalUserInformation getFiscalUserInformation() {
		return fiscalUserInformation;
	}


	public void setFiscalUserInformation(FiscalUserInformation fiscalUserInformation) {
		this.fiscalUserInformation = fiscalUserInformation;
	}


	public PositionCatalog getPositionsCatalog() {
		return positionsCatalog;
	}


	public void setPositionsCatalog(PositionCatalog positionsCatalog) {
		this.positionsCatalog = positionsCatalog;
	}


	public String getAlias() {
		return alias;
	}


	public void setAlias(String alias) {
		this.alias = alias;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSecondName() {
		return secondName;
	}


	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getSecondLastName() {
		return secondLastName;
	}


	public void setSecondLastName(String secondLastName) {
		this.secondLastName = secondLastName;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getDoorNumber() {
		return doorNumber;
	}


	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}


	public String getCellPhone() {
		return cellPhone;
	}


	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getImagePath() {
		return imagePath;
	}


	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
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