/*
 * Clase Símbolo: Esta clase sirve para crear objetos Simbolo que contienen un 
 * caracter.
 * Importante: No se considera lambda como cuerpo de alguna produción.
 */
package segundaparte;

/**
 * 
 * @author Alejandra Martínez Cuevas
 * @author David Sánchez Almanza
 * @version 1.0.0
 */
public class Simbolo {
    
    private char simbolo;
    
    public Simbolo() {
        
    }
    public Simbolo(char simbolo) {
        this.simbolo = simbolo;
    }
    
    public char getSimbolo() {
        return simbolo;
    }
    public void setSimbolo(char sim) {
        simbolo = sim;
    }
    
}
