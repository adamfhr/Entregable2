package com.baz.Model;

import java.util.ArrayList;

public class Favoritos {

    private String id;
    private String usuario;

    private ArrayList<Pelicula> favoritos;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public ArrayList<Pelicula> getFavoritos() {
		return favoritos;
	}

	public void setFavoritos(ArrayList<Pelicula> favoritos) {
		this.favoritos = favoritos;
	}
    
    
    
}
