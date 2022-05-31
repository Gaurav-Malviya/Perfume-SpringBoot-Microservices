package com.perfumesite.userms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.perfumesite.userms.entity.Cart;
import com.perfumesite.userms.entity.CartCompKey;

public interface CartRepository extends JpaRepository<Cart,CartCompKey>
{

}
