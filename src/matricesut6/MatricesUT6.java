/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matricesut6;

import java.util.Scanner;

public class MatricesUT6 {

    static Scanner teclado;

    //Método estático para mostrar los valores de una matriz
    static void mostrarMatriz(int m[][], int opcion) {
        if (opcion == 0) {
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    System.out.print(m[i][j] + " ");
                }

                System.out.println("");
            }
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

    public static void main(String[] args) {
        int matriz[][] = new int[2][2];
        int matriz2[][] = new int[2][2];
        int matriz3[][] = new int[2][2];

        teclado = new Scanner(System.in);
        leerMatriz(matriz);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        
//        for (int j = 0; j < matriz[0].length; j++) {
//            for (int i = 0; i < matriz.length; i++) {
//
//                System.out.print(matriz[i][j]);
//            }
//            System.out.println("");
//        }

//        
//        int opcion = teclado.nextInt();
//        mostrarMatriz(matriz,opcion);
//        //Asignación de valores manualmente
//        matriz[0][0] = 1;
//        matriz[0][1] = 0;
//        matriz[1][0] = 0;
//        matriz[1][1] = 1;
//
//        //Mostrando una matriz
//       mostrarMatriz(matriz);
//
//      for (int i=0; i<matriz.length;i++){
//            for(int j=0; j<matriz[i].length;j++){
//                System.out.print(matriz[i][j]+" ");
//            }
//            System.out.println("");
//        }
//      
//        System.out.println("");
        //Asignación de valores automáticamente
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz[i].length; j++) {
//                matriz[i][j] = i + j;
//            }
//
//        }
//        for (int i=0; i<matriz.length;i++){
//            for(int j=0; j<matriz[i].length;j++){
//                System.out.print(matriz[i][j]+" ");
//            }
//            System.out.println("");
//        }
        /*   
        //Mostrando una matriz
        mostrarMatriz(matriz);
         */
        //Leer los valores de la matriz de la entrada estándar
//        for(int i=0; i<matriz.length; i++)
//        {
//            for(int j=0; j<matriz[i].length; j++)
//            {
//                matriz[i][j] = teclado.nextInt();
//            }  
//            
//        } 
//        leerMatriz(matriz);
//        
//        //Mostrando una matriz
//        mostrarMatriz(matriz);
        /*
        //Buscar el mayor y menor valor dentro de una matriz
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int pares = 0, impares=0;
        
        for(int i=0; i<matriz.length; i++)
        {
            for(int j=0; j<matriz[i].length; j++)
            {
               //Compruebo si el un valor de la matriz es mayor que el MAX 
               if (matriz[i][j] > max)
                   max = matriz[i][j];
               
               //Compruebo si un valor de la matriz es menor que el MAX
               if (matriz[i][j] < min)
                   min = matriz[i][j];
               
               if ((matriz[i][j] % 2) == 0)
                   pares++;
               else
                   impares++;
            }  
            
        }
        
        System.out.println("El mayor es: " + max);
        System.out.println("El menor es: " + min);
        System.out.println("Números pares: " + pares);
        System.out.println("Números impares: " + impares);
 
        System.out.println("");
        System.out.println("");
        
        //Leer valores para matriz
        System.out.println("Matriz");
        leerMatriz(matriz);
           mostrarMatriz(matriz);
        /*   System.out.println("");
        
        //Leer valores para matriz2
        System.out.println("Matriz2");
        leerMatriz(matriz2);
        mostrarMatriz(matriz2);
        System.out.println("");
        
        //Sumamos matriz y matriz2, y lo guardamos en matriz3
        System.out.println("Matriz3 - Suma");
        sumaMatrices(matriz3, matriz, matriz2);
        mostrarMatriz(matriz3);
        System.out.println("");*/
    }
}
