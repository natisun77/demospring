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
}