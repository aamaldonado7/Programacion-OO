/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package transporte;

import static java.lang.reflect.Array.set;

/**
 *
 * @author aamaldonado
 */
public class Vehiculo {
    public String Modelo;
    public String Motor;
    public String Marca;
    public String Test;
    
    public void ImprimirMarca()
    {
        System.out.println("La Marca es: "+ Marca);
    }
    
    public void ImprimirMotor()
    {
        System.out.println("El motor es : "+Motor);
    }
    
    public void ImprimirModelo()
    {
        System.out.println("El Modelo es : " + Modelo);
    }
}
