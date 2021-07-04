package com.todo.pkg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.todo.pkg.model.Todo;
import com.todo.pkg.model.TodoRepository;

@RequestMapping("/detail")
@Controller
public class DetailController {
	@Autowired
	private TodoRepository todoRepository;

	/**
	 * /Detail/{id}
	 * 
	 * @param model
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
	public String view(Model model, @PathVariable int id) {
		try {
			if (id > 0) {
				Todo todo = todoRepository.getTodoById(id);

				model.addAttribute("todo", todo);
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

		return "detail";
	}

	@PostMapping("/save")
	public String save(@ModelAttribute Todo todo, Model model) {
		todoRepository.save(todo);

		return "redirect:/";
	}
	
	@PostMapping("/delete")
	public String delete(@RequestParam int id, Model model) {
		todoRepository.delete(id);

		return "redirect:/";
	}
}
