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
public class Semaforo extends javax.swing.JFrame {

    /**
     * Creates new form Semaforo
     */
    public Semaforo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        rojo = new javax.swing.JLabel();
        amarillo = new javax.swing.JLabel();
        verde = new javax.swing.JLabel();
        semaforo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rojo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Joaquin\\Downloads\\rojo.png")); // NOI18N
        jPanel1.add(rojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        amarillo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Joaquin\\Downloads\\amarillo.png")); // NOI18N
        jPanel1.add(amarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        verde.setIcon(new javax.swing.ImageIcon("C:\\Users\\Joaquin\\Downloads\\verde.png")); // NOI18N
        jPanel1.add(verde, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        semaforo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Joaquin\\Downloads\\semaforo.png")); // NOI18N
        jPanel1.add(semaforo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Semaforo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Semaforo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Semaforo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Semaforo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Semaforo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel amarillo;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JLabel rojo;
    public javax.swing.JLabel semaforo;
    public javax.swing.JLabel verde;
    // End of variables declaration//GEN-END:variables
}
