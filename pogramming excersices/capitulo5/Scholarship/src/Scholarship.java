import java.util.Scanner;

public class Scholarship {
   public static void main(String[]args){
       Scanner teclado = new Scanner(System.in);
       System.out.println("introdusca el promedio: ");
       double p = teclado.nextDouble();
       System.out.println("introdusca cuantas actividades extra realizo: ");
       int a = teclado.nextInt();
       System.out.println("las actividades de servicio: ");
       int s = teclado.nextInt();
       if((p >= 3.8)&&(a >= 1)&&(s >= 1)){
           System.out.println("candidato");
       }else if((p < 3.8)&&(p > 3.4)&&(a >= 3)&&(s >= 3)){
           System.out.println("candidato");
       }else if((p < 3.4)&&(p > 3.0)&&(a >= 2)&&(s >= 3)){
           System.out.println("candiadto");
       }else{
           System.out.println("lo siento no estas para candidato");
       }
   } 
}