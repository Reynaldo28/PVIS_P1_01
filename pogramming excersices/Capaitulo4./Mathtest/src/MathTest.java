
import java.util.Random;

public class MathTest {
    public static void main (String[] args){
        Random n=new Random();
        Integer nu =n.nextInt(21);
        Matha m= new Matha(37.0,300.0, 300.0,22.8,'D',nu);
        m.getD();
        m.getPiso();
         m.getRaiz();
         m.getSeco();
         m.getN();
         System.out.println(m);
    }
}  
