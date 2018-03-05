
import java.util.Scanner;

public class eggs {
  public static void main(String[]aargs){
      Scanner teclado = new Scanner(System.in);
      int d = 0;
      double d2 = 0;
      double rs = 0;
      double t = 0;
      System.out.println("ingrese los huevos que compro?");
      int huevo = teclado.nextInt();
      int s = huevo % 12;
      if(huevo > 12){
          d = huevo / 12;
          if(s != 0){
              rs = s * .45;
          }
          d2 = d * 3.25;
          t = d2 + rs;
      }else{
          t = huevo * 3.25;
      }
      System.out.println(" usted pidio " + huevo +" huevos las cuales son  " + d +" docenas \ncada docena esta a $3.25  \n "+ s +" huevos sueltos estan a 45.0 centavos por cada uno \n  en total usteded debe " + t);
  }   
}