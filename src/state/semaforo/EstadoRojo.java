/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state.semaforo;

import javax.accessibility.AccessibleContext;

/**
 *
 * @author Joaquin
 */
public class EstadoRojo extends Semaforo implements EstadoSemaforo{
    
    Semaforo s = new Semaforo();
    
    //s.setVisible(false);

    public void setAccessibleContext(AccessibleContext accessibleContext) {
        this.accessibleContext = accessibleContext;
    }
    
    
    @Override
    public void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       
    }
    
    
}
