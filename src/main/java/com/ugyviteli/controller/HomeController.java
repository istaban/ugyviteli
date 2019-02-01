package com.ugyviteli.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index(Model model) {
		//model.addAttribute("pageTitle", "Ügyviteli");
		return "main";
	}
	
    
	@RequestMapping("/login")
	public String login(Model model) {
		//model.addAttribute("pageTitle", "Ügyviteli");
		return "login";
	}
	
//    @GetMapping("/login")
//    public RedirectView redirectWithUsingRedirectView(
//      RedirectAttributes attributes) {
//        attributes.addFlashAttribute("flashAttribute", "redirectWithRedirectView");
//        attributes.addAttribute("attribute", "redirectWithRedirectView");
//        return new RedirectView("ugyfelek");
//    }
	//@Secured("ROLE_ADMIN")
	@RequestMapping("/ugyfelek")
	public String main(Model model) {
		//model.addAttribute("pageTitle", "Ügyviteli");
		return "main";
	}

}
