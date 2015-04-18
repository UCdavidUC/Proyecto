/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeraparte;

import java.util.ArrayList;

/**
 *
 * @author David
 */
public class AFD {
    
    private Estados estados;
    private Alfabeto alfabeto;
    private EInicial eInicial;
    private EFinales eFinales;
    private ArrayList<Transicion> transiciones;
    
    public AFD (Estados estados, Alfabeto alfabeto, EInicial eInicial, EFinales eFinales, ArrayList<Transicion> transiciones) {
        this.estados = estados;
        this.alfabeto = alfabeto;
        this.eInicial = eInicial;
        this.eFinales = eFinales;
        this.transiciones = transiciones;
    }
    
    public Estados getEstados () {
        return estados;
    }
    public void setEstados (Estados estados) {
        this.estados = estados; 
    }
    public Alfabeto getAlfabeto () {
        return alfabeto;
    }
    public void setAlfabeto (Alfabeto alfabeto) {
        this.alfabeto = alfabeto;
    }
    public EInicial getEInicial () {
        return eInicial;
    }
    public void setEInicial (EInicial eInicial) {
        this.eInicial = eInicial;
    }
    public EFinales getEFinales () {
        return eFinales;
    }
    public void setEFinales (EFinales eFinales) {
        this.eFinales = eFinales;
    }
    public ArrayList<Transicion> getTransiciones () {
        return transiciones;
    }
    public void setTransiciones (ArrayList<Transicion> transiciones) {
        this.transiciones = transiciones;
    }
    
    public void add (Transicion transicion) {
        transiciones.add(transicion);
    }
    
    public void print () {
        if (estados != null && alfabeto != null && eInicial != null && eFinales != null && transiciones != null) {
            System.out.println("Resultado");
            System.out.println("Autómata Finito Determinístico");
            System.out.println("Estados: " + estados);
            System.out.println("Alfabeto: " + alfabeto);
            System.out.println("Estados Iniciales: " + eInicial);
            System.out.println("Estados Finales: " + eFinales);
            for (int i = 0; i < transiciones.size(); i++) {
                System.out.println(i + ". " + transiciones.get(i));
            }
        } else {
            System.out.println("No se ha podido completar la integración del autómata, intente ingresar el archivo de texto de nuevo");
        }
    }
    
}
