/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numRomanos;

/**
 *
 * @author Alumno Tarde
 */
public class DecToRoman {
    
    private int decimalActual;
    private String numRomano = "";
    
    public DecToRoman (int x) {
        if (x >= 1 && x <= 3999) {
            this.decimalActual = x;
            this.conversorGlobal();   
        } else if (x <= 0){
          this.decimalActual = 1;
          this.conversorGlobal();
           System.out.println("Número demasiado pequeño, se ha convertido a 1");
        } else {
            this.decimalActual = 3999;
            this.conversorGlobal();
            System.out.println("Número demasiado grande, se ha convertido a 3999");
        }
    }
    
    private void conversorGlobal (){
        if (this.decimalActual >= 1) {
            conversor();
            conversorGlobal();
        }
    }
    
    private void conversor(){
        if (this.decimalActual >= 1000) {
            this.decimalActual -= 1000;
            this.numRomano += "M";
        } else if (this.decimalActual >=900) {
            this.decimalActual -= 900;
            this.numRomano += "CM";
        } else if (this.decimalActual >=500) {
            this.decimalActual -= 500;
            this.numRomano += "D";
        } else if (this.decimalActual >=400) {
            this.decimalActual -= 400;
            this.numRomano += "CD";
        } else if (this.decimalActual >=100) {
            this.decimalActual -= 100;
            this.numRomano += "C";
        } else if (this.decimalActual >=90) {
            this.decimalActual -= 90;
            this.numRomano += "XC";
        } else if (this.decimalActual >=50) {
            this.decimalActual -= 50;
            this.numRomano += "L";
        } else if (this.decimalActual >=40) {
            this.decimalActual -= 40;
            this.numRomano += "XL";
        } else if (this.decimalActual >=10) {
            this.decimalActual -= 10;
            this.numRomano += "X";
        } else if (this.decimalActual >=9) {
            this.decimalActual -= 9;
            this.numRomano += "IX";
        } else if (this.decimalActual >=5) {
            this.decimalActual -= 5;
            this.numRomano += "V";
        } else if (this.decimalActual >=4) {
            this.decimalActual -= 4;
            this.numRomano += "IV";
        } else if (this.decimalActual >=1) {
            this.decimalActual -= 1;
            this.numRomano += "I";
        } 
    }
    
    public String toString(){
        return numRomano;
    }
}