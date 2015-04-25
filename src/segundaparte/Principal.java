/*
 * Clase Principal: Esta clase lee el archivo que contiene la gramática, una vez
 * leido realiza las operaciones necesarias para construir el árbol de deriva-
 * ción correcto.
 */
package segundaparte;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Alejandra Martínez Cuevas
 * @author David Sánchez Almanza
 * @version 1.0.0
 */
public class Principal {
    public static void main(String args[]) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduzca el nombre del archivo de texto que contine la gramática");
        String path = in.nextLine();
        String archivo = '"' + path + '"';
        FileReader fileReader = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fileReader);
        //Lee todas las producciones
        //Una vez guardadas inicia el analsis sintáctico descendente
        //Se busca que una vez construida la cadena se almacene en un nodo
        //para hacer los pasos recursivos, se pone una condicion para el primer
        //simbolo no terminal de la cadena, el cual se sustituye por cada una
        //de las producciones correspondientes, esto se puede hacer gracias a 
        //que en las clase produccion existe un simbolo no terminal con el cual
        //se compara el primer no terminal de la cadena con la cual estamos
        //trabajando.
    }
}
