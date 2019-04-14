package com.kcfinance.loans.app.common;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ExceptionHandlingController {
	
	@RequestMapping(value="/error", method = RequestMethod.GET)
    public String showError(ModelMap model){
        return "error";
    }
}