package com.baz.Model;

import com.baz.Interfaces.SerieInterface;

public class SerieAccion extends SerieDecorator{
	
	public SerieAccion(SerieInterface serieI) {
		super(serieI);
	}
	
	
	@Override
	public void empezar() {
		serieI.empezar();
		System.out.println("Empieza capitulo #1");
	}





	
	
	
}
