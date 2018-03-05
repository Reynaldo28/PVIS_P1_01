import java.util.Scanner;

public class DigitalCamera {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresa la marca de la camara: ");
        String marc = teclado.next();
        System.out.println("ingrese los pixeles : ");
        Integer pixel = teclado.nextInt();
        TestDigitalCamera pr = new TestDigitalCamera(marc, pixel);
        Integer prec = pr.calcularPrecio();
        System.out.println("El precio de la camara es: " + prec);
        System.out.println(pr);
    }
}