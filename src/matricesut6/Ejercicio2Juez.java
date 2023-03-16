/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matricesut6;

import java.util.Scanner;

/**
 *
 * @author María Navarro Elbal
 */
public class Ejercicio2Juez {
    static Scanner teclado = new Scanner(System.in);
    
    //Método estático para mostrar los valores de una matriz
    //0:todos, 1:impares, 2:pares
    static void mostrarMatriz(int m[][], int opcion)
    {
       //Todos 
       if (opcion == 0)
       {
            for(int i=0; i<m.length; i++)
            {
                for(int j=0; j<m[i].length; j++)
                {
                    System.out.print(m[i][j] + " ");
                }  

                System.out.println("");
            }
       } 
       
       //Impares
       if (opcion == 1)
       {
            for(int i=1; i<m.length; i=i+2)
            {
                for(int j=0; j<m[i].length; j++)
                {
                    System.out.print(m[i][j] + " ");
                }  

                System.out.println("");
            }
       }   
       
       //Pares
       if (opcion == 2)
       {
            for(int i=0; i<m.length; i=i+2)
            {
                for(int j=0; j<m[i].length; j++)
                {
                    System.out.print(m[i][j] + " ");
                }  

                System.out.println("");
            }
       }
        
        
    } 
    
    static void leerMatriz(int m[][])
    {
        for(int i=0; i<m.length; i++)
        {
            for(int j=0; j<m[i].length; j++)
            {
                m[i][j] = teclado.nextInt();
            }  
            
        }
    }  
    
    public static void main(String[] args) 
    {
        int m[][] = new int[4][2];
        
        teclado = new Scanner(System.in);
        
        int opcion = teclado.nextInt();
        
        leerMatriz(m);
        mostrarMatriz(m,opcion);
    }
    
}
