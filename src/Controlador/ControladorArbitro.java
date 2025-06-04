/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
//controlador de la ultima version con precargar arbitros
import Modelo.Arbitro; 
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ControladorArbitro {
    List <Arbitro> listaArbitros; 
    private Arbitro arbitro;

public ControladorArbitro(List<Arbitro> listaArbitros) {
    this.listaArbitros = listaArbitros;
    this.arbitro=new Arbitro();
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
public List<Arbitro> pasarListaArbitro(){
    return listaArbitros;
}
public void AgregarArbitroALista(){
    listaArbitros.add(arbitro);
    this.arbitro=new Arbitro();
}
//
public List<Arbitro> getListaArbitros(){//genera una copia inmutable de la lista
    return List.copyOf(listaArbitros);
}


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

public void eliminarArbitro(int arbitro) {
        listaArbitros.remove(arbitro);
    }

}