/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Usuario
 */
public class Menus extends  javax.swing.JFrame implements IVista {

    /**
     * Creates new form Menus
     */
    public Menus() {
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

        btnInfPersonal = new javax.swing.JButton();
        btnDatLab = new javax.swing.JButton();
        btnDatMinis = new javax.swing.JButton();
        btnEstudRea = new javax.swing.JButton();
        btnDocAnex = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lbpastorname = new javax.swing.JLabel();
        jlbFondoMenu = new javax.swing.JLabel();

        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(657, 523));
        setSize(new java.awt.Dimension(657, 523));
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInfPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IBtInfPer.png"))); // NOI18N
        btnInfPersonal.setToolTipText("");
        btnInfPersonal.setActionCommand("infopersonal");
        btnInfPersonal.setBorder(null);
        btnInfPersonal.setBorderPainted(false);
        btnInfPersonal.setContentAreaFilled(false);
        btnInfPersonal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInfPersonal.setIconTextGap(-3);
        btnInfPersonal.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnInfPersonal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btnInfPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 190, 80));

        btnDatLab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BtDatLab.png"))); // NOI18N
        btnDatLab.setActionCommand("infolaboral");
        btnDatLab.setBorder(null);
        btnDatLab.setBorderPainted(false);
        btnDatLab.setContentAreaFilled(false);
        btnDatLab.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDatLab.setIconTextGap(-3);
        btnDatLab.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnDatLab.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btnDatLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 190, 80));

        btnDatMinis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BtDatMin.png"))); // NOI18N
        btnDatMinis.setActionCommand("infoministerial");
        btnDatMinis.setBorder(null);
        btnDatMinis.setBorderPainted(false);
        btnDatMinis.setContentAreaFilled(false);
        btnDatMinis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDatMinis.setIconTextGap(-3);
        btnDatMinis.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnDatMinis.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btnDatMinis, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 190, 80));

        btnEstudRea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BtEstdReal.png"))); // NOI18N
        btnEstudRea.setActionCommand("infoestudios");
        btnEstudRea.setBorder(null);
        btnEstudRea.setBorderPainted(false);
        btnEstudRea.setContentAreaFilled(false);
        btnEstudRea.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEstudRea.setIconTextGap(-3);
        btnEstudRea.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEstudRea.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEstudRea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstudReaActionPerformed(evt);
            }
        });
        getContentPane().add(btnEstudRea, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 190, 90));

        btnDocAnex.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BtDocmAne.png"))); // NOI18N
        btnDocAnex.setBorder(null);
        btnDocAnex.setBorderPainted(false);
        btnDocAnex.setContentAreaFilled(false);
        btnDocAnex.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDocAnex.setIconTextGap(-3);
        btnDocAnex.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnDocAnex.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btnDocAnex, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 190, 80));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BtGuard.png"))); // NOI18N
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 130, 50));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BtSalir.png"))); // NOI18N
        btnSalir.setActionCommand("salir");
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, 120, 50));

        lbpastorname.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        getContentPane().add(lbpastorname, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 260, 40));

        jlbFondoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo11.png"))); // NOI18N
        getContentPane().add(jlbFondoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 480));

        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnEstudReaActionPerformed(java.awt.event.ActionEvent evt){
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDatLab;
    private javax.swing.JButton btnDatMinis;
    private javax.swing.JButton btnDocAnex;
    private javax.swing.JButton btnEstudRea;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnInfPersonal;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jlbFondoMenu;
    private javax.swing.JLabel lbpastorname;
    // End of variables declaration//GEN-END:variables

    @Override
    public void aggActionListener(ActionListener acL) {
      btnDatLab.addActionListener(acL);
      btnDatMinis.addActionListener(acL);
      btnDocAnex.addActionListener(acL);
      btnEstudRea.addActionListener(acL);
      btnGuardar.addActionListener(acL);
      btnInfPersonal.addActionListener(acL);
      btnSalir.addActionListener(acL);
      
    }

    public JButton getBtnDatLab() {
        return btnDatLab;
    }

    public void setBtnDatLab(JButton btnDatLab) {
        this.btnDatLab = btnDatLab;
    }

    public JButton getBtnDatMinis() {
        return btnDatMinis;
    }

    public void setBtnDatMinis(JButton btnDatMinis) {
        this.btnDatMinis = btnDatMinis;
    }

    public JButton getBtnDocAnex() {
        return btnDocAnex;
    }

    public void setBtnDocAnex(JButton btnDocAnex) {
        this.btnDocAnex = btnDocAnex;
    }

    public JButton getBtnEstudRea() {
        return btnEstudRea;
    }

    public void setBtnEstudRea(JButton btnEstudRea) {
        this.btnEstudRea = btnEstudRea;
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public void setBtnGuardar(JButton btnGuardar) {
        this.btnGuardar = btnGuardar;
    }

    public JButton getBtnInfPersonal() {
        return btnInfPersonal;
    }

    public void setBtnInfPersonal(JButton btnInfPersonal) {
        this.btnInfPersonal = btnInfPersonal;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public void setBtnSalir(JButton btnSalir) {
        this.btnSalir = btnSalir;
    }

    public JLabel getJlbFondoMenu() {
        return jlbFondoMenu;
    }

    public void setJlbFondoMenu(JLabel jlbFondoMenu) {
        this.jlbFondoMenu = jlbFondoMenu;
    }

    public JLabel getLbpastorname() {
        return lbpastorname;
    }

    public void setLbpastorname(JLabel lbpastorname) {
        this.lbpastorname = lbpastorname;
    }

    @Override
    public void aggKeyListener(KeyListener keyL) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void aggMouseListener(MouseListener mouseL) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
