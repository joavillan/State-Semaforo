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
        
        //Se instancias las clases de los estados
        EstadoAmarillo a = new EstadoAmarillo();
        EstadoRojo r = new  EstadoRojo();
        EstadoVerde v = new EstadoVerde();
        
        //Se llama a la vista y se inicializa
        Semaforo s = new Semaforo();
        s.setVisible(true);
        
        opp.setVisible(false);
        
        /**
         * Se hace un bucle con los estados del semaforo para que vayan cambiando
         */
        while(true){
            opp.setVisible(false);
            v.mostrar();
            a.mostrar();
            opp.setVisible(true);
            r.mostrar();
        }
        
        /*verde.setVisible(true);
        System.out.println("Llega");*/
        
    }
   
}
