/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import modelo.MPersona;
import Vistas.Consultar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JSpinner;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Usuario
 */
public class CConsulta  {
    
  
    private MPersona pers;
    private Consultar formulario;
    private DefaultTableModel tabla;

    public CConsulta() {
        
        formulario=Consultar.instancia();
        formulario.setVisible(true);
        formulario.agregarActionListener((ActionListener) this);
        formulario.setLocationRelativeTo(null);

        pers= new MPersona();

        
     }
    

    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    
        }
    
 
    
    
}
    
