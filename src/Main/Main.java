/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;
import Controlador.ControladorArbitro;
import Controlador.ControladorJugador;
import Modelo.Arbitro;
import Modelo.Jugador;
import Vista.Dashboard;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

   public class Main {
    public static void main(String[] args) {
        List<Arbitro> listaArbitro = new ArrayList<>();
        List<Jugador> listaJugador = new ArrayList<>();
        ControladorJugador controladorJugador = new ControladorJugador(listaJugador);
        ControladorArbitro controladorArbitro = new ControladorArbitro(listaArbitro);
        Dashboard vistaGeneral = new Dashboard(controladorJugador, controladorArbitro);
        
        // Precargar Jugadores
        File jugadorArchivo = new File("data/Jugadores.txt");
        if (jugadorArchivo.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(jugadorArchivo))) {
                String linea;
        //Equipo,Nombre,Apellido,fecha,Nacionalidad,posicion,goles,tar Amarillas, tar Rojas
       
        while (true) {
            
            String nombreEquipo = br.readLine();
            if (nombreEquipo == null) break; //Si alguno de los campos esta vacio sea por lo que sea, sale de la precarga paaaa
            
            String nombre = br.readLine();
            if (nombre == null) break;
            
            String apellido = br.readLine();
            if (apellido == null) break;

            String fecha = br.readLine();
            if (fecha == null) break;

            String nacionalidad = br.readLine();
            if (nacionalidad == null) break;
            
            String posicion = br.readLine();
            if (posicion == null) break;
            
            String goles = br.readLine();
            if (goles == null) break;
            
            String amarillas = br.readLine();
            if (amarillas == null) break;
            
            String rojas = br.readLine();
            if (rojas == null) break;
            
            Jugador temp = new Jugador();
   
    temp.setClubActual(nombreEquipo);
    temp.setNombre(nombre);
    temp.setApellido(apellido);
    temp.setNacimiento(fecha);
    temp.setNacionalidad(nacionalidad);
    temp.setPosicion(posicion);
    temp.setGoles(goles);
    temp.setTarjetasAmarillas(amarillas);
    temp.setTarjetasRojas(rojas);
    
    listaJugador.add(temp);
}

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

     
        vistaGeneral.setVisible(true);

        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(jugadorArchivo, true))) {
            
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
 
    }
   }
