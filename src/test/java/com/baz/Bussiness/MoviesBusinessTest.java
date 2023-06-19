package com.baz.Bussiness;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.baz.dao.MoviesDao;

class MoviesBusinessTest {

	@InjectMocks
	private MoviesBusiness moviesBusiness;
	@Mock
	private MoviesDao moviesDao;
	
	 @BeforeEach
	    public void setup() {
	        MockitoAnnotations.openMocks(this);
	    }
	 
	 @Test
	 void ejecutaTest() {
		 moviesBusiness.ejecuta();
	 }

}
