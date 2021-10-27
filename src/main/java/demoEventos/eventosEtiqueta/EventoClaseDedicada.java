/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoEventos.eventosEtiqueta;

import java.awt.*;


/**
 *
 * @author Carlos Carbajo Rúa
 */
public class EventoClaseDedicada extends Frame{
    
        public EventoClaseDedicada() {
        setSize(400,400);
        setTitle("Evento mediante Clase Dedicada");
        setVisible(true);
        var main = new Panel();
        add(main);
        var boton = new Button("¡Púlsame!");
        main.add(boton);
        var actionListener = new ClaseDedicada(boton);
        boton.addActionListener(actionListener);
    }
    
    
    
    public static void main (String [] args) {
        var ventana = new EventoClaseDedicada();
    }

}
