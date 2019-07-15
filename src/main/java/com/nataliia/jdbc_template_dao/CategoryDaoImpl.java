package com.nataliia.jdbc_template_dao;

import com.nataliia.jdbc_template_dao.templates.CategoryJdbcTemplate;
import com.nataliia.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//@Repository("categoryDao1")
public class CategoryDaoImpl implements CategoryDao {

  //  @Autowired
    private CategoryJdbcTemplate template;

    @Override
    public Optional<List<Category>> getAll() {
        return template.getAll();
    }

    @Override
    public Optional<Category> create(Category category) {
        return template.create(category);
    }

    @Override
    public Optional<Category> getById(Long id) {
        return template.getById(id);
    }

    @Override
    public Optional<Category> update(Category category) {
        return template.update(category);
    }

    @Override
    public void delete(Long id) {
        template.delete(id);
    }
}