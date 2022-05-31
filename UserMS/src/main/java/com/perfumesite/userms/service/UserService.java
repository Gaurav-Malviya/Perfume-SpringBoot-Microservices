package com.perfumesite.userms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perfumesite.userms.dto.BuyerDTO;
import com.perfumesite.userms.repository.BuyerRepository;
import com.perfumesite.userms.repository.CartRepository;
import com.perfumesite.userms.repository.SellerRepository;
import com.perfumesite.userms.repository.WishlistRepository;

@Service
public class UserService 
{
	@Autowired
	BuyerRepository buyerRepo;
	@Autowired
	CartRepository cartRepo;
	@Autowired
	SellerRepository sellerRepo;
	@Autowired
	WishlistRepository wishlistRepo;
	
	public List<BuyerDTO> allbuyers()
	{
		List<BuyerDTO> allBuyers = 
	}
	
}
