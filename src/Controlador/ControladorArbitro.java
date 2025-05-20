/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Arbitro; 
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ControladorArbitro {
    List <Arbitro> listaArbitros; 
    Arbitro arbitro; 

    public ControladorArbitro(List<Arbitro> listaArbitros, Arbitro arbitro) {
        this.listaArbitros = listaArbitros;
        this.arbitro = arbitro;
    }
 
    public ControladorArbitro() {
    }
    public void colocarNombre(String n){
this.arbitro.setNombre(n);
}
public void colocarApellido(String n){
this.arbitro.setApellido(n);
}
public void colocarNacimiento(String n){
this.arbitro.setNacimiento(n);
}//Recordar: Instanciar fecha en vista
public void colocarNacionalidad(String n){
this.arbitro.setNacionalidad(n);
}
 
public void colocarTarjetasTotales(int n){
this.arbitro.setTarjetasTotales(n);
}
public void colocarInternacional(boolean n){
this.arbitro.setInternacional(n);
}
public void colocarArbitroLista(){
listaArbitros.add(arbitro);
}
//



//Filtra los arbitros internacionales
public List arbitroInternacional(boolean i){
List<Arbitro> arbitroInt=new ArrayList<>();
if(i){
for(Arbitro internacional : listaArbitros){
if(internacional.getInternacional()){
    arbitroInt.add(internacional);
}
}
    return arbitroInt;
}else{
     for(Arbitro internacional : listaArbitros){
         if(!internacional.getInternacional()){
             arbitroInt.add(internacional);
         }
     }
    return  arbitroInt;
}
}
}