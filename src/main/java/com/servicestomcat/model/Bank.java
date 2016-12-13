package com.servicestomcat.model;

import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Bank {

	private Long bankId;
	private String name;
	private String address;
	private String manager;
	private Set<Cashier> cashiers;		
	
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bank(Long bankId, String name, String address, String manager, Set<Cashier> cashiers) {
		super();
		this.bankId = bankId;
		this.name = name;
		this.address = address;
		this.manager = manager;
		this.cashiers = cashiers;
	}
	public Long getBankId() {
		return bankId;
	}
	public void setBankId(Long bankId) {
		this.bankId = bankId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public Set<Cashier> getCashiers() {
		return cashiers;
	}
	public void setCashiers(Set<Cashier> cashiers) {
		this.cashiers = cashiers;
	}
	
	
}
