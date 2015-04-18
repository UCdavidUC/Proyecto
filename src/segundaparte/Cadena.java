/*
 * Clase Cadena: Esta clase representa cadenas de Simbolos tanto terminales como
 * no terminales que serán utilizados para construir las producciones, la clase
 * utiliza un ArrayList<Simbolo> para hacer una lista de Simbolos que represen-
 * ta la cadena.
 */
package segundaparte;

import java.util.ArrayList;

/**
 *
 * @author Alejandra Martínez Cuevas
 * @author David Sánchez Almanza
 * @version 1.0.0
 */
public class Cadena {
    
    private ArrayList<Simbolo> cadena;
    
    public Cadena() {
        
    }
    
    public ArrayList<Simbolo> getCadena() {
        return cadena;
    }
    public void setCadena(ArrayList<Simbolo> c) {
        cadena = c;
    }
    
    public void addSimboloNoTermial(char s) {
        SimboloNoTerminal sim = new SimboloNoTerminal(s);
        cadena.add(sim);
    }
    public void addSimboloTerminal(char s) {
        SimboloTerminal sim = new SimboloTerminal(s);
        cadena.add(sim);
    }
    
    public void print () {
        System.out.print(cadena);
    }
    
}
