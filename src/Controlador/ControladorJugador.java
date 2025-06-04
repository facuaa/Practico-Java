/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
//controlador de la ultima version con precargar arbitros
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
this.jugador=new Jugador();
}
public List<Jugador> pasarListaJugador(){
    return listaJugadores;
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
public void colocarGoles(String n){
this.jugador.setGoles(n);
}
public void colocarTarjetasAmarillas(String n){
this.jugador.setTarjetasAmarillas(n);
}
public void colocarTarjrtasRojas(String n){
this.jugador.setTarjetasRojas(n);
}

//metodo que guarda el jugador de la clase a la lista de la clase //get
public void AgregarJugadorALista(){
listaJugadores.add(jugador);
this.jugador=new Jugador();
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
/*public List cantidadGolesJugador(int g){
    int cont;
    List<Jugador> listaJugadoresConGoles= new ArrayList<>();
    for(Jugador jugadorActual : listaJugadores){
       if(jugadorActual.getGoles() >= g){
           listaJugadoresConGoles.add(jugadorActual);
       }  
    }
    return listaJugadoresConGoles;
}*/
//Jugador con mas expulsiones
/*public Jugador JugadorMasExpulsiones(List<Jugador> m){
    Jugador jug=new Jugador();
 for(int i=0;i<=m.size();i++){
     if(m.get(i).getTarjetasRojas() > jug.getTarjetasRojas()){
        jug=m.get(i);
     }
 }
    return jug;
}*/

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

public void eliminarJugador(Jugador j, int indice){
    if (j != null) {
        // Buscar por igualdad de contenido
        for (int i = 0; i < listaJugadores.size(); i++) {
            Jugador actual = listaJugadores.get(i);
            if (actual.getNombre().equals(j.getNombre()) &&
                actual.getApellido().equals(j.getApellido()) &&
                actual.getNacimiento().equals(j.getNacimiento()) &&
                actual.getClubActual().equals(j.getClubActual())) {
                listaJugadores.remove(i);
                break;
            }
        }
    } else if (indice >= 0 && indice < listaJugadores.size()) {
        listaJugadores.remove(indice);
    }
}
public int verificarCantidadJugadores(String equipo){
    int jugadoresDelClub=0;
    for(Jugador j: listaJugadores){
        String club= j.getClubActual();
        System.out.println("club:"+ club);
        if(j.getClubActual().equals(equipo)){
            jugadoresDelClub++;
        }
    }
    System.out.println("La cantidad de jugadores es:"+jugadoresDelClub);
    if (jugadoresDelClub <= 5) {
        return -1;
    } else if (jugadoresDelClub > 7) { 
        return 0;
    } else { //cubre el caso donde 5 <= jugadoresDelClub <= 7
        return 1; 
    }
   
}
    
public List<Jugador> getListaJugador(){//genera una copia inmutable de la lista
    return List.copyOf(listaJugadores);
}
public void modificarJugador(String nom, String goles, String tarAmarillas, String posicion){
    for(Jugador Jugador : listaJugadores){
            if (Jugador != null && jugador.getNombre() != null && jugador.getNombre().equals(nom)) {
                Jugador.setGoles(goles);
                Jugador.setTarjetasAmarillas(tarAmarillas);
                Jugador.setPosicion(posicion);
            }
    }
}

}