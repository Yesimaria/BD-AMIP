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
public class DatMinis extends javax.swing.JFrame {

    /**
     * Creates new form DatMinis
     */
    public DatMinis() {
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
        txtIgleMinis = new javax.swing.JTextField();
        txtCiudad = new javax.swing.JTextField();
        txtEjerMinis = new javax.swing.JTextField();
        txtCargos = new javax.swing.JTextField();
        txtGradoMinis = new javax.swing.JTextField();
        txtExpeMinis = new javax.swing.JTextField();
        txtEdadMinis = new javax.swing.JTextField();
        rdBautizoSi = new javax.swing.JRadioButton();
        rdBautizoNo = new javax.swing.JRadioButton();
        jlbFondoDatMin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel2.setText("Datos ministeriales");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 10, 440, 60);

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setText("Fecha de conversión:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 110, 160, 18);

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setText("Fecha de bautismo en agua:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 180, 220, 18);

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel5.setText("¿Es bautizado en el Espíritu Santo?");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 260, 280, 18);

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel6.setText("¿Qué edad tenía al inicio de su Ministerio?");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 340, 330, 18);

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel7.setText("¿En que Iglesia u organización inició su Ministerio?");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 420, 390, 18);

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel8.setText("Ciudad y Departamento:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(460, 110, 190, 18);

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel9.setText("Mencione los lugares donde ha ejercido su Ministerio:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(460, 180, 420, 18);

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel10.setText("Cargos desempeñados:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(460, 260, 180, 18);

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel11.setText("Grado ministerial:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(460, 340, 140, 18);

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel12.setText("Área de mayor experiencia ministerial:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(460, 420, 300, 18);

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btGuardar.png"))); // NOI18N
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(230, 550, 140, 70);

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BtCancelar.png"))); // NOI18N
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(450, 550, 140, 70);
        getContentPane().add(txtIgleMinis);
        txtIgleMinis.setBounds(20, 450, 370, 30);
        getContentPane().add(txtCiudad);
        txtCiudad.setBounds(460, 140, 370, 30);
        getContentPane().add(txtEjerMinis);
        txtEjerMinis.setBounds(460, 210, 370, 30);
        getContentPane().add(txtCargos);
        txtCargos.setBounds(460, 290, 370, 30);
        getContentPane().add(txtGradoMinis);
        txtGradoMinis.setBounds(460, 370, 370, 30);
        getContentPane().add(txtExpeMinis);
        txtExpeMinis.setBounds(460, 450, 370, 30);
        getContentPane().add(txtEdadMinis);
        txtEdadMinis.setBounds(20, 370, 80, 30);

        rdBautizoSi.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        rdBautizoSi.setText("Sí");
        getContentPane().add(rdBautizoSi);
        rdBautizoSi.setBounds(70, 300, 50, 27);

        rdBautizoNo.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        rdBautizoNo.setText("No");
        getContentPane().add(rdBautizoNo);
        rdBautizoNo.setBounds(130, 300, 50, 27);

        jlbFondoDatMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo14.png"))); // NOI18N
        getContentPane().add(jlbFondoDatMin);
        jlbFondoDatMin.setBounds(1, -5, 880, 640);

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
            java.util.logging.Logger.getLogger(DatMinis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatMinis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatMinis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatMinis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatMinis().setVisible(true);
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
    private javax.swing.JLabel jlbFondoDatMin;
    private javax.swing.JRadioButton rdBautizoNo;
    private javax.swing.JRadioButton rdBautizoSi;
    private javax.swing.JTextField txtCargos;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtEdadMinis;
    private javax.swing.JTextField txtEjerMinis;
    private javax.swing.JTextField txtExpeMinis;
    private javax.swing.JTextField txtGradoMinis;
    private javax.swing.JTextField txtIgleMinis;
    // End of variables declaration//GEN-END:variables
}