package com.baz.Bussiness;

import java.time.Duration;

import org.springframework.stereotype.Service;

import reactor.core.publisher.Mono;

@Service
public class ReactivaBusiness {
	
	public Mono<String> hola(){
		return Mono.just("hola asincrono").delayElement(Duration.ofSeconds(3));
	}
	
	public Mono<String> hola2() {    
		return Mono.just("holaasincrono").delayElement(Duration.ofSeconds(3));  
		}
	
}
