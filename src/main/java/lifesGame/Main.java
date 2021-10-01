/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lifesGame;

import java.util.Scanner;

/**
 *
 * @author Alumno Tarde
 */
public class Main {
    
    public static void main (String args []) {
        LifesGame lf = new LifesGame(10,10);
        
        lf.cambiarEstado(6);
        lf.cambiarEstado(17);
        lf.cambiarEstado(27);
        lf.cambiarEstado(26);
        lf.cambiarEstado(25);
        
        Scanner sc = new Scanner (System.in);
        int s = sc.nextInt();
        
        System.out.println(lf.toString());
        
        while (s != 0) {
            lf.turno();
            System.out.println(lf.toString());
            sc.nextInt();
        }
    }
    
}
