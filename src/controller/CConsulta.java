/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import modelo.MPersona;
import Vistas.Consultar;
import Vistas.Inicio;
import Vistas.Menus;
import dao.DAOPersona;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Iterator;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Usuario
 */
public class CConsulta  implements ActionListener, KeyListener{
    
  
    MPersona pers;
    Consultar vconsulta;
    DefaultTableModel tabla;
    DAOPersona daopersona;
    CInicio cinicio;
    Inicio vinicio;
    List<MPersona> persona;
    public CConsulta ( Consultar vconsulta) {
        this.vconsulta = vconsulta;
        vconsulta.aggActionListener(this);
        vconsulta.aggKeyListener(this);
        vconsulta.setLocationRelativeTo(null);
        daopersona = new DAOPersona();
        this.persona = daopersona.listPersonas();
        this.llenarTablaPersona(vconsulta.gettBusqueda(),this.persona);
        vconsulta.setVisible(true);
     }
    
    public void llenarTablaPersona(JTable tabla, List<MPersona> persona) {
        String[] titulos = {"Nro. de Pastor", "Nombre", "Fecha de ingreso"};
        String[] datos = new String[3];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        tabla.setModel(modelo);
        MPersona p;
        int t = 0;
        for (int i = 0; i < persona.size(); i++) {
            p = persona.get(i);
                datos[0] = p.getCodigo();
                datos[1] = p.getNombre();
                datos[2] = p.getFecha_ingreso();
                modelo.addRow(datos);
            }

        }
    
    public void filtrarTabla(JTable table, List<MPersona> persona, String key ){
        Iterator <MPersona> it = persona.iterator();
        while(it.hasNext()){
            if(!it.next().getNombre().equalsIgnoreCase(key)){
                it.remove();
            }
            
            this.llenarTablaPersona(table, persona);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase(vconsulta.getBtnBuscar2().getActionCommand())) {
            String key = vconsulta.getTxtBuscar1().getText().trim();
            this.filtrarTabla(vconsulta.gettBusqueda(), this.persona, key);
        }
        if (e.getActionCommand().equalsIgnoreCase(vconsulta.getBtnModificar().getActionCommand())){
            String codigo = vconsulta.getTxtNroPastor().getText().trim();
            if(!codigo.equals("") || !codigo.isEmpty()){
            Menus vmenus = new Menus();
            CMenus cmenus =  new CMenus(vmenus, codigo);
            vconsulta.setVisible(false);
            }
          
        }
         if(e.getActionCommand().equalsIgnoreCase("salir")){
          vinicio = new Inicio();
            cinicio = new CInicio(vinicio);
          vconsulta.setVisible(false);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
       
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getComponent().equals(vconsulta.getTxtBuscar1())) {
            if (vconsulta.getTxtBuscar1().getText().isEmpty() || vconsulta.getTxtBuscar1().getText().equalsIgnoreCase("")) {
                this.persona = daopersona.listPersonas();
                this.llenarTablaPersona(vconsulta.gettBusqueda(), this.persona);
            }
        }
    }
  
    }
    
