import java.util.Scanner;

public class dollars {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        int v = 0;
        int d = 0;
        int c = 0;
        int u = 0;
        int a = 0;
        
        System.out.println("Ingrese una cantidad de dinero entera mayor que 20: ");
        int dol = teclado.nextInt();
        if(dol >= 20){
            v = dol / 20;
            a = dol - (v * 20);
            if(a >= 10){
                d = a / 10;
                a = a - (d * 10);
            }
            if(a > 5){
                c = a / 5;
                a = a - (c * 5);
            }
            if(a >= 1){
                u = a / 1;
                
            }
            
        }
        System.out.println(v + " de veinte " + d + " de diez " + c +" de cinco " + u + " de un dolar");
        
        
    }
}