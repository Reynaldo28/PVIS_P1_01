import java.util.ArrayList;
import java.util.Scanner;
public class CountMatches {
    public static void main(String []args){
        Scanner teclado = new Scanner(System.in);
        String p = " ";
        String s = " ";
        System.out.println("Escribe una palabra:  ");
        p = teclado.next();
        System.out.println("Escribe otra palabra:  ");
        s = teclado.next();
        char primera_p;
        char segunda_p;
        for(int i = 0; i < p.length();i++){
            primera_p = p.charAt(i);
            for (int j = 0; j < s.length();j++){
                segunda_p = s.charAt(i);
                if (primera_p == segunda_p)
                System.out.println("Los caracteres en  " + p + " que aparecen en " + s + " Son " + primera_p);
            }
        }
        
    }
}
       