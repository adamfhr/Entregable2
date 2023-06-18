package com.baz.dao;




import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.baz.Model.Categoria;
import com.baz.Model.CategoriasSingleton;
import com.baz.Model.Usuario;

@Repository
public class MoviesDao {



    public void cargarCategorias(){
        try {
            CategoriasSingleton categorias = CategoriasSingleton.getCategoriasS();
            ArrayList<Categoria> listaCategoria = new ArrayList<>();
            listaCategoria.add(new Categoria(1, "Accion"));
            listaCategoria.add(new Categoria(2, "Comedia"));
            listaCategoria.add(new Categoria(3, "Ciencia Ficcion"));

            CategoriasSingleton.categorias = listaCategoria;
           System.out.println(CategoriasSingleton.categorias.size());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void cargarUsuarios() {
        Usuario user = new Usuario();
        user.setNombre("Adam Hernandez");
        user.setCorreo("email@outlook.com");
        user.setNacionalidad("Mexicana");

        Usuario user2 = user.clone();
                user2.setNombre("Pedro Magaña");

        System.out.println("usuario 1: " +user.toString());
        System.out.println("usuario 2: " +user2.toString());


    }
}
