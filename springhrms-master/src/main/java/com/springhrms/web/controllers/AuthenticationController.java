package com.springhrms.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthenticationController {

    private static final String VIEWS_AUTHENTICATION_LOGIN_FORM = "login";

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage() {
        return VIEWS_AUTHENTICATION_LOGIN_FORM;
    }

//	@RequestMapping(value = "/loginerror", method = RequestMethod.GET)
    public String loginerror(ModelMap model) {
        model.addAttribute("error", "true");
        return "loginError";
    }

//	@RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(ModelMap model) {
        return VIEWS_AUTHENTICATION_LOGIN_FORM;
    }

}
