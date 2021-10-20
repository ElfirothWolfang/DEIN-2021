/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorialVentanas;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

/**
 *
 * @author Alumno Tarde
 */
public class Ventana2 extends Frame {
    public Ventana2() {
        Panel pn1 = new Panel();
        Panel pn2 = new Panel();
        pn1.setLayout(new FlowLayout());
        pn2.setLayout(new GridLayout());
        this.add(pn1);
        this.add(pn2);
        pn1.add(new Button("Botón 1"));
        pn1.add(new Button("Botón 2"));
        pn1.add(new Button("Botón 3"));
        pn1.add(new Button("Botón 4"));
        pn2.add(new Button("Botón 5"));
        pn2.add(new Button("Botón 6"));
        pn2.add(new Button("Botón 7"));
        pn2.add(new Button("Botón 8"));
        setSize(400,400);
        setTitle("Ventana");
        setVisible(true);
        pn2.setVisible(false);
        pn1.setVisible(true);
    }
    
    public static void main(String args[]){
        Ventana2 mF =new Ventana2(); 
    }
}
