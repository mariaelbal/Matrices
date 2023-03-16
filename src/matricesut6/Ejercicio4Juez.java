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
public class Ejercicio4Juez {
    static Scanner teclado;
    
    static void leerMatriz(int m[][])
    {
        teclado = new Scanner(System.in);
        
        for(int i=0; i<m.length; i++)
        {
            for(int j=0; j<m[i].length; j++)
            {
                m[i][j] = teclado.nextInt();
            }  
            
        }
    }
    
    //Método estático para mostrar los valores de una matriz
    static void mostrarDiagonalPrincipal(int m[][])
    {
       for(int i=0; i<m.length; i++)
        {
            for(int j=0; j<m[i].length; j++)
            {
                if (i == j)
                    System.out.print(m[i][j]);
            }  
            
            System.out.println("");
        } 
    }
    
    public static void main(String[] args) 
    {
        int m[][] = new int[2][2];
        
        leerMatriz(m);     
        
        mostrarDiagonalPrincipal(m);
    }
}
