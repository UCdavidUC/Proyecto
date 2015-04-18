package primeraparte;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejandra Martínez Cuevas
 * @author David Sánchez Almanza
 * @version 1.2.0
 */
public class EFinales {
    
    private ArrayList<Estado> estadosFinales;
    
    public EFinales () {
        
    }
    
    public EFinales (ArrayList<Estado> estadosFinales) {
        this.estadosFinales = estadosFinales;
    }
    
    public ArrayList<Estado> getEstados () {
        return estadosFinales;
    }
    public void setEstados (ArrayList<Estado> estadosFinales) {
        this.estadosFinales = estadosFinales;
    }
    
    public void add (String s) {
        Estado estado = new Estado(s);
        estadosFinales.add(estado);
    }
    
    public void print () {
        if (estadosFinales != null) {
            System.out.println("Estados Finales: " + estadosFinales);
        } else {
            System.out.println("Aún no se han establecido los estados finales");
        }
    }
    
}
