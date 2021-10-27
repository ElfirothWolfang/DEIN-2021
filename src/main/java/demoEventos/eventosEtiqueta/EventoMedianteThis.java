/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoEventos.eventosEtiqueta;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Carlos Carbajo Rúa
 */
public class EventoMedianteThis extends Frame implements ActionListener{
    Button boton;
    
    public EventoMedianteThis() {
        setSize(400,400);
        setTitle("Evento mediante This");
        setVisible(true);
        var main = new Panel();
        add(main);
        boton = new Button("¡Púlsame!");
        main.add(boton);
        boton.addActionListener(this);

    }
    
    
    
    public static void main (String [] args) {
        var ventana = new EventoMedianteThis();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        boton.setLabel("¡Me pulsaste!");
    }
}
