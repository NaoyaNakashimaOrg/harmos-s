package com.nn.harmos.app.a01.a01_001_login.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/a01_001")
public class A01_001_Controller {

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/showHome", method = { RequestMethod.GET, RequestMethod.POST })
	public String home(Locale locale, Model model) {
		return "a01_home/a01_001_home";
	}
}
