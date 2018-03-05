import java.util.Scanner;

public class CollegeCost {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        int edad; 
        float dinero;
        do{
            System.out.println("ingrese  la edad del niño: ");
            edad = teclado.nextInt();
            System.out.println("ingrese cuanto es el  dinero quiere ahorra desde ahora hasta quela niña tenga 18?");
            dinero = teclado.nextFloat();
            int anios = 0;
            float aa = 0;
            if(edad < 18){
               anios = 18 - edad;
               aa = dinero / anios;
                System.out.println(" cada año  ahorraria "+aa);
            }else{
                System.out.println(" intente de nuevo.");
            }
        }while(edad >= 18);
    }
}