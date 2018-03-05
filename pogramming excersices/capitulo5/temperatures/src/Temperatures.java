
import java.util.Scanner;

public class Temperatures {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresa  la temperatura: ");
        int t = teclado.nextInt();
        if(t >= 90){
            System.out.println("“Heat warning.”");
        }else if(t <= 30){
            System.out.println("“Freeze warning.”");
        }
    }
}