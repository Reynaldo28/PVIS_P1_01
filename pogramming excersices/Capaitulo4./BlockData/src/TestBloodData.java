
import java.util.Scanner;

public class TestBloodData {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Dame tu tipo de sangre ");
        String tip=scan.next();
          System.out.println("dame el factor : ");
        String fact=scan.next();
        BloodData bl = new BloodData(tip,fact);
        System.out.println(bl); 
    }
    
}