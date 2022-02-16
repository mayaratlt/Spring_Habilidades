package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String getHello () {
		return "Habiliadades e mentalidades usadas: Adaptabilidade, Orientação ao futuro, Persistência,";
		
					
	}

	@GetMapping ("/semana")
	public String getHello2 () {
		return "Desenvolver melhor minhas habilidades em Spring, MySQL e Java";
		
	}
}
