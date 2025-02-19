package com.springapp.Todo_app.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping("hello")
	@ResponseBody
	public String hello() {
		return "Hello World!";
	}
	
	@RequestMapping("hello-jsp")
	public String helloJsp() {
		return "hello";
	}

}
