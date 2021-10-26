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
        Panel main = new Panel(new GridBagLayout());
        Panel displayPanel = new Panel(new FlowLayout());
        Panel panelNumeros = new Panel(new GridLayout(4,3));
        Panel panelOperaciones = new Panel (new GridLayout (4,1));
        this.add(main);
        
        TextField display = new TextField();
        display.setColumns(10);
        displayPanel.add (display);
        
        String [] numeros = {
           "7", "8", "9",
           "4", "5", "6",
           "1", "2", "3",
           "0", ".", "EXP"
        };
        
        String [] operaciones = {
            "/", "*", "-", "+"
        };
        
        Button botones[] = new Button[12];
        Button botonesOperaciones [] = new Button [4];
        
        for (int i = 0; i < numeros.length; i++) {
            botones[i] = new Button(numeros[i]);
            final int x = i;
            botones[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("He pulsado " + x);
                }
            }); 
            panelNumeros.add(botones[i]);
            
        }
        
        for (int i = 0; i < operaciones.length; i++) {
            botonesOperaciones[i] = new Button (operaciones[i]);
            final int x = i;
            botonesOperaciones[i].addActionListener(new ActionListener () {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("He pulsado " + x);
                }
            } );
            panelOperaciones.add(botonesOperaciones[i]);
            
        }
        
        
        
        
        GridBagConstraints gbc = new GridBagConstraints();
        
        gbc.gridheight = 1;
        gbc.gridwidth = 4;
        gbc.gridx = 0;
        gbc.gridy = 0;
        main.add(displayPanel, gbc);
        
        gbc.gridheight = 1;
        gbc.gridwidth = 3;
        gbc.gridx = 0;
        gbc.gridy = 1;
        main.add(panelNumeros, gbc);
        
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.gridx = 3;
        gbc.gridy = 1;
        main.add(panelOperaciones, gbc);
        
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
