/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases03;

/**
 *
 * @author reroes
 */
public class Ejecutable02 {
    
    public static void main(String[] args) {
    
        Hospital h1 = new Hospital();
        Hospital h2 = new Hospital();
        Hospital h3 = new Hospital();
        
        h1.establecerNombre("Vaca Ortíz");
        h2.establecerNombre("Isidor Ayora");
        h3.establecerNombre("SusbCentro Catacocha");
        
        System.out.printf("%s\n", h1.obtenerNombre());        
        h1.establecerNombre("Hospital Vaca Ortíz");
        System.out.printf("%s\n", h1.obtenerNombre());
        
        System.out.println("");
        
        System.out.printf("%s\n", h2.obtenerNombre());        
        h2.establecerNombre("Hospital Isidro Ayora");
        System.out.printf("%s\n", h2.obtenerNombre());
        
        System.out.println("");
        
        System.out.printf("%s\n", h3.obtenerNombre());        
        h3.establecerNombre("Hospital SusCentro Catacocha");
        System.out.printf("%s\n", h3.obtenerNombre());
    }
}
