package com.kcfinance.loans.web.controllers.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class HomeController {

	@RequestMapping(value="/index", method = RequestMethod.GET)
    public String showHomePage(ModelMap model){
        return "index";
    }
}
