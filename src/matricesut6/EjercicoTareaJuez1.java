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
public class EjercicoTareaJuez1 {
    public static void main(String[] args) 
    {
        int numF;
        Scanner teclado = new Scanner(System.in);
        Fraccion f[];
        Fraccion fAux;
        int n,d;
        
        //Leemos el número de fracciones
        numF = teclado.nextInt();
        
        
        f= new Fraccion[numF];
        
        //Leemos los numF números y generamos las numF fracciones
        for(int i=0; i<numF; i++)
        {
            fAux = new Fraccion(teclado.nextInt(), teclado.nextInt());
            f[i] = fAux;
        }    

        //Realizamos la suma de las 3 fracciones
        fAux = f[0].suma(f[1]);
        for(int i=2; i<numF; i++)
        {
            fAux = fAux.suma(f[i]);
        }    
        
        System.out.println("Suma: " + fAux);
        
        //Realizamos la multiplicación de las 3 fracciones
        fAux = f[0].multiplicacion(f[1]);
        for(int i=2; i<numF; i++)
        {
            fAux = fAux.multiplicacion(f[i]);
        }    
        
        System.out.println("Multiplicacion: " + fAux);
        
    }
    
}
class Fraccion 
{
    /* Atributos */
    
    private int num;
    private int denom;
    
    /* Constructores */

    public Fraccion(int num, int denom) 
    {
        this.num = num;
        this.denom = denom;
    }

    public Fraccion(Fraccion f) 
    {
        this.num = f.num;
        this.denom = f.denom;
    }
    
    /* Métodos */
    
    
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDenom() {
        return denom;
    }

    public void setDenom(int denom) {
        this.denom = denom;
    }
    
    
    @Override
    public String toString() 
    {
        if ((num % denom) == 0)
        {
            int x = this.num/this.denom;
            return "" + x;
        }
        else
        {
            simplificar();
            return num + "/" + denom;
        }    
        
    }

    @Override
    public int hashCode() 
    {
        int hash = 5;
        hash = 59 * hash + this.num;
        hash = 59 * hash + this.denom;
        return hash;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) 
        {
            return true;
        }
        
        if (obj == null) 
        {
            return false;
        }
        
        if (getClass() != obj.getClass()) 
        {
            return false;
        }
        
        final Fraccion other = (Fraccion) obj;
        
        //Se simplifican por si son la misma con diferentes números
        this.simplificar();
        other.simplificar();
        
        if (this.num != other.num) 
        {
            return false;
        }
        
        if (this.denom != other.denom) 
        {
            return false;
        }
        
        return true;
    }
    
    public Fraccion multiplicacion(Fraccion f)
    {
       
        int auxNum, auxDenom;
       
        
        auxNum = this.num*f.num;
        auxDenom = this.denom*f.denom;
        
        
        return new Fraccion(auxNum,auxDenom);
    }
    
    public Fraccion division(Fraccion f)
    {
        int auxNum, auxDenom;
         
        auxNum = this.num*f.denom;
        auxDenom = this.denom*f.num;
        
        
        return new Fraccion(auxNum,auxDenom);
    }
   
    public Fraccion suma(Fraccion f)
    {
       
        int auxNum, auxDenom;
       
        
        auxNum = this.num*f.denom + this.denom*f.num;
        auxDenom = this.denom*f.denom;
        
        
        return new Fraccion(auxNum,auxDenom);
             
    }
   
    public Fraccion resta(Fraccion f)
    {
       
        int auxNum, auxDenom;
       
        
        auxNum = this.num*f.denom - this.denom*f.num;
        auxDenom = this.denom*f.denom;
        
        
        return new Fraccion(auxNum,auxDenom);    
    }
     
   private void simplificar()
   {
        //Buscamos el MCD
        int mcd = mcd(num, denom);

        mcd = Math.abs(mcd);

        num = num / mcd;
        denom = denom / mcd;

    }        
    
    private static int mcd(int x, int y)
    {
        int a = Math.max(x,y);
        int b = Math.min(x,y);

        int resultado = 0;
        
        do 
        {
            resultado = b;
            b = a % b;
            a = resultado;
            
        }while (b != 0);

        return resultado;
        
    } 
    
    

}
