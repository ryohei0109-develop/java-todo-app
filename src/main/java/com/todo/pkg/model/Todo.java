package com.todo.pkg.model;

import java.time.LocalDateTime;
import java.util.Map;

public class Todo {
	public Todo() {

	}

	public Todo(Map<String, Object> result) {
		this.id = (int) result.get("id");
		this.title = (String) result.get("title");
		this.description = (String) result.get("description");
		this.createdAt = (LocalDateTime) result.get("created_at");
		this.updatedAt = (LocalDateTime) result.get("updated_at");
	}

	private int id;
	private String title;
	private String description;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
}
