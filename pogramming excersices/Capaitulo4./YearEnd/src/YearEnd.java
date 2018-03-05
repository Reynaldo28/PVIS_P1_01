import java.util.Scanner;

public class YearEnd {
   public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       Integer op,op2;
       System.out.println("ingresa el dia");
        Integer dd=scan.nextInt();
        System.out.println("ingresa  el mes");
        Integer m=scan.nextInt();
        switch (m){
            case 1: op=365-dd;
                 System.out.println("Dias restantes del año"+op);
                
            case 2: op=31+dd;
                    op2=365-op;
                    System.out.println("Dias restantes del año"+op2);
                    break;
                  
            case 3:   
                op=59+dd;
                    op2=365-op;
                    System.out.println("Dias restantes del año"+op2); 
                    break;
            case 4:   
                op=90+dd;
                    op2=365-op;
                    System.out.println("Dias restantes del año"+op2); 
                    break;
            case 5:  op=120+dd;
                    op2=365-op;
                    System.out.println("Dias restantes del año"+op2); 
                    break;
                
            case 6:   
                op=151+dd;
                    op2=365-op;
                    System.out.println("Dias restantes del año"+op2);
                    break;
            case 7:  
                op=181+dd;
                    op2=365-op;
                    System.out.println("Dias restantes del año"+op2);
                    break;
            case 8:  
                op=151+dd;
                    op2=365-op;
                    System.out.println("Dias restantes del año"+op2);
                    break;
            case 9:    op=212+dd;
                    op2=365-op;
                    System.out.println("Dias restantes del año"+op2);
                    break;
            case 10:
                op=243+dd;
                    op2=365-op;
                    System.out.println("Dias restantes del año"+op2);
                    break;
            case 11:  
                op=273+dd;
                    op2=365-op;
                    System.out.println("Dias restantes del año"+op2);
                    break;
            case 12:op=304+dd;
                    op2=365-op;
                    System.out.println("Dias restantes del año"+op2);
                    break;
                
                
                
   } 
        
    }
}