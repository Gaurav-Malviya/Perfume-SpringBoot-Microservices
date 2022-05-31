package com.perfumesite.userms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.perfumesite.userms.entity.Wishlist;
import com.perfumesite.userms.entity.WishlistCompKey;

public interface WishlistRepository extends JpaRepository<Wishlist,WishlistCompKey>
{

}
