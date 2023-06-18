package com.baz.Model;

public class Usuario implements Cloneable{


    private String nombre;
    private String correo;
    private String nacionalidad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public Usuario clone()  {
        Usuario usuarioclon = new Usuario();
        usuarioclon.setNacionalidad(this.getNacionalidad());
        usuarioclon.setNombre(this.getNombre());
        usuarioclon.setCorreo(this.getCorreo());
        return usuarioclon;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                '}';
    }
}
