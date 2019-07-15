package com.nataliia.service;

import com.nataliia.dao.CategoryDao;
import com.nataliia.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public Optional<List<Category>> getAll() {
        return categoryDao.getAll();
    }

    @Override
    public Optional<Category> create(Category category) {
        return categoryDao.create(category);
    }

    @Override
    public Optional<Category> getById(Long id) {
        return categoryDao.getById(id);
    }

    @Override
    public Optional<Category> update(Category category) {
        return categoryDao.update(category);
    }
}