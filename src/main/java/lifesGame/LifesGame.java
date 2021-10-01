/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lifesGame;

/**
 *
 * @author Alumno Tarde
 */
public class LifesGame {
    private final Casilla [] tablero;
    private final int ejeX;
    private final int ejeY;
    
    public LifesGame (int x , int y) {
        this.tablero = new Casilla [x * y];
        this.ejeX = x;
        this.ejeY = y;
        
        for (int k = 0; k < this.tablero.length; k++) {
            this.tablero[k] = new Casilla();
        }
    }
    
    public void cambiarEstado (int x) {
        this.tablero[x].cambiarEstado();
    }

    
    public boolean estado (int x) {
        return this.tablero[x].getEstado();
    }
    
    private void setCambio (int x) {
        this.tablero[x].setCambio();
    }
    
    private boolean getCambio (int x) {
        return this.tablero[x].getCambio();
    }
    
    public void turno() {
        for (int k = 0; k < this.tablero.length; k++) {
            if ((comprobarVecinos(k) < 2 || comprobarVecinos(k) > 3) && estado(k)) {
                setCambio(k);
            } else if (comprobarVecinos(k) == 3 && !estado(k)) {
                setCambio(k);
            }           
        }
        
        for (int k = 0; k < this.tablero.length; k++) {
            if (getCambio(k)){
                cambiarEstado(k);
                setCambio(k);
            }
        }
    }
    
    private int comprobarVecinos (int x) {
        int vecinos = 0;
        
        if (x + 1 < this.tablero.length && estado(x + 1)  ){
            vecinos++;
        }
        
        if (x - 1 >= 0 && estado(x - 1)) {
            vecinos++;
        }
        
        if (x + ejeX < this.tablero.length && estado(x + ejeX)){
            vecinos++;
        }
        
        if (x - ejeX >= 0 && estado(x - ejeX) ){
            vecinos++;
        }
        
        if (x + ejeX + 1 < this.tablero.length && estado(x + ejeX + 1)){
            vecinos++;
        }
        
        if (x + ejeX - 1 < this.tablero.length && estado(x + ejeX - 1)){
            vecinos++;
        }
        
        if (x - ejeX + 1 >= 0 && estado(x - ejeX + 1)){
            vecinos++;
        }
        
        if (x - ejeX - 1 >= 0 && estado(x - ejeX - 1)){
            vecinos++;
        }
        
        return vecinos;
    }
    
    @Override
    public String toString() {
       int nLinea = 0;
       StringBuilder sb = new StringBuilder();
       for (int k = 0; k < this.tablero.length; k++) {
           if (estado(k)){
               sb.append("O");
           } else {
               sb.append("*");
           }
           nLinea++;
           
           if (nLinea == 10) {
               sb.append("\n");
               nLinea = 0;
           }
       }
       
       return sb.toString();
    }
}
