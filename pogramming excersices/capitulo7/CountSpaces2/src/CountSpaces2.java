import java.util.Scanner;
public class CountSpaces2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("deme una frase:  ");
        String MyString = teclado.nextLine();
        char[] MiCadena =  MyString.toCharArray();
        int n = 0;
        for (int i = 0 ; i < MiCadena.length; i++){
            if (MiCadena[i] == ' '){
                n++;
                
            }               
        }
        System.out.println(" esta frase tiene" +" "+ n + " " + " espacios ");
        
    }
}