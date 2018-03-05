import java.util.Scanner;

public class EvenOdd {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresa un numero: ");
        Integer num = teclado.nextInt();
        if(num % 2 == 0){
            System.out.println("este número es par ");
        }else{
            System.out.println("este número es impar");
        }
    }
}