package com.baz.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.baz.Bussiness.MoviesBusiness;
import com.baz.Bussiness.ReactivaBusiness;
import com.baz.Model.SessionService;
import com.baz.service.sesionGenerator;

import jakarta.annotation.Resource;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class movieController {
	
	@Autowired
	protected MoviesBusiness movie;
	@Autowired
    private SessionService sessionService;
	@Autowired
	private ReactivaBusiness reactivaBusiness;
	
	
	
	@RequestMapping(value = "/test")
	public String ejecuta() {
		movie.ejecuta();
		return("salio");
		
	}
	
	@Resource(name ="sessionScope")
	sesionGenerator sessionScope;
	
	@RequestMapping(value = "/scopes/session")
	public String getSession(final Model model) {
		model.addAttribute("mensaje anterior",sessionScope.getMensaje());
		sessionScope.setMensaje("Hols desde sesion");
		model.addAttribute("mensaje actual", sessionScope.getMensaje());
		return"Primer mensaje: "+model.getAttribute("mensaje anterior") + "Mensaje nuevo: "+model.getAttribute("mensaje actual");
		
	}
	
	@RequestMapping("/hola")  
	public Mono<String> hola() {
		return reactivaBusiness.hola();  
		}  
	
	@RequestMapping("/hola2")  
	public Mono<String> hola2() {    
		return reactivaBusiness.hola2();  
		}  
	
	@RequestMapping("/holas")  
	public Flux<String> holas() {
		Mono<String> mono1= reactivaBusiness.hola();    
		Mono<String> mono2=reactivaBusiness.hola2();    
		Flux<String> flujo=Flux.concat(mono1,mono2);    
		return flujo;  
		}
	

}
