package com.nataliia.service;

import com.nataliia.model.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    Optional<List<Category>> getAll();
}
