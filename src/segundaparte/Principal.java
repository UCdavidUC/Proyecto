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
        String path = in.nextLine();
        String archivo = '"' + path + '"';
        FileReader fileReader = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fileReader);
    }
}
