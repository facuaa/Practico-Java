/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Jugador;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author facu
 */
public class ControladorJugador {
  //private List<Arbitro> arbitro;
private List<Jugador> listaJugadores;
private Jugador jugador;

public ControladorJugador() {
}
//
public ControladorJugador( List<Jugador> jugador) {
this.listaJugadores =jugador;
}
//jugadores
public void colocarNombre(String n){
this.jugador.setNombre(n);
}
public void colocarApellido(String n){
this.jugador.setApellido(n);
}
public void colocarNacimiento(String n){
this.jugador.setNacimiento(n);
}//Recordar: Instanciar fecha en vista
public void colocarNacionalidad(String n){
this.jugador.setNacionalidad(n);
}
public void colocarClubActual(String n){
this.jugador.setClubActual(n);
}
public void colocarPosicion(String n){
this.jugador.setPosicion(n);
}
public void colocarGoles(int n){
this.jugador.setGoles(n);
}
public void colocarTarjetasAmarillas(int n){
this.jugador.setTarjetasAmarillas(n);
}
public void colocarTarjrtasRojas(int n){
this.jugador.setTarjetasRojas(n);
}

//metodo que guarda el jugador de la clase a la lista de la clase //get
public void AgregarJugadorALista(){
listaJugadores.add(jugador);
}
//contar cantidad de jugadores de un equipo 
public int contarCantidadDeJugadores (List<Jugador> a, String busq){
int cont=0;//contador de jugadores 
for(int i=0; i<=a.size();i++){
    Jugador temp= a.get(i);// obtiene el elemento en i de la lisyta
    if(busq.equals(temp.getClubActual())){//compara los string         
        cont++;
}
}
return cont;
}
 
//jugadores que superan cierta cantidad de goles 
public List cantidadGolesJugador(int g){
    int cont;
    List<Jugador> listaJugadoresConGoles= new ArrayList<>();
    for(Jugador jugadorActual : listaJugadores){
       if(jugadorActual.getGoles() >= g){
           listaJugadoresConGoles.add(jugadorActual);
       }  
    }
    return listaJugadoresConGoles;
}
//Jugador con mas expulsiones
public Jugador JugadorMasExpulsiones(List<Jugador> m){
    Jugador jug=new Jugador();
 for(int i=0;i<=m.size();i++){
     if(m.get(i).getTarjetasRojas() > jug.getTarjetasRojas()){
        jug=m.get(i);
     }
 }
    return jug;
}

//cantidad de jugadores por posicion
public int catidadJugadoresPosicion(String pos){
    int cont=0;
    for(Jugador jugadorPosicion: listaJugadores){
        if(jugadorPosicion.equals(pos)){
            cont++;
        }
    }
    return cont;
}
}