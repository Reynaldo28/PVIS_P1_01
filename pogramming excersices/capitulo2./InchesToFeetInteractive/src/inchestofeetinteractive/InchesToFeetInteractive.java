/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inchestofeetinteractive;

import java.util.Scanner;

/**
 *
 * @author reynaldoaros
 */
public class InchesToFeetInteractive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("ingresa un 1 si quieres convertir pies a pulgadas o un 2 si es lo contrario");
        int elec = teclado.nextInt();
       
        
        
        
        if (elec == 1){
            System.out.println("ingresa los pies que quieres convertir ");
            int pies = teclado.nextInt();
            int conver = pies * 12;
            
            System.out.println("estos son sus pies convertidos a" +" "+ conver +"  "+"pulgadas");
        }
        
        
        
        else {
            System.out.println("ingresa las pulgadas que quieres convertir");
            double pulgadas=teclado.nextInt();
            double conver =  (pulgadas * .08);
            System.out.println(" estas son sus pulgadas convertidas a "+" "+conver+" "+"pies");
        }
        
        
        
        
    }
    
}
