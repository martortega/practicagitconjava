package com.example.practica_con_git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticaConGitApplication {

	public String saludar(){
		return "Hola mundo!";
	}

	public String saludarConBuilder(){
		StringBuilder sb = new StringBuilder();
		return sb.append("Hola con builder").toString();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(PracticaConGitApplication.class, args);
	}

}
