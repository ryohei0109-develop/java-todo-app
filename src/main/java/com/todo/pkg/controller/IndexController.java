package com.todo.pkg.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class IndexController {
	@GetMapping()
	public String view(Model model) {
		String now = LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);
		model.addAttribute("datetime", now);

		return "index";
	}
}
