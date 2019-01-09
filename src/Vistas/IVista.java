/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;


public interface IVista {
    public void aggActionListener(ActionListener acL);
    public void aggKeyListener(KeyListener keyL);
    public void aggMouseListener(MouseListener mouseL);
}
