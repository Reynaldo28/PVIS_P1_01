
import java.util.Scanner;

public class CondoSales {
    public static void main(String[]args){
        Scanner teclado =  new Scanner(System.in);
        System.out.println("Eliga la opcion 1 for Park view, 2 for golf course ó 3 for lake views");
        int num = teclado.nextInt();
        if(num == 1){
            System.out.println("Park view condosare $150,000");
        }else if(num == 2){
            System.out.println("Condos with golf course views are $170,000");
        }else if(num == 3){
            System.out.println("Condos with lake views are $210,000");
        }else{
            System.out.println("Invalid number");
        }
    }
}