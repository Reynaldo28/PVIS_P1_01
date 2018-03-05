
package hello.world;

import java.util.Scanner;


public class HELLOWORLD {

 
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
