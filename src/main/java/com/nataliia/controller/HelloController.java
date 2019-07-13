package com.nataliia.controller;

import com.nataliia.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @GetMapping(value = "/home")
    public String homePage() {
        return "home";
    }

    @GetMapping(value = "/params")
    public ModelAndView paramExample(@RequestParam(required = false) String name, @RequestParam Integer age) {
        ModelAndView mw = new ModelAndView();
        mw.addObject("name", name);
        mw.addObject("age", age);
        mw.setViewName("params");
        return mw;
    }

    @GetMapping(value = "/add-user")
    public ModelAndView addUser(ModelAndView mw) {
        mw.addObject("user", new User());
        mw.setViewName("add-user");
        return mw;
    }

    @PostMapping(value = "/add-user")
    public ModelAndView addUser(@ModelAttribute User user) {
        //userService.addUser(user);
        System.out.println();
        return null;
    }
}
