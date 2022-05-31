package com.perfumesite.userms.dto;

import com.perfumesite.userms.entity.Buyer;

public class BuyerDTO 
{
	int buyerId;
	String name;
	String email;
	int phoneNumber;
	String password;
	boolean creedMember;
	int rewardPoints;
	int credit;
	
	public int getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
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
	public boolean isCreedMember() {
		return creedMember;
	}
	public void setCreedMember(boolean creedMember) {
		this.creedMember = creedMember;
	}
	public int getRewardPoints() {
		return rewardPoints;
	}
	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	
	public BuyerDTO toDTO(Buyer entity)
	{
		BuyerDTO buyer = new BuyerDTO();
		buyer.setBuyerId(entity.getBuyerId());
		buyer.setName(entity.getName());
		buyer.setEmail(entity.getEmailId());
		buyer.setPhoneNumber(entity.getPhoneNumber());
		buyer.setPassword(entity.getPassword());
		buyer.setCreedMember(entity.getCreedMember());
		buyer.setRewardPoints(entity.getRewardPoints());
		buyer.setCredit(entity.getCredit());
		return buyer;
	}
	
	public Buyer toEntity(Buyer dto)
	{
		Buyer buyer = new Buyer();
		buyer.setBuyerId(dto.getBuyerId());
		buyer.setName(dto.getName());
		buyer.setEmailId(dto.getEmailId());
		buyer.setPhoneNumber(dto.getPhoneNumber());
		buyer.setPassword(dto.getPassword());
		buyer.setCreedMember(dto.getCreedMember());
		buyer.setRewardPoints(dto.getRewardPoints());
		buyer.setCredit(dto.getCredit());
		return buyer;
	}
}
