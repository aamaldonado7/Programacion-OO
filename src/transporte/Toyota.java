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
public class Toyota extends Vehiculo {
    public Toyota()
    {
        Marca = "Toyota";
        Modelo = "Prado";
        Motor = "4.0";
        ImprimirMarca();
        ImprimirModelo();
        ImprimirMotor();
    }
}
