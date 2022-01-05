/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concursopreguntas;

/**
 *
 * @author Juan David Rivera
 */
import conexion.Conexion;
import java.util.ArrayList;
import modelo.ModCategoria;
import controlador.ConCategoria;
import controlador.ConPreguntas;
import controlador.conJugador;
import static java.lang.System.console;
import modelo.ModPreguntas;
import vista.VistaInicio;

public class ConcursoPreguntas {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //VistaInicio inicio = new VistaInicio();
    //inicio.setVisible(true);
    ArrayList<ModPreguntas> listapreguntas = new ArrayList();
    conJugador jugador = new conJugador();
    int elegircategoria = jugador.elegirCategoria();
    System.out.println(elegircategoria);
    int nivel = jugador.getNivel();
    System.out.println(nivel);
    ConPreguntas conpreguntas = new ConPreguntas();
    listapreguntas = conpreguntas.consultaPregunta(elegircategoria, nivel);
    for(int index = 0; index < listapreguntas.size(); index++){
      System.out.println(listapreguntas.get(index).getNombre());
    }
  }

}
