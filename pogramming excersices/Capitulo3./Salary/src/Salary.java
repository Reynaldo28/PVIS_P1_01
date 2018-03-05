import java.util.Scanner;

public class Salary {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        Sa salario = new Sa();
        System.out.println("ingresa el saldo por  cada hora: ");
        Double sal = teclado.nextDouble();
        System.out.println(" ingresa cuantas horas normales son las que trabajó?: ");
        Double hn = teclado.nextDouble();
        System.out.println(" ingresa  cuantas horas  extras son las que trabajo trabajó?: ");
        Double hes = teclado.nextDouble();
        salario.setP(sal);
        salario.setH(hn);
        salario.setHe(hes);
        Double pago1 = salario.pago();
        Double pago2 = salario.pago2();
        System.out.println(" su sdalario   normal es : " + pago1);
        System.out.println(" su salario  extra  es : " + pago2);
    }
}