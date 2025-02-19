package com.springapp.Todo_app.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

	private static List<Todo> todos = new ArrayList<Todo>();
	
	static {
		todos.add(new Todo(1, "Sagar", "Spring Boot", LocalDate.now().plusMonths(2), false));
		todos.add(new Todo(2, "Sagar", "DevOps", LocalDate.now().plusMonths(3), false));
		todos.add(new Todo(3, "Sagar", "AWS Cloud", LocalDate.now().plusMonths(6), false));
		todos.add(new Todo(4, "Sagar", "Full Stack Development", LocalDate.now().plusMonths(6), false));
	}

	public List<Todo> findByUsername(String string) {
		return todos;
	}
}
