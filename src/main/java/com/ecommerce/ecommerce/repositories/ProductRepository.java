package com.ecommerce.ecommerce.repositories;

import com.ecommerce.ecommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
