package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
	
	// The @GetMapping annotation ensures that HTTP GET requests to /greeting are mapped to the greeting() method.
	// @RequestParam binds the value of the query string parameter name into the name parameter of the greeting() method
	@GetMapping("/inviting")
	public String greeting(@RequestParam(name="Vijay", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "inviting";
	}

}