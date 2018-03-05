import java.util.Scanner;

public class Letter {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("dame el apellido: ");
        String ape = scan.next();
        System.out.println("ahora el nombre: ");
        String nombre = scan.next();
        FormLetterWriter f= new FormLetterWriter(ape,nombre);
        System.out.println(f);
        
    }
}
