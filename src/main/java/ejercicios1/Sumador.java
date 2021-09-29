/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios1;

import java.util.Scanner;

/**
 *
 * @author Alumno Tarde
 */
public class Sumador {
    
    public static int sumarN(int n) {
        int r = 0;
        for (int k = 1; k <= n; k++){
            r = r + k;
        }       
        return r;
    }
    
    public static int sumarNPotencias(int n) {
        int r = 0;
        for (int k = 1; k <= n; k++) {
            r = r + k * k;
        }
        return r;
    }
    
    public static int sumarNPares(int n) {
        int r = 0;
        for (int k = 1; k <= n; k++) {
           if (k % 2 == 0){
               r = r + k;
           }
        }
        return r;
    }
    
    public static void main (String args []) {
        Scanner sc = new Scanner (System.in);
        int s = sc.nextInt();
        System.out.println(sumarNPares(s));
    }
}
