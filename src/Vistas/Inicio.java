/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Usuario
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        this.setTitle("Inicio");
        this.setLocalitationRelativeTo(Inicio.this);
       // this.setResizable(false);
       this.setExtendedState(Inicio.CENTER_ALIGNMENT);
       Image ico = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Amip.png"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnIncluir = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        jlbFondoInicio = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnIncluir.setBackground(new java.awt.Color(255, 255, 255));
        btnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BtInluir.png"))); // NOI18N
        btnIncluir.setBorder(null);
        btnIncluir.setBorderPainted(false);
        btnIncluir.setContentAreaFilled(false);
        btnIncluir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnIncluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIncluir.setIconTextGap(-3);
        btnIncluir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnIncluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btnIncluir);
        btnIncluir.setBounds(50, 130, 180, 80);

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BtConsultar.png"))); // NOI18N
        btnConsultar.setBorder(null);
        btnConsultar.setBorderPainted(false);
        btnConsultar.setContentAreaFilled(false);
        btnConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnConsultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsultar.setIconTextGap(-3);
        btnConsultar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnConsultar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultar);
        btnConsultar.setBounds(50, 220, 180, 80);

        jlbFondoInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo11.png"))); // NOI18N
        getContentPane().add(jlbFondoInicio);
        jlbFondoInicio.setBounds(0, 0, 660, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Inicio().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jlbFondoInicio;
    // End of variables declaration//GEN-END:variables

    private void setLocalitationRelativeTo(Inicio aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setExtendedState(float CENTER_ALIGNMENT) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
