package com.baz.Bussiness;

import com.baz.Interfaces.Album;

public class BatchProceso implements Album{

	private final String archivo;
	
	public BatchProceso(String archivo) {
		this.archivo=archivo;
		cargarLocal(archivo);
	}

	@Override
	public void proceso() {
		System.out.println("Procesando archivo...:"+archivo);	
	}
	
	private void cargarLocal(String archivo) {
		System.out.println("Empezando simulacion de carga");
		
		for(int i=0; i<10; i++) {
			System.out.println("Cargando "+archivo+" "+i*10+"%");
		}
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			
		}
		
		System.out.println("Archivo Cargado: "+archivo);
	}
	
	
}
