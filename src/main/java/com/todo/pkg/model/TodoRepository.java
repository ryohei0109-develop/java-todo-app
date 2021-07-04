package com.todo.pkg.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TodoRepository {
	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public TodoRepository(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Todo getTodoById(int id) {
		String sql = "SELECT id,title,description,created_at,updated_at FROM `todos` WHERE `id` = ?";
		Map<String, Object> result = jdbcTemplate.queryForMap(sql, id);

		return new Todo(result);
	}

	public List<Todo> getAll() {
		String sql = "SELECT id,title,description,created_at,updated_at FROM `todos`";
		List<Map<String, Object>> todoList = jdbcTemplate.queryForList(sql);
		List<Todo> list = new ArrayList<>();
		for (Map<String, Object> result : todoList) {
			list.add(new Todo(result));
		}

		return list;
	}
}
