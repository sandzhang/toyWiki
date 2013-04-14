package com.sandzhang.toywiki.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sandzhang.toywiki.core.service.UserService;

/**
 * @author sand
 */
@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/")
    public ModelAndView home() {
        ModelAndView result = new ModelAndView("home");
        result.addObject("name", "sand");
        return result;
    }

}
