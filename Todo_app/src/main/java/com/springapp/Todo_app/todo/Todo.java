package com.springapp.Todo_app.todo;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

@Entity
public class Todo {
	
	public Todo() {
		
	}

	@Id
	@GeneratedValue
	private int id;
	private String username;
	private LocalDate date;
	private boolean done;
	
	@Size(min=10, message="Enter atleast 10 characters")
	private String description;
	
	public Todo(int id, String username, String description, LocalDate date, boolean done) {
		super();
		this.username = username;
		this.id = id;
		this.date = date;
		this.done = done;
		
		this.description = description;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Todo [username=" + username + ", id=" + id + ", date=" + date + ", done=" + done + ", description="
				+ description + "]";
	}
	
	
}
