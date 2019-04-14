package com.kcfinance.loans.web.controllers.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@RequestMapping(value="/login", method = {RequestMethod.GET, RequestMethod.POST})
	public String showLoginPage(HttpServletRequest request, HttpServletResponse response){
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();  
        
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (!(authentication instanceof AnonymousAuthenticationToken)) {
		    String currentUserName = authentication.getName();
		    return "index";
		}
        
		return "login";
	}
}
