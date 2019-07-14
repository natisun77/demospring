package com.nataliia.dao;

import com.nataliia.model.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryDao {

    Optional<List<Category>> getAll();
}
