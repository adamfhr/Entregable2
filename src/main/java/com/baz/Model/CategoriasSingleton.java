package com.baz.Model;

import java.beans.JavaBean;
import java.util.ArrayList;


@JavaBean
public class CategoriasSingleton {

    private static CategoriasSingleton categoriasS;
    private CategoriasSingleton(){ }
    public static ArrayList<Categoria> categorias;

    public static CategoriasSingleton getCategoriasS(){
        if(categoriasS == null){
            categoriasS = new CategoriasSingleton();
        }
        return categoriasS;
    }
}
