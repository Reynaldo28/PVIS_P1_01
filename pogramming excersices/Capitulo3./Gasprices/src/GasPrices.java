
import java.util.Scanner;

public class GasPrices {
    public static void main(String[]args){
      Scanner teclado = new Scanner(System.in);
      Price p = new Price(); 
      System.out.println("ingresa un precio el que quieras : ");
      Double pr = teclado.nextDouble();
      p.setA(pr);
      Double re = p.calcularPrecio1();
      Double r2 = p.calcularPrecio2();
      System.out.println("El  precio por un galón esta  es: " + re + " y " + r2);
      
      
    }
}