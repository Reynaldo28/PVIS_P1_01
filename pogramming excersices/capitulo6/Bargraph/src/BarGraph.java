import java.util.Scanner;

public class BarGraph {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        String x = "x";
        //String x2 = " ";
        System.out.println("ingrese cuantos autos vendió Pam? ");
        int a1 = teclado.nextInt();
        System.out.println("ingrese cuantos autos vendió Leo? ");
        int a2 = teclado.nextInt();
        System.out.println("ingrese cuantos autos vendió Kim? ");
        int a3 = teclado.nextInt();
        System.out.println("ingrese cuantos autos vendió Bob? ");
        int a4 = teclado.nextInt();
        System.out.println("Pam vendió: ");
        for (int i = 0; i < a1; i++) {
            System.out.print(x);
        }
        System.out.println("\nLeo vendió: ");
        for (int i = 0; i < a2; i++) {
            System.out.print(x);
        }
        System.out.println("\nKim vendió: ");
        for (int i = 0; i < a3; i++) {
            System.out.print(x);
        }
        System.out.println("\nBob vendió: ");
        for (int i = 0; i < a4; i++) {
            System.out.print(x);
        }
    }
}