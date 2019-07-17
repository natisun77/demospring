package com.nataliia.dao;

import com.nataliia.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long>{

    Optional<List<Product>> getAllByCategory_id(Long id);
}
