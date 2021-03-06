/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
/**
 *
 * @author Usuario
 */
public class Consultar extends javax.swing.JFrame implements IVista{

    /**
     * Creates new form Consultar
     */
    public Consultar() {
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
        btnCancelar = new javax.swing.JButton();
        txtNroPastor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tBusqueda = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtBuscar1 = new javax.swing.JTextField();
        btnBuscar2 = new javax.swing.JButton();
        jlbFondoCons = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consultar");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel2.setText("Consultar");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 220, 50));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setText("Nro. del Pastor:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 120, -1));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Btcanc.png"))); // NOI18N
        btnCancelar.setActionCommand("cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 120, 50));
        getContentPane().add(txtNroPastor, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 90, 20));

        tBusqueda.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        tBusqueda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nro. de Pastor", "Nombre", "Fecha de Ingreso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tBusqueda.setCellSelectionEnabled(true);
        tBusqueda.setEditingColumn(0);
        tBusqueda.setEditingRow(0);
        tBusqueda.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tBusqueda);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 520, 260));

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnModificar.png"))); // NOI18N
        btnModificar.setActionCommand("modificar");
        btnModificar.setBorder(null);
        btnModificar.setBorderPainted(false);
        btnModificar.setContentAreaFilled(false);
        btnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 90, 40));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setText("Buscar:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 60, -1));
        getContentPane().add(txtBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 190, 30));

        btnBuscar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BtBuscar.png"))); // NOI18N
        btnBuscar2.setActionCommand("buscar");
        btnBuscar2.setBorder(null);
        btnBuscar2.setBorderPainted(false);
        btnBuscar2.setContentAreaFilled(false);
        btnBuscar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscar2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnBuscar2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btnBuscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 70, 40));

        jlbFondoCons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo13.png"))); // NOI18N
        getContentPane().add(jlbFondoCons, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 460));

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
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar2;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbFondoCons;
    private javax.swing.JTable tBusqueda;
    private javax.swing.JTextField txtBuscar1;
    private javax.swing.JTextField txtNroPastor;
    // End of variables declaration//GEN-END:variables

    @Override
    public void aggActionListener(ActionListener acL) {
       btnBuscar2.addActionListener(acL);
       btnCancelar.addActionListener(acL);
       btnModificar.addActionListener(acL);
    }

    @Override
    public void aggKeyListener(KeyListener keyL) {
    txtBuscar1.addKeyListener(keyL);
    txtNroPastor.addKeyListener(keyL);
    }

    @Override
    public void aggMouseListener(MouseListener mouseL) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public JButton getBtnBuscar2() {
        return btnBuscar2;
    }

    public void setBtnBuscar2(JButton btnBuscar2) {
        this.btnBuscar2 = btnBuscar2;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public JButton getBtnModificar() {
        return btnModificar;
    }

    public void setBtnModificar(JButton btnModificar) {
        this.btnModificar = btnModificar;
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

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JLabel getJlbFondoCons() {
        return jlbFondoCons;
    }

    public void setJlbFondoCons(JLabel jlbFondoCons) {
        this.jlbFondoCons = jlbFondoCons;
    }

    public JTable gettBusqueda() {
        return tBusqueda;
    }

    public void settBusqueda(JTable tBusqueda) {
        this.tBusqueda = tBusqueda;
    }

    public JTextField getTxtBuscar1() {
        return txtBuscar1;
    }

    public void setTxtBuscar1(JTextField txtBuscar1) {
        this.txtBuscar1 = txtBuscar1;
    }

    public JTextField getTxtNroPastor() {
        return txtNroPastor;
    }

    public void setTxtNroPastor(JTextField txtNroPastor) {
        this.txtNroPastor = txtNroPastor;
    }
    
    
}
