import java.util.Scanner;

public class DogBoarding {
    public static void main(String[]args){
        double t = 0;
        double tt = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa cuantas libras pesa tu perro: ");
        int peso = teclado.nextInt();
        System.out.println("Cuántos días estara?");
        int d = teclado.nextInt();
        t = peso * .50;
        tt = t * d;
        System.out.println("El precio de la estancia es: " + tt);
    }
}