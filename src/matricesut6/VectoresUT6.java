package matricesut6;

public class VectoresUT6 
{       
    public static void main(String[] args) 
    {
        //Declaramos un vector de elementos --> Punto2D
        Punto2D v[];
        
        
        //Fase 1. Reserva del espacio para los 5 elementos de tipo Punto2D
        v = new Punto2D[5];
        
        //Fase 2. Inicializar uno a uno, todos los objetos de tipo Punto2D
        for(int i = 0; i<v.length; i++)
        {
            v[i] = new Punto2D(i,i);
        }
        
        //Mostrar todos los objetos de tipo Punto2D
        for(int i = 0; i<v.length; i++)
        {
            System.out.printf("v[%d] = %s\n", i, v[i]);
        }
        
        System.out.println("");
        
        //Mostrar el valor x de todos los objetos de tipo Punto2D
        for(int i = 0; i<v.length; i++)
        {
            System.out.printf("v[%d].getX() = %d\n", i, v[i].getX());
        }
        
        System.out.println("");
        
        //Modificar el valor y de todos los objetos de tipo Punto2D
        for(int i = 0; i<v.length; i++)
        {
            v[i].setY(i+1);
            System.out.printf("v[%d].setY(%d)\n", i, i+1);
        }
        
        //System.out.println("");
        
        //Mostrar todos los objetos de tipo Punto2D
        for(int i = 0; i<v.length; i++)
        {
            System.out.printf("v[%d] = %s\n", i, v[i]);
        }
        
        System.out.println("");
        
        //Comparar todos los elementos de tipo Punto2D
        for(int i = 0; i<=v.length-2; i++)
        {
            for(int j=i+1;j<=v.length-1; j++)
            {
                if (v[i].equals(v[j]))
                {
                    System.out.printf("v[%d] es igual a v[%d]\n",i,j);
                }    
                else
                {
                    System.out.printf("v[%d] NO es igual a v[%d]\n",i,j);
                }
                
            }    
               
        }
        
        System.out.println("");
        
        //Distancia entre todos los elementos de tipo Punto2D
        for(int i = 0; i<=v.length-2; i++)
        {
            for(int j=i+1;j<=v.length-1; j++)
            {         
                int x1,x2,y1,y2;
                
                x1 = v[i].getX();
                y1 = v[i].getY();
                
                x2 = v[j].getX();
                y2 = v[j].getY();
                
                
                double distancia = v[i].distancia(v[j]);
                System.out.printf("La distancia entre (%d,%d) y (%d,%d) es: %f\n",x1,y1,x2,y2,distancia);
            }    
               
        }
        
        
        
        
        
        
        
    }
    
}
