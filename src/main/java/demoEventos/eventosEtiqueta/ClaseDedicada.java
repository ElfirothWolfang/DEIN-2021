/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoEventos.eventosEtiqueta;

import java.awt.Button;
import java.awt.event.*;

/**
 *
 * @author Carlos Carbajo Rúa
 */
public class ClaseDedicada implements ActionListener{
    Button boton;
    
    ClaseDedicada(){
        
    }
    
    ClaseDedicada(Button b) {
        boton = b;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        boton.setLabel("¡Me pulsaste!");
    }
    
}
