
import java.util.Scanner;

public class Palindrome {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase, frase1 = "";
        System.out.println("Ingrese una palabra la que quiera");
        frase = teclado.nextLine();
        for (int i = frase.length() - 1; i >= 0; i--) {
            frase1 = frase1 + frase.charAt(i);
        }
        if (frase.equals(frase1)) {
            System.out.println("esta palabra es palindroma");
        }
        else {
            System.out.println("no es palaindroma");
        }
    }
}

