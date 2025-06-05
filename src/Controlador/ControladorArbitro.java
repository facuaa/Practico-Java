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

public void eliminarArbitro(Arbitro j, int indice) {
    if(j!= null){
      for (int i = 0; i < listaArbitros.size(); i++) {
            Arbitro actual = listaArbitros.get(i);
            if (actual.getNombre().equals(j.getNombre()) &&
                actual.getApellido().equals(j.getApellido()) &&
                actual.getNacimiento().equals(j.getNacimiento()) &&
                actual.getTarjetasTotales()==j.getTarjetasTotales() &&
                actual.getInternacional()== j.getInternacional()){
                listaArbitros.remove(i);
                break;
            }
        }
    }else if (indice >= 0 && indice < listaArbitros.size()) {
        listaArbitros.remove(indice);
    }
}

 public void actualizarArbitro(Arbitro arbitroActualizado) {
        if (arbitroActualizado == null) {
            System.err.println("Error: El árbitro a actualizar es nulo.");
            return;
        }

        try {
            boolean encontrado = false;
            for (int i = 0; i < listaArbitros.size(); i++) {
                Arbitro actual = listaArbitros.get(i);
                // Como no lo tienes explícitamente, usaremos Nombre y Apellido
                // (asumiendo que son únicos para fines de este ejemplo).
                // Podrías añadir más criterios si es necesario para asegurar la unicidad.
                if (actual.getNombre().equals(arbitroActualizado.getNombre()) &&
                    actual.getApellido().equals(arbitroActualizado.getApellido()) &&
                    actual.getNacionalidad().equals(arbitroActualizado.getNacionalidad())&&
                    actual.getTarjetasTotales()== arbitroActualizado.getTarjetasTotales() &&
                    actual.getInternacional() == arbitroActualizado.getInternacional()) {
                    // Reemplazar el objeto completo en la lista es una forma sencilla:
                    listaArbitros.set(i, arbitroActualizado); // Reemplaza el objeto antiguo por el nuevo (modificado)
                    encontrado = true;
                    System.out.println("Árbitro actualizado en el controlador: " + arbitroActualizado.getNombre() + " " + arbitroActualizado.getApellido() +
                                       " - Tarjetas: " + arbitroActualizado.getTarjetasTotales() + ", Internacional: " + arbitroActualizado.getInternacional());
                    break; // Salimos del bucle una vez que lo encontramos y actualizamos
                }
            }

            if (!encontrado) {
                System.out.println("Advertencia: No se encontró el árbitro para actualizar en el controlador: " +
                                   arbitroActualizado.getNombre() + " " + arbitroActualizado.getApellido() +
                                   ". No se realizó ninguna actualización.");
                // Opcional: Podrías lanzar una excepción o notificar a la UI que la actualización falló
            }
        } catch (Exception ex) {
            System.err.println("Error inesperado al intentar actualizar el árbitro en el controlador: " + ex.getMessage());
            ex.printStackTrace();
            // Opcional: Lanzar una excepción específica o propagarla
        }
    }


}