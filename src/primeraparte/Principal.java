package primeraparte;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Curso: Matemáticas Computacionales
 * Clave del Curso: TC2020.2
 * Nombre de la Clase: Principal
 * Description: Esta es la clase principal del proyecto, contiene la 
 * declaracion del método main
 */

/**
 * @author Alejandra Martínez Cuevas
 * @author David Sánchez Almanza
 * @version 1.2.0
 * @since 18-03-2015
 */

public class Principal {
    public static void main (String[] args) throws FileNotFoundException, IOException
    {
        System.out.println("Escribe el nombre del archivo de texto que contiene el AFND");
        Scanner in = new Scanner(System.in);
        String nombreArchivo = in.nextLine();
        String nombreFile = '"' + nombreArchivo + '"';
        FileReader fr = new FileReader(nombreFile);
        System.out.println("El archivo del que leyó es: " + nombreFile);
        
        Estados estadosAFND = new Estados();
        Alfabeto alfabeto = new Alfabeto();
        EInicial eInicial = new EInicial();
        EFinales eFinales = new EFinales();
        ArrayList<Transicion> transicionesAFND = new ArrayList<>();
        
        int a = 1;
        char[] c = new char[2];
        while(a == 1) {
            while ((c[0] = (char) fr.read()) != '\n')
            {
                if (c[0] == 'q') {
                    c[1] = (char) fr.read();
                    String s = new String(c);
                    estadosAFND.add(s);
                } else {
                    c[1] = ' ';
                }
            }
            a = 2;
        }
        estadosAFND.print();
        char d;
        while(a == 2) {
            while ((d = (char) fr.read()) != '\n') {
                if (d != ',') {
                    Simbolo sim = new Simbolo(d);
                    alfabeto.add(sim);
                }
            }
            a = 3;
        }
        alfabeto.print();
        while (a == 3) {
            while ((c[0] = (char) fr.read()) != '\n') {
                if (c[0] == 'q') {
                    c[1] = (char) fr.read();
                    String s = new String(c);
                    Estado estado = new Estado(s);
                    eInicial.setEstado(estado);
                }
            }
            a = 4;
        }
        eInicial.print();
        while (a == 4) {
            while ((c[0] = (char) fr.read()) != '\n') {
                if (c[0] == 'q') {
                    c[1] = (char) fr.read();
                    String s = new String(c);
                    eFinales.add(s);
                } else {
                    c[1] = ' ';
                }
            }
            a = 5;
        }
        eFinales.print();
        while (a == 5) {
            c[0] = (char) fr.read();
            c[1] = (char) fr.read();
            String s = new String(c);
            Estado eEntrada = new Estado(s);
            c[0] = (char) fr.read();
            c[1] = (char) fr.read();
            Simbolo simbolo = new Simbolo(c[1]);
            c[0] = (char) fr.read();
            c[1] = (char) fr.read();
            ArrayList<Estado> estadosLlegada = new ArrayList<>();
            while ((c[0] = (char) fr.read()) != '\n') {
                if (c[0] == 'q') {
                    c[1] = (char) fr.read();
                    s = new String(c);
                    Estado estado = new Estado(s);
                    estadosLlegada.add(estado);
                }
            }
            Transicion transicion = new Transicion(eEntrada, simbolo, estadosLlegada);
            transicionesAFND.add(transicion);
        }
    }
}
