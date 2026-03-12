package com.example.practica_con_git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticaConGitApplication {

	public String saludar(){
		return "Hola mundo!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(PracticaConGitApplication.class, args);
	}

}
