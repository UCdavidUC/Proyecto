/*
 * Clase SímboloTerminal: Esta clase permite crear un símbolo terminal
 * sobre la clase Simbolo, tiene el objetivo de poder diferenciar de los 
 * símbolos no terminales.
 */
package segundaparte;

/**
 *
 * @author Alejandra Martínez Cuevas
 * @author David Sánchez Almanza
 * @version 1.0.0
 */
public class SimboloTerminal extends Simbolo {
    
    private char simbolo;
    
    public SimboloTerminal () {
        
    }
    public SimboloTerminal (char simbolo) {
        this.simbolo = simbolo;
    }
    
}
