/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matricesut6;

/**
 * Esta clase representa un punto en dos dimensiones.
 * @author Lucas
 */
public class Punto2D 
{
    /** ATRIBUTOS  (x,y)**/
    private int x; // public, protected, private, ""
    private int y;
    
    /** MÉTODOS **/ 
    
    /* Constructores */
    
    //Constructor por defecto
    public Punto2D()
    {
        x=0;
        y=0;
    }        
    
    //Constructor con parámetros
    public Punto2D(int x, int y)
    {
        this.x=x;
        this.y=y;
    }        
    
    //Constructor de copia --> Clone
    public Punto2D(Punto2D p)
    {
        this.x=p.x;
        this.y=p.y;
    }        
    
    /* Getters and Setters */
    
    public int getX()
    {
        return x;
    }        

    public int getY() 
    {
        return y;
    }
    
    public void setX(int x)
    {
        this.x = x;
    }        

    public void setY(int y) 
    {
        this.y = y;
    }
    
    /* toString() */

    @Override
    public String toString() 
    {
        return "Punto2D{" + "x=" + x + ", y=" + y + '}';
    }
    
    /* equals */

    @Override
    public int hashCode() 
    {
        int hash = 3;
        
        hash = 71 * hash + this.x;
        hash = 71 * hash + this.y;
        
        return hash;
    }

    @Override
    public boolean equals(Object obj) 
    {
        //Comparamos si this y obj apuntan a la misma zona de memoria
        if (this == obj) 
        {
            return true;

        }
        
        //Comprobamos si obj es nulo, como this no lo es, no pueden ser iguales
        if (obj == null) 
        {
            return false;
        }
        
        //Comprobamos si son de la misma clase
        if (this.getClass() != obj.getClass()) 
        {
            return false;
        }

        final Punto2D other = (Punto2D) obj;
        
        //Comparamos el primer atributo
        if (this.x != other.x) 
        {
            return false;
        }
        
        //Comparamos el segundo atributo
        if (this.y != other.y) 
        {
            return false;
        }
        
        //Si llegamos aquí, es porque son iguales
        return true;
    }
    
    /* Otros métodos */
    public double distancia(Punto2D p) //h^2 = c1^2 + c2^2;
    {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }        
    
    
    
}
