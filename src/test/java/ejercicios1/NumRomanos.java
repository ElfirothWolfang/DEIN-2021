/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios1;

/**
 * Clase a la que se le pasa un número decimal y se convierte a la numeración
 * romana.
 * @author Alumno Tarde
 */

public class NumRomanos {
    
    private String numRomano;
    
    public NumRomanos (int x) {
        if (x >= 1 && x <= 3999) {
            this.numRomano = this.conversor (x);
        } else {
          this.numRomano = null;  
        }
    }
    
    public final String conversor(int x) {
        return " ";
    }
}
