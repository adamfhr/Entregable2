package com.baz.Model;

import com.baz.Interfaces.MoviesInterface;

public class Pelicula extends Video{

    private String nombre;
    private Categoria categoria;

    public Pelicula(MoviesInterface movie){
        super(movie);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void describir(){
        System.out.println("Esta es una pelicula...");
        movie.pintar();
    }

}
