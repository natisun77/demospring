package com.nataliia.service;

import com.nataliia.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    Optional<List<Product>> getAllById(Long id);
}
