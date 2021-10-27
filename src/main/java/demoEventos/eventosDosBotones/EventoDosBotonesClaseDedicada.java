/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoEventos.eventosDosBotones;
import java.awt.*;
/**
 *
 * @author Carlos Carbajo Rúa
 */
public class EventoDosBotonesClaseDedicada extends Frame{
    private final Button boton1;
    private final Button boton2;
    
    public EventoDosBotonesClaseDedicada() {
        setSize(400,400);
        setTitle("Evento con dos Botones mediante Clase Dedicada");
        setVisible(true);
        var main = new Panel(new GridLayout(1, 2));
        add(main);
        boton1 = new Button("¡Púlsame!");
        boton2 = new Button("¡Púlsame!");
        main.add(boton1);
        main.add(boton2);
        boton2.setVisible(false);
        var actionListener1 = new DosBotonesClaseDedicada(boton1, boton2, 1);
        var actionListener2 = new DosBotonesClaseDedicada(boton1, boton2, 2);
        boton1.addActionListener(actionListener1);
        boton2.addActionListener(actionListener2);
    }
    
    
    
    public static void main (String [] args) {
        var ventana = new EventoDosBotonesClaseDedicada();
    } 
}
