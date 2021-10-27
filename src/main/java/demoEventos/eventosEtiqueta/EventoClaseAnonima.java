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
public class EventoClaseAnonima extends Frame {
    
    public EventoClaseAnonima() {
        setSize(400,400);
        setTitle("Evento mediante clase Anónima");
        setVisible(true);
        var main = new Panel();
        add(main);
        var boton = new Button("¡Púlsame!");
        main.add(boton);
        boton.addActionListener((ActionEvent e) -> {
            boton.setLabel("¡Me pulsaste!");
        });
    }
    
    
    
    public static void main (String [] args) {
        var ventana = new EventoClaseAnonima();
    }
}
