package com.baz.Model;

import com.baz.Interfaces.SerieInterface;

public abstract class SerieDecorator implements SerieInterface{
	
	protected SerieInterface serieI;
	
	public SerieDecorator(SerieInterface serieI) {
		this.serieI= serieI;
	}
	
	public void empezar() {
		serieI.empezar();
	}
	
}
