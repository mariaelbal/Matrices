/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matricesut6;

import java.util.Scanner;
import static matricesut6.MatricesUT6.teclado;

/**
 *
 * @author María Navarro Elbal
 */
public class Ejercicio1Juez {
 static Scanner teclado;

    //Método estático para mostrar los valores de una matriz
    static void mostrarMatriz(int m[][]) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }

            System.out.println("");
        }
    }

    static void leerMatriz(int m[][]) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = teclado.nextInt();
            }

        }
    }

    static void sumaMatrices(int suma[][], int m1[][], int m2[][]) {
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                suma[i][j] = m1[i][j] + m2[i][j];
            }

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         teclado = new Scanner(System.in);
        int matriz[][]= new int [2][2];
        leerMatriz(matriz);
        mostrarMatriz(matriz);
        
    }
    
}
