
package milestofeetInteractive;

import java.util.Scanner;


public class MillesToFeetInteractive {

    public static void main(String[] args) {
        
        
        
        double milla = 0.000189394;
        double distancia;
        double Pies =5280;
        Scanner teclado = new Scanner (System.in);
        System.out.println("ingresa la distancia a la que esta la casa de tu tio ");
        distancia = teclado.nextInt();
        System.out.println("ingrese un 1 si son pies o un 2 si son millas");
        int sistem = teclado.nextInt();
        
        
        
        
        if (sistem ==1 ){
            distancia = distancia * milla;
            System.out.println("La distancia  a la casa de su tio es de "+" "+distancia+" "+"millas");
       }
        
        
         else {
            distancia = distancia * Pies;
            
            System.out.println("La distancia a la casa de su tio esta"+" "+distancia+ " "+ "pies");
            
        }
       
    }
           
}
    

