package primeraparte;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Alejandra Martínez Cuevas
 * @author David Sánchez Almanza
 * @version 1.2.0
 */
public class Estados {
    
    private ArrayList<Estado> estados;
    
    public Estados () {
        
    }
    
    public Estados (ArrayList<Estado> estados) {
        this.estados = estados;
    }
    
    public ArrayList<Estado> getEstados () {
        return estados;
    }
    public void setEstados (ArrayList<Estado> estados) {
        this.estados = estados;
    }
    
    public void add (String cont) {
        Estado estado = new Estado (cont);
        estados.add(estado);
    }
    
    public void print () {
        if (estados != null) {
            System.out.println("Estados: " + estados);
        } else {
            System.out.println ("Aún no ha añadido estados");
        }
    }
    
}
