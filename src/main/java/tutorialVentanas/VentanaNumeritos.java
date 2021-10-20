/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorialVentanas;

import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author Alumno Tarde
 */
public class VentanaNumeritos extends Frame implements WindowListener{
       public VentanaNumeritos() {
        setSize(400,400);
        setTitle("Ventana");
        setVisible(true);
        Panel main = new Panel(new GridLayout(4,3));
        main.setSize(400,400);
        this.add(main);
        
        String [] numeros = {
           "7", "8", "9",
           "4", "5", "6",
           "1", "2", "3",
           "0", ".", "EXP"
        };
        
        Button botones[] = new Button[12];
        for (int i = 0; i < numeros.length; i++) {
            botones[i] = new Button(numeros[i]);
            final int x = i;
            botones[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("He pulsado " + x);
                }
            }); 
            main.add(botones[i]);
            
        }
        
        addWindowListener(this);
    }
       
    public void windowClosing ( WindowEvent e) {
        System.exit(0);
    }
    
    public static void main(String args[]){
        VentanaNumeritos nF =new VentanaNumeritos(); 
    } 

    @Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosed(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
