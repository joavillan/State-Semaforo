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
public class EstadoVerde extends Semaforo implements EstadoSemaforo{

    long espera = 4000;
     
    @Override
    public void mostrar() {
        try {
            verde.setVisible(true);
            amarillo.setVisible(false);
            rojo.setVisible(false);
            Thread.sleep(espera);
            System.out.println("Verde");
            
        } catch (Exception e) {
        }
    }
    
    
}
