/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matricesut6;

import java.util.Scanner;

/**
 *
 * @author lucasjosemoraleschacon
 */
public class MatricesObjetos 
{
    public static void main(String[] args) 
    {
        Scanner teclado  = new Scanner(System.in);
        Punto2D m[][] = new Punto2D[2][2];
        
//        m[0][0] = new Punto2D();
//        m[0][1] = new Punto2D(2,0);
//        m[1][0] = new Punto2D(0,-1);
//        m[1][1] = new Punto2D(2,-1);
        


       for (int i = 0; i< m.length; i++){
            for (int j = 0; j< m[i].length; j++){
                m[i][j]= new Punto2D(teclado.nextInt(),teclado.nextInt());
           }
      }
//        
//        //¿Cuál es la base del rectángulo? La distancia de m[1][0] a m[1][1]
//        System.out.printf("Base = %.2f\n",m[1][0].distancia(m[1][1]));
//
//        //¿Cuál es altura del rectángulo? La distancia de m[0][0] a m[1][0]
//        System.out.printf("Altura = %.2f\n",m[0][0].distancia(m[1][0]));
        
    }
    
}
