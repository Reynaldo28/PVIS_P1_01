
import java.util.Scanner;

public class Circle {
   Double radio;
   public Double getRadio(){
       return radio;
   }
   public void setRadio(Double r){
       radio=r;
   }
   public Double operacion1(){
       Double diametro = radio*2;
       return diametro;
   }
   public Double operacion3(){
       Double area = (Math.PI*Math.pow(radio,2));
       return area;
   }
   public static void main(String[] args){
       Scanner entrada = new Scanner(System.in);
       Circle x = new Circle();
       System.out.println("InTRODUCE el radio: ");
       x.setRadio(entrada.nextDouble());
       System.out.println("El diametro e: "+x.operacion1());
       System.out.println("El area : "+x.operacion3());
   }
}