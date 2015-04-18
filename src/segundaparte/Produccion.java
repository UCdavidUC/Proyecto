/*
 * Clase Produccion: Esta clase permite representar una produccion de una gramá-
 * tica, el constructor tiene un Símbolo no terminal y la cadena que produce.
 */
package segundaparte;

/**
 *
 * @author Alejandra Martínez Cuevas
 * @author David Sánchez Almanza
 * @version 1.0.0
 */
public class Produccion {
    
    private SimboloNoTerminal noTerminal;
    private Cadena cadena;
    
    public Produccion(){
        
    }
    public Produccion(SimboloNoTerminal noTerminal, Cadena cadena) {
        this.noTerminal = noTerminal;
        this.cadena = cadena;
    }
    
    public SimboloNoTerminal getNoTerminal() {
        return noTerminal;
    }
    public void setNoTerminal (SimboloNoTerminal sim) {
        noTerminal = sim;
    }
    public Cadena getCadena() {
        return cadena;
    }
    public void setCadena (Cadena c) {
        cadena = c;
    }
        
    public void print() {
        System.out.print(noTerminal + " -> " + cadena);
    }
    
}
