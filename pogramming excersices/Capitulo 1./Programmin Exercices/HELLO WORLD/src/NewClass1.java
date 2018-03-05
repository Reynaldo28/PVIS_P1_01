
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author reynaldoaros
 */
public class NewClass1 {
    public static void main(String[] args) {
         Scanner teclado= new Scanner(System.in);
      String nombre;
      String apellido;
      
    System.out.println("dame tu nombre o nombres");
         nombre= teclado.nextLine();
         System.out.println("Dame tus apellidos ");
         apellido= teclado.nextLine();
         System.out.println (nombre +  apellido);

        
}
}