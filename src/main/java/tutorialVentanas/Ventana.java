/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorialVentanas;

import java.awt.Button;
import java.awt.Frame;

/**
 *
 * @author Alumno Tarde
 */
public class Ventana extends Frame{
    
    public Ventana(){
    Button Boton = new Button();
    this.add(Boton);
    Boton.setLabel("Boton");
    Boton.setVisible(false);
    setSize(400,400);
    setTitle("Ventana");
    setVisible(true);
    }
    
    public static void main(String args[]) {
        Ventana mainFrame = new Ventana();
    }
    
         
}
