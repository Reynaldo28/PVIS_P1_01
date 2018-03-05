
import java.util.Scanner;

public class Percentages2 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        ComputePercent p = new ComputePercent();
        System.out.println("ingresa tus porcentajes");
        Double a1 = teclado.nextDouble();
        Double a2 = teclado.nextDouble();
        p.setA(a1);
        p.setB(a2);
        Double r = p.porcentaje();
        System.out.println("tu  porcentaje es: " + r + "%");
    }
}
