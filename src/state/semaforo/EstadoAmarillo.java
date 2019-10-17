/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state.semaforo;
/**
 *
 * @author Joaquin
 */
public class EstadoAmarillo extends Semaforo implements EstadoSemaforo{

    //Variable de retardo
    long espera = 2000;
     
    //Metodo que cambia la visibilidad de los Label y aplica el retardo
    @Override
    public void mostrar() {
        try {
            verde.setVisible(false);
            amarillo.setVisible(true);
            rojo.setVisible(false);
            Thread.sleep(espera);
            System.out.println("Amarillo");
            
        } catch (Exception e) {
        }
    }
    
    
}
