
import java.awt.Paint;
import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        Paintp p = new Paintp();
        System.out.println("ingresa la longuitud: ");
        Double lo = teclado.nextDouble();
        System.out.println("ingresa el ancho: ");
        Double an = teclado.nextDouble();
        System.out.println("ingresa la altura: ");
        Double hi = teclado.nextDouble();
        p.setL(lo);
        p.setA(an);
        p.setH(hi);
        Double monto = p.calcularPrecio();
        System.out.println("el precio de todo  es de: " + monto + "$");
    }
}