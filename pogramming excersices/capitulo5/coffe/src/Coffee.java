
import java.util.Scanner;

public class Coffee {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("(1.American     $1.99");
        System.out.println("(2.Espresso     $2.50");
        System.out.println("(3.Latte        $2.15");
        double i = 0;
       
        int n = 0;
        do{
            System.out.println("ingrese  la opción que deseas: ");
            n = teclado.nextInt();
            if(n == 1){
                System.out.println("cuesta  $1.99");
                i = i + 1.99;
            }else if(n == 2){
                System.out.println("cuesta  $2.50");
                i = i + 2.50;
            }else if(n == 3){
                System.out.println("cuesta  $2.15");
                i = i + 2.15;
            }
        }while(n != 0);
        System.out.println("El costo total es de $" + i);
    }
}