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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operaciones operaciones = new Operaciones();
        operaciones.MejorProgramador();
        
        int nota = 55;
        operaciones.Aprobacion(nota);
        
        operaciones.Suma(5, 6);
        
        operaciones.ImprimirNumeros(10);
        
        operaciones.RestaMultiplicacion(10, 20, 30);
    }
    
}
