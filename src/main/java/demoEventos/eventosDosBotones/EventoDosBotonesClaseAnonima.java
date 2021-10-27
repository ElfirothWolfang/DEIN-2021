/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoEventos.eventosDosBotones;

import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Carlos Carbajo Rúa
 */
public class EventoDosBotonesClaseAnonima extends Frame{
        public EventoDosBotonesClaseAnonima() {
        setSize(400,400);
        setTitle("Evento con dos Botones mediante Clase Anónima");
        setVisible(true);
        var main = new Panel(new GridLayout(1, 2));
        add(main);
        var boton1 = new Button("¡Púlsame!");
        var boton2 = new Button("¡Púlsame!");
        main.add(boton1);
        main.add(boton2);
        boton2.setVisible(false);
        
        boton1.addActionListener((ActionEvent e) -> {
            boton1.setVisible(false);
            boton2.setVisible(true);
        });
        
        boton2.addActionListener((ActionEvent e) -> {
            boton1.setVisible(true);
            boton2.setVisible(false);
        });
    }
    
    
    
    public static void main (String [] args) {
        var ventana = new EventoDosBotonesClaseAnonima();
    }
    
}
