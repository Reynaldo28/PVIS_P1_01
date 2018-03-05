import java.util.Scanner;

public class Insurance {
    public static void main(String[]args){
        Ins ed = new Ins();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa tu edad: ");
        Integer e = teclado.nextInt();
        ed.setEdad(e);
        Integer monto = ed.mensualidad();
        System.out.println("el dinero que tienes  es: " + monto + "$");
    }
}