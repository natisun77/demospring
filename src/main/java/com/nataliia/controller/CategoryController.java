package com.nataliia.controller;

import com.nataliia.model.Category;
import com.nataliia.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;
import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;


    @GetMapping(value = "/categories")
    public ModelAndView getAll(ModelAndView mw) {
        List<Category> categories = categoryService.getAll()
                .orElseGet(Collections::emptyList);

        mw.addObject("categories", categories);
        mw.setViewName("categories");
        return mw;
    }
}
