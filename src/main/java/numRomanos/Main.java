/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numRomanos;

import java.util.Scanner;

/**
 *
 * @author Alumno Tarde
 */
public class Main {
    
    public static void main (String args []) {
        Scanner sc = new Scanner (System.in);
        int s = sc.nextInt();
        for (int k = 1; k <= s; k++) {
            DecToRoman romano = new DecToRoman (k);
            System.out.println(k + " . " + romano.toString());  
        }

    }
}
