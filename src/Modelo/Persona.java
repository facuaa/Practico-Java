/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
public class Persona {
     private String nombre, apellido,fecha;
    private String nacionalidad;
    
    
    public Persona(){
    }
    
    public Persona(String nom, String apel,String fecha, String nac){
    this.nombre=nom;
    this.apellido=apel;
    this.fecha=fecha;
    this.nacionalidad=nac;
    }
//
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public void setNacimiento(String nac){
        this.fecha=nac;
    }
    public String getNacimiento(){
    return fecha;
    }
}

