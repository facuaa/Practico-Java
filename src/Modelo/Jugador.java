/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
public class Jugador extends Persona{
    private String clubActual, posicion;
    private String goles, tarjetasAmarillas, tarjetasRojas;
    
    public Jugador(){
    }
    public Jugador(String nom, String apel, String fecha, String nac, String club, String posicion,String goles, String tarAmarillas, String tarRojas){
    super(nom,apel,fecha,nac);
    this.clubActual=club;
    this.posicion=posicion;
    this.goles=goles;
    this.tarjetasAmarillas= tarAmarillas;
    this.tarjetasRojas= tarRojas;
    }
//
    public String getClubActual() {
        return clubActual;
    }

    public void setClubActual(String clubActual) {
        this.clubActual = clubActual;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getGoles() {
        return goles;
    }

    public void setGoles(String goles) {
        this.goles = goles;
    }

    public String getTarjetasAmarillas() {
        return tarjetasAmarillas;
    }

    public void setTarjetasAmarillas(String tarjetasAmarillas) {
        this.tarjetasAmarillas = tarjetasAmarillas;
    }

    public String getTarjetasRojas() {
        return tarjetasRojas;
    }

    public void setTarjetasRojas(String tarjetasRojas) {
        this.tarjetasRojas = tarjetasRojas;
    }

    @Override
    public String toString() {
        return "Jugador{" + "clubActual=" + clubActual + ", posicion=" + posicion + ", goles=" + goles + ", tarjetasAmarillas=" + tarjetasAmarillas + ", tarjetasRojas=" + tarjetasRojas + '}';
    }
    
}