package br.com.lhamello.agendaliveapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AgendaliveApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgendaliveApplication.class, args);
		System.out.println("Olá Mundo!!!");
	}
}
