/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores;

import java.util.Scanner;

/**
 *
 * @author katya
 */
public class VECTOR {
    
    private int N;//tamaño del vector
    private int V[];//vector de numeros enteros
    private int i;//subindice del vector
    
    void leerDimension()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la dimensión del vector...");
        N=sc.nextInt();
        V=new int[N];
    }
    
    
    void leerDatos()
    {
        Scanner sc=new Scanner(System.in);
        for(i=0; i<N; i++)
        {
                System.out.print("ingrese elemento ["+i+"]= ");
                V[i]=sc.nextInt();
        }
    }
    
    
    void imprimir()
    {
        System.out.println("\nIMPRIMIENDO VECTOR\n");
        for(i=0;i<N;i++)
        {
            System.out.print(V[i]+",\t");
        }
    }
    
    boolean Buscar(int X)
    {
        boolean encontrado=false;
        
        for(i=0; i<N; i++)
        {
            if (X == V[i])
            {
                encontrado=true;
                break;
            }
        }
        return encontrado;
    }
    
    int hallaMayor()
    {
        int MAY=V[0];
        
        for(i=1;i<N;i++)
        {
            if(MAY<V[i])
            {
                MAY=V[i];
            }
        
        }
        return MAY;
            
    }
    
    void eliminarX(int X)
    {
        int k;
        for(i=0;i<N;i++)
        {
            if(V[i]==X)
            {
                  break;
            }
        
        }
        k=i;
        for(k=i;k<N-1;k++)
        {
            V[k]=V[k+1];
        
        }
        N=N-1;
    
    }
}
