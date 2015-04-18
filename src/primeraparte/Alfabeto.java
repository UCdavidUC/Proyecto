package primeraparte;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class Alfabeto {
    
    private ArrayList<Simbolo> simbolos; 
    
    public Alfabeto () {
        
    }
    
    public Alfabeto (ArrayList<Simbolo> simbolos) {
        this.simbolos = simbolos;
    }
    
    public ArrayList<Simbolo> getSimbolos () {
        return simbolos;
    }
    public void setSimbolos (ArrayList<Simbolo> simbolos) {
        this.simbolos = simbolos;
    }
    
    public void add (Simbolo simbolo) {
        simbolos.add(simbolo);
    }
    
    public void print () {
        if (simbolos != null) {
            System.out.println("Alfabeto: " + simbolos);
        } else {
            System.out.println("Aún no ha añadido símbolos al alfabeto del afnd");
        }
    }
    
}
