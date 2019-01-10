/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class InfPersonal extends javax.swing.JFrame implements IVista {

    /**
     * Creates new form InfPersonal
     */
    public InfPersonal() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtLugarNac = new javax.swing.JTextField();
        txtxCedula = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtFechaIngre = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        rdSoltero = new javax.swing.JRadioButton();
        rdCasado = new javax.swing.JRadioButton();
        txtCantHijos = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        txtFechaNac = new javax.swing.JTextField();
        txtLugarNac1 = new javax.swing.JTextField();
        txtLugarNac2 = new javax.swing.JTextField();
        rdFemenino = new javax.swing.JRadioButton();
        rdMasculino = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jlbFondoInfP = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setText("Información personal");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 550, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel3.setText("Nombres:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel4.setText("Apellidos:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 20));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel5.setText("Fecha de nacimiento:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 150, -1));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel6.setText("Lugar de nacimiento:");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 150, 20));

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel7.setText("Cédula o pasaporte:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 150, -1));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel8.setText("Estado Civil:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 120, -1));

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel9.setText("Correo electrónico:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel10.setText("Fecha de ingreso:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 170, -1));

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel11.setText("Cantidad de hijos:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 140, -1));

        jLabel21.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel21.setText("Teléfono fijo:");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 100, 14));

        jLabel2.setText("Código");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 60, 20));
        getContentPane().add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 230, 20));
        getContentPane().add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 230, -1));
        getContentPane().add(txtLugarNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 230, -1));
        getContentPane().add(txtxCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 230, -1));
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 230, -1));
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 230, -1));
        getContentPane().add(txtFechaIngre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 230, -1));

        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 230, -1));

        rdSoltero.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        rdSoltero.setText("Soltero");
        rdSoltero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdSolteroActionPerformed(evt);
            }
        });
        getContentPane().add(rdSoltero, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 100, -1));

        rdCasado.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        rdCasado.setText("Casado");
        getContentPane().add(rdCasado, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 100, -1));

        txtCantHijos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantHijosActionPerformed(evt);
            }
        });
        getContentPane().add(txtCantHijos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 100, -1));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btGuardar.png"))); // NOI18N
        btnGuardar.setActionCommand("guardar");
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setIconTextGap(-3);
        btnGuardar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, 150, 70));

        BtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BtCancelar.png"))); // NOI18N
        BtnCancelar.setActionCommand("cancelar");
        BtnCancelar.setBorder(null);
        BtnCancelar.setBorderPainted(false);
        BtnCancelar.setContentAreaFilled(false);
        BtnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnCancelar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(BtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 530, 150, 70));

        txtFechaNac.setEditable(false);
        txtFechaNac.setBackground(new java.awt.Color(255, 255, 255));
        txtFechaNac.setToolTipText("");
        txtFechaNac.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(txtFechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 220, -1));
        getContentPane().add(txtLugarNac1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 230, -1));
        getContentPane().add(txtLugarNac2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 230, -1));

        rdFemenino.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        rdFemenino.setText("Fememino");
        getContentPane().add(rdFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 100, -1));

        rdMasculino.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        rdMasculino.setText("Masculino");
        rdMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdMasculinoActionPerformed(evt);
            }
        });
        getContentPane().add(rdMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 100, -1));

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel12.setText("Sexo:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 50, -1));

        jlbFondoInfP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo12.png"))); // NOI18N
        getContentPane().add(jlbFondoInfP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1030, -1));
        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, -1));
        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 220, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresActionPerformed

    private void rdSolteroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdSolteroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdSolteroActionPerformed

    private void txtCantHijosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantHijosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantHijosActionPerformed

    private void rdMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdMasculinoActionPerformed

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
            java.util.logging.Logger.getLogger(InfPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InfPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InfPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InfPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InfPersonal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlbFondoInfP;
    private javax.swing.JRadioButton rdCasado;
    private javax.swing.JRadioButton rdFemenino;
    private javax.swing.JRadioButton rdMasculino;
    private javax.swing.JRadioButton rdSoltero;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCantHijos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtFechaIngre;
    private javax.swing.JTextField txtFechaNac;
    private javax.swing.JTextField txtLugarNac;
    private javax.swing.JTextField txtLugarNac1;
    private javax.swing.JTextField txtLugarNac2;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtxCedula;
    // End of variables declaration//GEN-END:variables

    
   
    
    @Override
    public void aggActionListener(ActionListener acL) {
      btnGuardar.addActionListener(acL);
      BtnCancelar.addActionListener(acL);
      rdCasado.addActionListener(acL);
      rdSoltero.addActionListener(acL);
    
    }

    @Override
    public void aggKeyListener(KeyListener keyL) {
       txtApellidos.addKeyListener(keyL);
       txtFechaIngre.addKeyListener(keyL);
       txtCorreo.addKeyListener(keyL);
       txtLugarNac.addKeyListener(keyL);
       txtFechaNac.addKeyListener(keyL);
       
      
    }

    @Override
    public void aggMouseListener(MouseListener mouseL) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public JButton getBtnCancelar() {
        return BtnCancelar;
    }

    public void setBtnCancelar(JButton BtnCancelar) {
        this.BtnCancelar = BtnCancelar;
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public void setBtnGuardar(JButton btnGuardar) {
        this.btnGuardar = btnGuardar;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel10() {
        return jLabel10;
    }

    public void setjLabel10(JLabel jLabel10) {
        this.jLabel10 = jLabel10;
    }

    public JLabel getjLabel11() {
        return jLabel11;
    }

    public void setjLabel11(JLabel jLabel11) {
        this.jLabel11 = jLabel11;
    }

    public JLabel getjLabel21() {
        return jLabel21;
    }

    public void setjLabel21(JLabel jLabel21) {
        this.jLabel21 = jLabel21;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public JLabel getjLabel8() {
        return jLabel8;
    }

    public void setjLabel8(JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    public JLabel getjLabel9() {
        return jLabel9;
    }

    public void setjLabel9(JLabel jLabel9) {
        this.jLabel9 = jLabel9;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JLabel getJlbFondoInfP() {
        return jlbFondoInfP;
    }

    public void setJlbFondoInfP(JLabel jlbFondoInfP) {
        this.jlbFondoInfP = jlbFondoInfP;
    }

    public JRadioButton getRdFemenino() {
        return rdCasado;
    }

    public void setRdFemenino(JRadioButton rdFemenino) {
        this.rdCasado = rdFemenino;
    }

    public JRadioButton getRdMasculino() {
        return rdSoltero;
    }

    public void setRdMasculino(JRadioButton rdMasculino) {
        this.rdSoltero = rdMasculino;
    }

    public JTextField getTxtApellidos() {
        return txtApellidos;
    }

    public void setTxtApellidos(JTextField txtApellidos) {
        this.txtApellidos = txtApellidos;
    }

   

    public JTextField getFechaIngre() {
        return txtFechaIngre;
    }

    public void setFechaIngre(JTextField fechaIngre) {
        this.txtFechaIngre = fechaIngre;
    }

    public JTextField getTxtCorreo() {
        return txtCorreo;
    }

    public void setTxtCorreo(JTextField txtCorreo) {
        this.txtCorreo = txtCorreo;
    }

    public JTextField getTxtFechaNac() {
        return txtFechaNac;
    }

    public void setTxtFechaNac(JTextField txtFechaNac) {
        this.txtFechaNac = txtFechaNac;
    }

    public JTextField getTxtLugarNac() {
        return txtLugarNac;
    }

    public void setTxtLugarNac(JTextField txtLugarNac) {
        this.txtLugarNac = txtLugarNac;
    }

    public JTextField getTxtLugarNac1() {
        return txtLugarNac1;
    }

    public void setTxtLugarNac1(JTextField txtLugarNac1) {
        this.txtLugarNac1 = txtLugarNac1;
    }

    public JTextField getTxtLugarNac2() {
        return txtLugarNac2;
    }

    public void setTxtLugarNac2(JTextField txtLugarNac2) {
        this.txtLugarNac2 = txtLugarNac2;
    }

    public JTextField getTxtNombres() {
        return txtNombres;
    }

    public void setTxtNombres(JTextField txtNombres) {
        this.txtNombres = txtNombres;
    }

    public JTextField getTxtTelefono() {
        return txtTelefono;
    }

    public void setTxtTelefono(JTextField txtTelefono) {
        this.txtTelefono = txtTelefono;
    }

    public JTextField getTxtxCedula() {
        return txtxCedula;
    }

    public void setTxtxCedula(JTextField txtxCedula) {
        this.txtxCedula = txtxCedula;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JTextField getTxtcodigo() {
        return txtcodigo;
    }

    public void setTxtcodigo(JTextField txtcodigo) {
        this.txtcodigo = txtcodigo;
    }

    public JTextField getTxtCantHijos() {
        return txtCantHijos;
    }

    public void setTxtCantHijos(JTextField txtCantHijos) {
        this.txtCantHijos = txtCantHijos;
    }

    public JLabel getjLabel12() {
        return jLabel12;
    }

    public void setjLabel12(JLabel jLabel12) {
        this.jLabel12 = jLabel12;
    }

    public JRadioButton getRdCasado() {
        return rdCasado;
    }

    public void setRdCasado(JRadioButton rdCasado) {
        this.rdCasado = rdCasado;
    }

    public JRadioButton getRdSoltero() {
        return rdSoltero;
    }

    public void setRdSoltero(JRadioButton rdSoltero) {
        this.rdSoltero = rdSoltero;
    }

  
    
    
}
