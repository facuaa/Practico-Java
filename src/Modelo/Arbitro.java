/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Arbitro extends Persona{
 
    private int tarjetasTotales;
    private boolean internacional;
    
    public Arbitro(String nom, String apel, String fecha, String nac,int tarjetas, boolean internacional){
        super(nom,apel,fecha,nac);
        this.tarjetasTotales=tarjetas;
        this.internacional=internacional;
    }

    public Arbitro() {
    }
    public int getTarjetasTotales() {
        return tarjetasTotales;
    }

    public void setTarjetasTotales(int tarjetasTotales) {
        this.tarjetasTotales = tarjetasTotales;
    }

    public boolean getInternacional() {
        return internacional;
    }

    public void setInternacional(boolean internacional) {
        this.internacional = internacional;
    }

    @Override
    public String toString() {
        return "Arbitros{" + "tarjetasTotales=" + tarjetasTotales + ", internacional=" + internacional + '}';
    }
    
}
