/*
 * Clase SimboloNoTerminal: Esta clase permite crear un símbolo no terminal
 * sobre la clase Simbolo, tiene el objetivo de poder diferenciar de los 
 * símbolos terminales.
 */
package segundaparte;

/**
 * 
 * @author Alejandra Martínez Cuevas
 * @author David Sánchez Almanza
 * @version 1.0.0
 */
public class SimboloNoTerminal extends Simbolo {
    
    private char simbolo;
    
    public SimboloNoTerminal() {
        
    }
    public SimboloNoTerminal(char simbolo) {
        this.simbolo = simbolo;
    }
    
}
