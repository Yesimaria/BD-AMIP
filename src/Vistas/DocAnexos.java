/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

/**
 *
 * @author Usuario
 */
public class DocAnexos extends javax.swing.JFrame {

    /**
     * Creates new form DocAnexos
     */
    public DocAnexos() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jlbFondoDocAne = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel2.setText("Documentos anexos");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 10, 470, 50);

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setText("Fotocopia de cédula del Pastor:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 110, 250, 18);

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setText("Diplomas de estudios realizados:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 190, 250, 18);

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel5.setText("Constancia de referencias laborales:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 270, 290, 18);

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel6.setText("Referencias personales:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(260, 70, 190, 18);

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel7.setText("Referencias familiares:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 430, 180, 18);

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel8.setText("Fotocopia de la última credencial ministerial:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(460, 110, 350, 18);

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel9.setText("Fotocopia del acta de matrimonio:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(460, 190, 270, 18);

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel10.setText("Fotocopia de cédula del conyuge:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(460, 270, 260, 18);

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel11.setText("Fotocopia de seguro médico:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(460, 350, 230, 18);

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel12.setText("Fotocopia del Sisben:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(460, 430, 170, 18);

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btGuardar.png"))); // NOI18N
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setIconTextGap(-3);
        btnGuardar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(220, 550, 160, 70);

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BtCancelar.png"))); // NOI18N
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setIconTextGap(-3);
        btnCancelar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(420, 550, 150, 70);

        jlbFondoDocAne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo14.png"))); // NOI18N
        getContentPane().add(jlbFondoDocAne);
        jlbFondoDocAne.setBounds(-6, 0, 880, 630);

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
            java.util.logging.Logger.getLogger(DocAnexos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DocAnexos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DocAnexos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DocAnexos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DocAnexos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jlbFondoDocAne;
    // End of variables declaration//GEN-END:variables
}