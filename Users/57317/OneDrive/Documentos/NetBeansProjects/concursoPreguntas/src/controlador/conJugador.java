/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Random;
import modelo.ModCategoria;

/**
 *
 * @author 57317
 */
public class conJugador {
  
  public int nivel = 1;
  
  public conJugador(){
    
  }

  public int elegirCategoria() {
    ArrayList<ModCategoria> listacate = new ArrayList();
    ConCategoria consucategoria = new ConCategoria();
    listacate = consucategoria.consultaCategoria();
    Random aleatorio = new Random();
    int ramdomIndex = aleatorio.nextInt(listacate.size());
    return listacate.get(ramdomIndex).getId_categoria();
    //for(int index = 0; index < listacate.size(); index ++){
    //System.out.println(listacate.get(index).getNombre());
    //}
  }
  
  public String pregunta(int categoria, int nivel){
    return null;
  }
  
  public void aumentarNivel(){
   this.nivel++;
  }
  
  public void reiniciarNivel(){
    this.nivel = 1;
  }

  public int getNivel() {
    return nivel;
  }

  public void setNivel(int nivel) {
    this.nivel = nivel;
  }
  
}
