/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import hello.world.Sccaner;

/**
 *
 * @author reynaldoaros
 */
public class NewClass {
    public static void main(String[] args) {
        Sccaner teclado = new Sccaner(System.in);
        String nombre;
        String apellido;
        
        
    
    System.out.println("Dame tu nombre o nombres");
    nombre= teclado.nextLine();
    System.out.println("Dame tus apellidos");
    apellido= teclado.nextLine();
    System.out.println(nombre  +   apellido);
}
}