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
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
       List<Arbitro> listaArbitro=new ArrayList<>();
       List<Jugador>listaJugador = new ArrayList<>();
        ControladorJugador controladorJugador=new ControladorJugador(listaJugador);
        ControladorArbitro controladorArbitro=new ControladorArbitro(listaArbitro);
        Dashboard vistaGeneral =new Dashboard(controladorJugador,controladorArbitro);
       vistaGeneral.setVisible(true);
       
    }
    
}