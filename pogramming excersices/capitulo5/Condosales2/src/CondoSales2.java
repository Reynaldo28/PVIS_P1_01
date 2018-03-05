
import java.util.Scanner;

public class CondoSales2 {
    public static void main(String[]args){
        Scanner teclado =  new Scanner(System.in);
        System.out.println("Escoja la opción 1 for Park view, 2 for golf course ó 3 for lake views: ");
        int num = teclado.nextInt();
        if(num < 4){
            System.out.println("Esoja la opción 1 para garage o 2 para parking space: ");
            int op = teclado.nextInt();
            if((num == 1)&&(op == 1)){
                System.out.println("Park view condosare $155,000");
            }else if((num == 1)&&(op == 2)){
                System.out.println("Park view condosare $155,000");
            }else if((num == 2)&&(op == 1)){
                System.out.println("Condo with golf course $175,000");
            }else if((num == 2)&&(op == 2)){
                System.out.println("Condo with golf course $175,000");
            }else if((num == 3)&&(op == 1)){
                System.out.println("Condo with lake views $215,000");
            }else if((num == 3)&&(op == 2)){
                System.out.println("Condo with lake views $215,000");
            }else{
                System.out.println("Opción no sirve");
            }
        }
    }
}