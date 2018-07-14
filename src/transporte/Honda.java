/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package transporte;

/**
 *
 * @author aamaldonado
 */
public class Honda extends Vehiculo {
    
    public Honda()
    {
        Marca = "Honda";
        Modelo = "Civic";
        Motor = "2.0";
        
        ImprimirMarca();
        ImprimirModelo();
        ImprimirMotor();
    }
}
