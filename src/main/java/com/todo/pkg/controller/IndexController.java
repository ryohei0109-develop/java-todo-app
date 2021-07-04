package com.todo.pkg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.todo.pkg.model.Todo;
import com.todo.pkg.model.TodoRepository;

@RequestMapping("/")
@Controller
public class IndexController {
	@Autowired
	private TodoRepository todoRepository;

	@GetMapping()
	public String view(Model model) {
		try {
			List<Todo> list = todoRepository.getAll();

			model.addAttribute("todoList", list);

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

		return "index";
	}
}
