package com.nn.harmos.fw.userAuth.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/userAuth")
public class UserAuthController {

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/loginForm", method = { RequestMethod.GET, RequestMethod.POST })
	public String loginForm(Locale locale, Model model) {
		return "common/login/login";
	}

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/loginFailure", method = { RequestMethod.GET, RequestMethod.POST })
	public String loginFailure(Locale locale, Model model) {
		return "common/error/accessDeniedError";
	}
}
