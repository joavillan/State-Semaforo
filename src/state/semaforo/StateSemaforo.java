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
public class StateSemaforo extends Semaforo {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Semaforo s = new Semaforo();
        s.setVisible(true);
        opp.setVisible(false);
        EstadoAmarillo a = new EstadoAmarillo();
        EstadoRojo r = new  EstadoRojo();
        EstadoVerde v = new EstadoVerde();
        amarillo.setVisible(false);
        
        while(true){
            v.mostrar();
            a.mostrar();
            r.mostrar();
        }
        
        
        
    }
   
}
