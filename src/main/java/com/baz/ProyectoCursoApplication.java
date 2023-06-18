package com.baz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.annotation.SessionScope;

import com.baz.Bussiness.MoviesBusiness;
import com.baz.Model.SessionService;

@SpringBootApplication
public class ProyectoCursoApplication {

	@Bean
	@SessionScope
	public SessionService sessionService() {
	    return new SessionService();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoCursoApplication.class, args);
		
		
		
	}

}
