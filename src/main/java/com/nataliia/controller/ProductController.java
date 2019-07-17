package com.nataliia.controller;

import com.nataliia.model.Product;
import com.nataliia.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;
import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/products")
    public ModelAndView getAllById(@RequestParam("c_id") Long id, ModelAndView mw) {
        List<Product> products = productService.getAllById(id)
                .orElseGet(Collections::emptyList);

        mw.addObject("products", products);
        mw.setViewName("products");
        return mw;
    }
}
