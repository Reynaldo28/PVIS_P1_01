import java.util.Scanner;

public class NextMonth {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("daame  el dia");
        Integer dd=scan.nextInt();
        
       
        GregorianCalendar g = new GregorianCalendar(dd);
        g.getDia();
      
        System.out.println(g);
        
    }
}