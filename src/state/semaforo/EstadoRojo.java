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
public class EstadoRojo extends javax.swing.JFrame implements EstadoSemaforo{
    
    Semaforo s = new Semaforo();
    s.amarillo.setVisible(false);
    
    @Override
    public void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       
    }
    
    
}
