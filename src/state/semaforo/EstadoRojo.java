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
public class EstadoRojo extends Semaforo implements EstadoSemaforo{

    //Variable de retardo
    long espera = 4000;
    
    //Metodo que cambia la visibilidad de los Label y aplica el retardo
    @Override
    public void mostrar() {
        try {
            verde.setVisible(false);
            amarillo.setVisible(false);
            rojo.setVisible(true);
            Thread.sleep(espera);
            System.out.println("Rojo");
        } catch (Exception e) {
        }
    }
    
    
}
