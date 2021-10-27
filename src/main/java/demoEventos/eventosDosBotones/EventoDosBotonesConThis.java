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
public class EventoDosBotonesConThis extends Frame implements ActionListener{
    private final Button boton1;
    private final Button boton2;
    private boolean boton1Visible;
    
    public EventoDosBotonesConThis() {
        setSize(400,400);
        setTitle("Evento con dos Botones mediante This");
        setVisible(true);
        var main = new Panel(new GridLayout(1, 2));
        add(main);
        boton1 = new Button("¡Púlsame!");
        boton2 = new Button("¡Púlsame!");
        main.add(boton1);
        main.add(boton2);
        boton2.setVisible(false);
        boton1Visible = true;
        boton1.addActionListener(this);
        boton2.addActionListener(this);
    }
    
    
    
    public static void main (String [] args) {
        var ventana = new EventoDosBotonesConThis();
    } 

    @Override
    public void actionPerformed(ActionEvent e) {
        if (boton1Visible) {
            boton1.setVisible(false);
            boton2.setVisible(true);
            boton1Visible = false;
        } else {
            boton1.setVisible(true);
            boton2.setVisible(false);
            boton1Visible = true;
        }

    }
}
