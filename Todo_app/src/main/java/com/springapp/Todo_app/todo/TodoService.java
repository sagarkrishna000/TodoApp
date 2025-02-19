package com.springapp.Todo_app.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

	private static List<Todo> todos = new ArrayList<Todo>();
	
	private static int count = 0;
	
	static {
		todos.add(new Todo(++count, "Sagar", "Spring Boot", LocalDate.now().plusMonths(2), false));
		todos.add(new Todo(++count, "Sagar", "DevOps", LocalDate.now().plusMonths(3), false));
		todos.add(new Todo(++count, "Sagar", "AWS Cloud", LocalDate.now().plusMonths(6), false));
		todos.add(new Todo(++count, "Sagar", "Full Stack Development", LocalDate.now().plusMonths(6), false));
	}

	public List<Todo> findByUsername(String string) {
		return todos;
	}
	
	public void addTodo(String username, String description, LocalDate date, boolean done) {
		Todo todo = new Todo(++count, username, description, date, done);
		todos.add(todo);
	}
}
