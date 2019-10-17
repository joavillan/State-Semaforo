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

    long espera = 2000;
     
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
