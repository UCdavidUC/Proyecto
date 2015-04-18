/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeraparte;

import java.util.ArrayList;


/**
 *
 * @author Alejandra Martínez Cuevas
 * @author David Sánchez Almanza
 * @version 1.2.0
 */
public class Transicion {
    
    private Estado estadoEntrada;
    private Simbolo simbolo;
    private ArrayList<Estado> estados;
    
    public Transicion (Estado estadoEntrada, Simbolo simbolo, ArrayList<Estado> estados) {
        this.estadoEntrada = estadoEntrada;
        this.simbolo = simbolo;
        this.estados = estados;
    }
    
    public Estado getEstadoEntrada () {
        return estadoEntrada;
    }
    public void setEstadoEntrada (Estado estadoEntrada) {
        this.estadoEntrada = estadoEntrada;
    }
    public Simbolo getSimbolo () {
        return simbolo;
    }
    public void setSimbolo (Simbolo simbolo) {
        this.simbolo = simbolo;
    }
    public ArrayList<Estado> getEstados () {
        return estados;
    }
    public void setEstados (ArrayList<Estado> estados) {
        this.estados = estados;
    }
    
    public void add (Estado estado){
        estados.add(estado);
    }
    
    public void print () {
        if(estadoEntrada != null && simbolo != null && estados != null) {
            System.out.println("(" + estadoEntrada + "," + simbolo + "=>" + estados + ")");
        } else {
            System.out.println("Aún no ha establecido las transiciones");
        }
    }
    
}
