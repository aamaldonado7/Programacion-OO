/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package principal;

/**
 *
 * @author rcastellanos
 */
public class Operaciones 
{
    public void MejorProgramador()
    {
        System.out.println("Soy el mejor programador");
    }
    
    public void Aprobacion(int nota)
    {
        if(nota >= 70)
        {
            System.out.println("Aprobado");
        }
        else
        {
            System.out.println("Reprobado");
        }
    }
    
    public void Suma(int a, int b)
    {
        int total = a +b;
        String resultado = String.format("%1$d + %2$d = %3$d",a ,b ,total);
        System.out.println(resultado);
    }
    
    public void ImprimirNumeros(int n)
    {
          for(int x = 1; x <= n; x++)
      {
        System.out.println(x);
      }
    }
    
    public void RestaMultiplicacion(long a, long b, long c)
    {
        long total = a - b * c;
        
        String resultado = String.format("%1$d - %2$d * %3$d = %4$d ",a ,b ,c ,total);
        System.out.println(resultado);
    }
}
