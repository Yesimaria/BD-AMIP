/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amip;
import Vistas.Inicio;
import Vistas.Menus;
import controller.CInicio;
import controller.CMenus;
/**
 *
 * @author Usuario
 */
public class AMIP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Inicio vinicio = new Inicio();
        CInicio cinicio = new CInicio(vinicio);
        

    }
}
