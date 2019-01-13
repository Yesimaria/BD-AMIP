/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class DatMinis extends javax.swing.JFrame implements IVista{

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
        FechaBaut = new com.toedter.calendar.JDateChooser();
        FechaCon = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Datos ministeriales");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel2.setText("Datos ministeriales");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 440, 60));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setText("Fecha de conversión:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 160, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setText("Fecha de bautismo en agua:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 220, -1));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel5.setText("¿Es bautizado en el Espíritu Santo?");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 280, -1));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel6.setText("¿Qué edad tenía al inicio de su Ministerio?");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 330, -1));

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel7.setText("¿En qué Iglesia u organización inició su Ministerio?");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 390, -1));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel8.setText("Ciudad y Departamento:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 190, -1));

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel9.setText("Mencione los lugares donde ha ejercido su Ministerio:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 420, -1));

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel10.setText("Cargos desempeñados:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 180, -1));

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel11.setText("Grado ministerial:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 140, -1));

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel12.setText("Área de mayor experiencia ministerial:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 300, -1));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btGuardar.png"))); // NOI18N
        btnGuardar.setActionCommand("guardar");
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, 140, 70));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BtCancelar.png"))); // NOI18N
        btnCancelar.setActionCommand("cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, 140, 70));
        getContentPane().add(txtIgleMinis, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 350, 30));
        getContentPane().add(txtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 370, 30));
        getContentPane().add(txtEjerMinis, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 370, 30));
        getContentPane().add(txtCargos, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 370, 30));
        getContentPane().add(txtGradoMinis, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 370, 30));
        getContentPane().add(txtExpeMinis, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, 370, 30));
        getContentPane().add(txtEdadMinis, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 80, 30));

        rdBautizoSi.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        rdBautizoSi.setText("Sí");
        getContentPane().add(rdBautizoSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 50, -1));

        rdBautizoNo.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        rdBautizoNo.setText("No");
        getContentPane().add(rdBautizoNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 50, -1));

        FechaBaut.setDateFormatString("dd/MM/yyyy");
        FechaBaut.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        getContentPane().add(FechaBaut, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 170, 30));

        FechaCon.setDateFormatString("dd/MM/yyyy");
        FechaCon.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        getContentPane().add(FechaCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 170, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo 16.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, 0, 1010, 640));

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
    private com.toedter.calendar.JDateChooser FechaBaut;
    private com.toedter.calendar.JDateChooser FechaCon;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
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

    @Override
    public void aggActionListener(ActionListener acL) {
       btnCancelar.addActionListener(acL);
       btnGuardar.addActionListener(acL);
    }

    @Override
    public void aggKeyListener(KeyListener keyL) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void aggMouseListener(MouseListener mouseL) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public JDateChooser getFechaBaut() {
        return FechaBaut;
    }

    public void setFechaBaut(JDateChooser FechaBaut) {
        this.FechaBaut = FechaBaut;
    }

    public JDateChooser getFechaCon() {
        return FechaCon;
    }

    public void setFechaCon(JDateChooser FechaCon) {
        this.FechaCon = FechaCon;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
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

    public JLabel getjLabel12() {
        return jLabel12;
    }

    public void setjLabel12(JLabel jLabel12) {
        this.jLabel12 = jLabel12;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
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

    public JRadioButton getRdBautizoNo() {
        return rdBautizoNo;
    }

    public void setRdBautizoNo(JRadioButton rdBautizoNo) {
        this.rdBautizoNo = rdBautizoNo;
    }

    public JRadioButton getRdBautizoSi() {
        return rdBautizoSi;
    }

    public void setRdBautizoSi(JRadioButton rdBautizoSi) {
        this.rdBautizoSi = rdBautizoSi;
    }

    public JTextField getTxtCargos() {
        return txtCargos;
    }

    public void setTxtCargos(JTextField txtCargos) {
        this.txtCargos = txtCargos;
    }

    public JTextField getTxtCiudad() {
        return txtCiudad;
    }

    public void setTxtCiudad(JTextField txtCiudad) {
        this.txtCiudad = txtCiudad;
    }

    public JTextField getTxtEdadMinis() {
        return txtEdadMinis;
    }

    public void setTxtEdadMinis(JTextField txtEdadMinis) {
        this.txtEdadMinis = txtEdadMinis;
    }

    public JTextField getTxtEjerMinis() {
        return txtEjerMinis;
    }

    public void setTxtEjerMinis(JTextField txtEjerMinis) {
        this.txtEjerMinis = txtEjerMinis;
    }

    public JTextField getTxtExpeMinis() {
        return txtExpeMinis;
    }

    public void setTxtExpeMinis(JTextField txtExpeMinis) {
        this.txtExpeMinis = txtExpeMinis;
    }

    public JTextField getTxtGradoMinis() {
        return txtGradoMinis;
    }

    public void setTxtGradoMinis(JTextField txtGradoMinis) {
        this.txtGradoMinis = txtGradoMinis;
    }

    public JTextField getTxtIgleMinis() {
        return txtIgleMinis;
    }

    public void setTxtIgleMinis(JTextField txtIgleMinis) {
        this.txtIgleMinis = txtIgleMinis;
    }
    
    
}
