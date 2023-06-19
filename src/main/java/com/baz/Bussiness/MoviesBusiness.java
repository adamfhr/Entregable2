package com.baz.Bussiness;

import java.lang.reflect.Field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.ExtractingResponseErrorHandler;

import com.baz.Interfaces.Album;
import com.baz.Interfaces.SerieInterface;
import com.baz.Model.Favoritos;
import com.baz.Model.Interestelar;
import com.baz.Model.Pelicula;
import com.baz.Model.Serie;
import com.baz.Model.SerieAccion;
import com.baz.Model.SessionService;
import com.baz.Model.Video;
import com.baz.dao.MoviesDao;


@Component
public class MoviesBusiness {

	@Autowired
    private MoviesDao moviesDao;
	@Autowired
    private SessionService sessionService;



    public void ejecuta(){
    	

        try {
        	
         /////
         	//creacion de singleton
            moviesDao.cargarCategorias();
            
            //creacion de un prototype
            moviesDao.cargarUsuarios();
            
          //Patron de diseño bridge
          	 Video[] video = new Video[1];
            video[0] = new Pelicula(new Interestelar());

            for (Video v: video){
                v.describir();
            }
            
            patronDecorator();
            patronProxy();
            
            reflexion();
            
            
           
        }
        catch (Exception e){
            e.printStackTrace();
        }


    }




	private void reflexion() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Favoritos f = new Favoritos();
		f.setId("1");
		f.setUsuario("user");
		
		Class<? extends Favoritos> extraer = f.getClass();
		Field varUser = extraer.getDeclaredField("usuario");
		
		System.out.println("La variable se llama: "+varUser.getName());
		System.out.println("Es tipo: "+varUser.getType());
		System.out.println("Variable es: "+varUser.getModifiers());

	}



	
	
	private void patronProxy() {
		Album album = new ProxyBatch("Poster.PNG");
		System.out.println("Desde  disco");
		album.proceso();
		System.out.println("Desde no disco");
		album.proceso();
	}



	private void patronDecorator() {
		SerieInterface[] serie = {new Serie(), new SerieAccion(new Serie())}; 
		for (SerieInterface s: serie) {
            s.empezar();
            System.out.print("\n");
        }
	}
}
