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
public class Nissan extends Vehiculo {
    public Nissan()
    {
        Marca = "Nissan";
        Modelo = "Sentra";
        Motor = "1.8";
        ImprimirMarca();
        ImprimirModelo();
        ImprimirMotor();
    }
}
