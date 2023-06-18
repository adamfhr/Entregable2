package com.baz.Bussiness;

import com.baz.Interfaces.Album;

public class ProxyBatch implements Album{
	
	private BatchProceso batchProceso;
	private String archivo;
	
	public ProxyBatch(String archivo) {
		this.archivo=archivo;
	}
	
	@Override
	public void proceso() {
	if(batchProceso == null) {
		batchProceso = new BatchProceso(archivo);
	}
		batchProceso.proceso();
	}
	
	

}
