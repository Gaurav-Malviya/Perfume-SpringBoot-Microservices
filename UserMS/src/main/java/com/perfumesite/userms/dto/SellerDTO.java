package com.perfumesite.userms.dto;

import com.perfumesite.userms.entity.Seller;

public class SellerDTO 
{
	int sellerId;
	String name;
	String email;
	int phoneNumber;
	String password;
	boolean pauseAccount;
	
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isPauseAccount() {
		return pauseAccount;
	}
	public void setPauseAccount(boolean pauseAccount) {
		this.pauseAccount = pauseAccount;
	}
	
	public SellerDTO toDto(Seller entity)
	{
		SellerDTO seller = new SellerDTO();
		seller.setSellerId(entity.getSellerId());
		seller.setName(entity.getName());
		seller.setEmail(entity.getEmail());
		seller.setPhoneNumber(entity.getPhoneNumber());
		seller.setPassword(entity.getPassword());
		seller.setPauseAccount(entity.isPauseAccount());
		return seller;
	}
	
	public Seller toEntity(SellerDTO dto)
	{
		Seller seller = new Seller();
		seller.setSellerId(dto.getSellerId());
		seller.setName(dto.getName());
		seller.setEmail(dto.getEmail());
		seller.setPhoneNumber(dto.getPhoneNumber());
		seller.setPassword(dto.getPassword());
		seller.setPauseAccount(dto.isPauseAccount());
		return seller;
	}
}
