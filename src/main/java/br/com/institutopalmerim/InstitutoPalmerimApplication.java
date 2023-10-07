package br.com.institutopalmerim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InstitutoPalmerimApplication {

	public static void main(String[] args) {
		SpringApplication.run(InstitutoPalmerimApplication.class, args);
	}

}

