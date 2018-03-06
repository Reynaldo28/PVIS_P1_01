
import java.util.Scanner;

public class BabyNameComparison {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre1="";
        String nombre2 =" ";
        String nombres = "";
        System.out.println("dame el primer nombre: ");
        nombre1= teclado.nextLine();
        System.out.println("dame  el segundo nombre:");
        nombre2= teclado.nextLine();
        nombres=nombre1+nombre2;
        System.out.println("el nombre que sea posible es: "+nombres);
    }
    
}