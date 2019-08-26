package com.example.demo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
public class PaymentModel {
	@Id
	@GenericGenerator(name = "generator", strategy = "guid", parameters = {})
	@GeneratedValue(generator = "generator")
	private String refID;
	//key tim cong ty
	//ma so thue
//	@NotNull
	@Column(name="keyCompany")

	private String keyCompany;
	//mot nhieu
//	@NotNull
//	@ManyToOne(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
//	@JoinColumn(name = "reftypeID")
//	private RefTypeCommand ref;
	
//	@OneToMany(mappedBy="payment",fetch=FetchType.LAZY)
//	private List<InvoiceDetailCommand> invoices;
	
//	@NotNull
	private  Date refDate;
	
//	@NotNull
	private Date postedDate;

	private String refNoFinance;
//	@NotNull
	private Integer isPostedFinance;
	private String accountObjectID;
	private String accountObjectName;
	private String accountObjectAddress;
	private String accountObjectContactName;
	private String reasonTypeID;

	@Column(name="journalMemo")
	private String journalMemo;
	@Column(name="description")
	private String description;
	private String documentInclude;
	private Double exchangeRate;
	
//	@NotNull
	private Double totalAmountOC=0.0;
//	@NotNull
	private Double totalAmount=0.0;
	private Date editVersion;
//	@NotNull
	private Integer refOrdef;
//	@NotNull
	private Date createdDate;
	private String createdBy;
	@Column(name="modifiedDate")
	private Date modifiedDate;
	private String modifiedBy;
	public String getRefID() {
		return refID;
	}
	public void setRefID(String refID) {
		this.refID = refID;
	}
	public String getKeyCompany() {
		return keyCompany;
	}
	public void setKeyCompany(String keyCompany) {
		this.keyCompany = keyCompany;
	}
	public Date getRefDate() {
		return refDate;
	}
	public void setRefDate(Date refDate) {
		this.refDate = refDate;
	}
	public Date getPostedDate() {
		return postedDate;
	}
	public void setPostedDate(Date postedDate) {
		this.postedDate = postedDate;
	}
	public String getRefNoFinance() {
		return refNoFinance;
	}
	public void setRefNoFinance(String refNoFinance) {
		this.refNoFinance = refNoFinance;
	}
	public Integer getIsPostedFinance() {
		return isPostedFinance;
	}
	public void setIsPostedFinance(Integer isPostedFinance) {
		this.isPostedFinance = isPostedFinance;
	}
	public String getAccountObjectID() {
		return accountObjectID;
	}
	public void setAccountObjectID(String accountObjectID) {
		this.accountObjectID = accountObjectID;
	}
	public String getAccountObjectName() {
		return accountObjectName;
	}
	public void setAccountObjectName(String accountObjectName) {
		this.accountObjectName = accountObjectName;
	}
	public String getAccountObjectAddress() {
		return accountObjectAddress;
	}
	public void setAccountObjectAddress(String accountObjectAddress) {
		this.accountObjectAddress = accountObjectAddress;
	}
	public String getAccountObjectContactName() {
		return accountObjectContactName;
	}
	public void setAccountObjectContactName(String accountObjectContactName) {
		this.accountObjectContactName = accountObjectContactName;
	}
	public String getReasonTypeID() {
		return reasonTypeID;
	}
	public void setReasonTypeID(String reasonTypeID) {
		this.reasonTypeID = reasonTypeID;
	}
	public String getJournalMemo() {
		return journalMemo;
	}
	public void setJournalMemo(String journalMemo) {
		this.journalMemo = journalMemo;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDocumentInclude() {
		return documentInclude;
	}
	public void setDocumentInclude(String documentInclude) {
		this.documentInclude = documentInclude;
	}
	public Double getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(Double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	public Double getTotalAmountOC() {
		return totalAmountOC;
	}
	public void setTotalAmountOC(Double totalAmountOC) {
		this.totalAmountOC = totalAmountOC;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Date getEditVersion() {
		return editVersion;
	}
	public void setEditVersion(Date editVersion) {
		this.editVersion = editVersion;
	}
	public Integer getRefOrdef() {
		return refOrdef;
	}
	public void setRefOrdef(Integer refOrdef) {
		this.refOrdef = refOrdef;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

}
