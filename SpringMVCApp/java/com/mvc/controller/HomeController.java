package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	//we have to call this method when even we found /(forward slash)
	@RequestMapping("/")
	String firstDemo() {
		return "first";
	}
}
