package com.atividade.cauan.repositories;

import com.atividade.cauan.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
