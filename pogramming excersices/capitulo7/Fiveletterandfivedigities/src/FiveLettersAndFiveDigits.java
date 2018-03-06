import java.util.Scanner;
public class FiveLettersAndFiveDigits {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresa  una palabra con 5 letras:  ");
        String p = teclado.next();
        char[]pl = p.toCharArray();
        if(pl.length<=5){
            System.out.println("muy bien");
            
        }
        else{
            System.out.println("te dije 5 tonto");
        }
        
      
    }}
