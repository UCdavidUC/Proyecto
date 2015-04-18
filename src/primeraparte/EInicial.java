package primeraparte;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class EInicial {
    
    private Estado estadoInicial;
    
    public EInicial () {
        
    }
    
    public EInicial (Estado estado) {
        this.estadoInicial = estado;
    }
    
    public Estado getEstado () {
        return estadoInicial;
    }
    public void setEstado (Estado estado) {
        this.estadoInicial = estado;
    }
    
    public void print () {
        if (estadoInicial != null) {
            System.out.println("Estado incial: " + estadoInicial);
        } else {
            System.out.println("No se ha establecido un estado inicial");
        }
    }
    
}
