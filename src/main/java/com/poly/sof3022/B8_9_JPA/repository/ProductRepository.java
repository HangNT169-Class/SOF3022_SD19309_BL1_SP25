package com.poly.sof3022.B8_9_JPA.repository;

import com.poly.sof3022.B8_9_JPA.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

}
