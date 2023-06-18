package com.baz.Model;

public class SessionService {
	
	private String message;

	   public void getMessage() {
	       System.out.println("Session: " + message
	               + " hashcode: " + this.hashCode());
	   }

	   public void setMessage(String message) {
	       this.message = message;
	   }

}
