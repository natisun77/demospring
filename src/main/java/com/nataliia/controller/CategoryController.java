package com.nataliia.controller;

import com.nataliia.model.Category;
import com.nataliia.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;
import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;


    @GetMapping(value = "/categories")
    public ModelAndView getAll() {
        return getAllCategoriesAndBindToMw();
    }

    @GetMapping(value = "/add-category")
    public ModelAndView create(ModelAndView mw) {
        mw.addObject("category", new Category());
        mw.setViewName("add-category");
        return mw;
    }

    @PostMapping(value = "/add-category")
    public ModelAndView create(@ModelAttribute Category category) {
        categoryService.create(category);
        return getAllCategoriesAndBindToMw();
    }

    @GetMapping(value = "/edit-category")
    public ModelAndView edit(@RequestParam("c_id") Long id, ModelAndView mw) {
        mw.addObject("category", categoryService.getById(id));
        mw.setViewName("edit-category");
        return mw;
    }

    @PostMapping(value = "/edit-category")
    public ModelAndView edit(@ModelAttribute Category category) {
        categoryService.update(category);
        return getAllCategoriesAndBindToMw();
    }

    @GetMapping(value = "/delete-category")
    public ModelAndView delete(@RequestParam("c_id") Long id, ModelAndView mw) {
        categoryService.delete(id);
        return getAllCategoriesAndBindToMw();
    }

    private ModelAndView getAllCategoriesAndBindToMw() {
        List<Category> list = categoryService.getAll()
                .orElseGet(Collections::emptyList);
        ModelAndView mw = new ModelAndView();
        mw.addObject("categories", list);
        mw.setViewName("categories");
        return mw;
    }
}
