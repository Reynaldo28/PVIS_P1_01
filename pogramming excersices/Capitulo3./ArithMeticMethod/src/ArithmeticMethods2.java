
import java.util.Scanner;

public class ArithmeticMethods2 {
    public static void main(String[]args){
        Scanner teclado = new Scanner (System.in);
        Arit operacion = new Arit();
        System.out.println("ingresa tu numero");
        Integer n = teclado.nextInt();
        operacion.setNum(n);
        Integer re1 = operacion.sumauno();
        Integer re2 = operacion.sumaDos();
        Integer re3 = operacion.sumaTres();
        System.out.println("La suma 1 es: " + re1);
        System.out.println("La suma 2 es: " + re2);
        System.out.println("La suma 3 es: " + re3);
    }
}