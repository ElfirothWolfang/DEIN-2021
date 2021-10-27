/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoEventos.eventosDosBotones;

import java.awt.Button;
import java.awt.event.*;


/**
 *
 * @author Carlos Carbajo Rúa
 */
public class DosBotonesClaseDedicada implements ActionListener{
   Button boton1;
   Button boton2;
   int botonPulsado;
    
    DosBotonesClaseDedicada(){
        
    }
    
    DosBotonesClaseDedicada(Button b1, Button b2, int x) {
        boton1 = b1;
        boton2 = b2;
        botonPulsado = x;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       if (botonPulsado == 1) {
           boton1.setVisible(false);
           boton2.setVisible(true);
       } else if (botonPulsado == 2) {
           boton1.setVisible(true);
           boton2.setVisible(false);
       }
    }
    
}
