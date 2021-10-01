/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lifesGame;

/**
 *
 * @author Alumno Tarde
 */
public class Casilla {
    boolean vivo;
    boolean cambio;
    
    public Casilla () {
        this.vivo = false;
        this.cambio = false;
    }
    
    public boolean getEstado() {
        return this.vivo;
    }
    
    public void cambiarEstado(){
        this.vivo = !this.vivo;
    }

    public boolean getCambio() {
        return this.cambio;
    }
    
    public void setCambio() {
        this.cambio = !this.cambio;
    }
}
